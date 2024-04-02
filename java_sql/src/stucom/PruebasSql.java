package stucom;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PruebasSql {

	public static void main(String[] args) throws SQLException {
		String URL = "jdbc:mysql://172.28.0.191:3306/video?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC";
		
		String nuevo = "INSERT INTO cli VALUES('30', 'Carlos', 'AndresAgudelo' , 'Medellin', 'Colombia')";
		String consulta = "SELECT * FROM peliculas";
		
		Connection conexion = DriverManager.getConnection(URL, "usuario1", "usuario1");
		Statement comando = conexion.createStatement();
		ResultSet rs = comando.executeQuery(consulta);
		
		System.out.println("Num_Pel TITULO");
		System.out.println("-------------");
		while(rs.next()) {
			int numPel = rs.getInt(1);
			String titulo = rs.getString(2);
			System.out.println(numPel + " - " + titulo);
		}
		
		comando.close();
		conexion.close();
	}

}
