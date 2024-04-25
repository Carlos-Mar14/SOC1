package stucom;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PruebasSql {

	public static void main(String[] args) throws SQLException {
		/*
		 * String URL =
		 * "jdbc:mysql://localhost:8889/mobil?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC";
		 */
		String URL = "jdbc:postgresql://localhost/mobile";

		/*
		 * String nuevo =
		 * "INSERT INTO cli VALUES('30', 'Carlos', 'AndresAgudelo' , 'Medellin', 'Colombia')"
		 * ;
		 */
		String consulta = "SELECT libros.* \n"
                + "FROM libros \n"
                + "JOIN autorlibro ON libros.CodigoLibro = autorlibro.CodLibro \n"
                + "WHERE autorlibro.CodAutor = ?";

		Connection conexion = DriverManager.getConnection(URL, "postgres", "1111");
		Statement comando = conexion.createStatement();
		ResultSet rs = comando.executeQuery(consulta);

		System.out.println("ID FABRICANTE MODELO PRECIO");
		System.out.println("-------------");
		while (rs.next()) {
			int id = rs.getInt(1);
			String fabricante = rs.getString(2);
			String modelo = rs.getString(3);
			double precio = rs.getDouble(4);
			System.out.println(id + " - " + fabricante + " - " + modelo + " - " + precio);
		}

		comando.close();
		conexion.close();
	}

}
