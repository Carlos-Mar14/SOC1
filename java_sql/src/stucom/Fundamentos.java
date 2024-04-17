package stucom;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.cj.xdevapi.PreparableStatement;

import entidades.TelMovil;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DatabaseMetaData;

public class Fundamentos {
	// Aqui se guardan los moviles que se recuperan de la DB
	private static final int CAPACIDAD = 20;

	static TelMovil[] moviles = new TelMovil[CAPACIDAD];

	// indice para saber en que posicion del array me encuentro
	static int pos;

	public static void main(String[] args) {
		/*
		 * 1. Cargar la clase que representa al controlador (a partir de Java 1.6 ya no
		 * es necesario) R/= El controlador proporcionado por MySQL la clase es
		 * com.mysql.jdbc.Driver (Desactualizado) R/= El controlador proporcionado por
		 * DB2 la clase es COM.ibm.db2.jdbc.app.DB2Driver (Desactualizado)
		 * 
		 * 2. Establecer una conexión. R/= String URL =
		 * "jdbc:mysql://localhost:8889/mobil?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC";
		 * 
		 * 3. Ejecución de sentencias SQL.
		 * 
		 * 4. Obtención de los resultados.
		 * 
		 * 5. Cierre de la conexión.
		 * 
		 */

		cargarMovilesDisco();

		// APso 1: carga del driver:
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		// 2 Establecer conexion con la db
		final String fabricante = "mysql", servidor = "localhost", puerto = "8889";
		final String db = "mobil", usuario = "root", pwd = "root";
		final String opciones = "allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC";
		final String cadenaConexion = "jdbc:" + fabricante + "://" + servidor + ":" + puerto + "/" + db + "?"
				+ opciones;

		try {
			Connection con = DriverManager.getConnection(cadenaConexion, usuario, pwd);

			// Paso 3.A // Obtener informacion de metadata
//			demoMetaData(con);

			// Paso 3.B = Ejecutar SQL
//			Statement comando = con.createStatement();
			PreparedStatement comando = null;

			for (TelMovil movil : moviles) {
				if (movil != null) { 
			        String fab = movil.getFabricante();
			        String mod = movil.getModelo();
			        double precio = movil.getPrecio();
//					String SQL = "insert into modelos values ('" + fab + "','" + mod + "'," + precio + ")";

					String SQL = "insert into modelos values (null, ?,?,?)";
					comando = con.prepareStatement(SQL);

					comando.setString(1, fab);
					comando.setString(2, mod);
					comando.setDouble(3, precio);

					int result = comando.executeUpdate();

					String resultadoPeracion = result == 0 ? "Error en el insert" : "insert ok";
					System.out.println(resultadoPeracion);
				}

			}

			final String SQL = "select * from modelos";
//			comando.executeQuery(SQL);
			ResultSet res = comando.executeQuery(SQL);

			// Mientras quede una fila por visitar...
			while (res.next()) {
				long id = res.getLong("id");
				String marca = res.getString("fabricante");
				String modelo = res.getString("modelo");
				double precio = res.getDouble("precio");

				// Construyo un nuevo telefono
				TelMovil telMovil = new TelMovil(id, marca, modelo, precio);
				// Y lo guardo en este array
				moviles[++pos] = telMovil;

			}

			for (TelMovil mov : moviles)
				System.out.println(mov);

			con.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

	private static void cargarMovilesDisco() {
		// LEER EL FICHERO TELEFONOS.DAT Y CARGAR LOS MOVILES QUE AHI DEFINIDOS
		File fichero = new File("telefonos.dat");
		try (Scanner sc = new Scanner(fichero)) { // Try-with-reources
			String registro = null;
			do {
				registro = sc.nextLine();
				TelMovil movil = procesarRegistrar(registro);
				moviles[pos++] = movil;

			} while (sc.hasNextLine());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	private static TelMovil procesarRegistrar(String registro) {
		String[] campos = registro.split("\\^");
		String marca = campos[0];
		String momdelo = campos[1];
		double precio = Double.parseDouble(campos[2]);
		return new TelMovil(marca, momdelo, precio);
	}

	private static void demoMetaData(Connection con) throws SQLException {
		// 4. Explorar la DB
		DatabaseMetaData databaseMetaData = con.getMetaData();
		String productName = databaseMetaData.getDatabaseProductName();
		String productVersion = databaseMetaData.getDatabaseProductVersion();

		System.out.println(productName);
		System.out.println(productVersion);
		ResultSet catalogos = databaseMetaData.getCatalogs();

		while (catalogos.next()) {
			System.out.println(catalogos.getString(1));
		}
	}

}