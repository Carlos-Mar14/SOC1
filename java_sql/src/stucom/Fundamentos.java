package stucom;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import entidades.TelMovil;

import java.sql.Connection;
import java.sql.DatabaseMetaData;

public class Fundamentos {
	//Aqui se guardan los moviles que se recuperan de la DB
	private static final int CAPACIDAD = 20;
	
	static TelMovil[] moviles = new TelMovil[CAPACIDAD];
	
	//indice para saber en que posicion del array me encuentro
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
		final String cadenaConexion = "jdbc:" + fabricante + "://" + servidor + ":" + puerto + "/" + db + "?" + opciones;

		try {
			Connection con = DriverManager.getConnection(cadenaConexion, usuario, pwd);

			//Paso 3.A
//			demoMetaData(con);
			
			//Paso 3.B = Ejecutar SQL
			Statement comando = con.createStatement();
			
			final String SQL = "select * from modelos";
			comando.executeQuery(SQL);
			ResultSet res = comando.executeQuery(SQL);
			
			//Mientras quede una fila por visitar...
			while(res.next()) {
				long id = res.getLong("id");
				String marca = res.getString("fabricante");
				String modelo = res.getString("modelo");
				double precio = res.getDouble("precio");
				
				TelMovil telMovil = new TelMovil(id, fabricante, modelo, precio);
				moviles[pos++] = telMovil;
				
				
			}
			
			for (TelMovil mov: moviles)
				System.out.println(mov);
			
			con.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}

		// paso 4.
	}

	private static void demoMetaData(Connection con) throws SQLException {
		// 3. Explorar la DB
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