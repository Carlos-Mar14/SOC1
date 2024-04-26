
//ConsultaStatement.java

/*


//Ejercicio 1: Añadir las instrucciones necesarias para obtener y mostrar los libros que contengan la palabra ‘Java’.
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConsultaStatement {

	public static void main(String[] args) {
		try {
			// Usamos la cadena de conexión previamente establecia en la clase Conexion.java
			String url = "jdbc:mysql://localhost:8889/libros?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC";
			Connection conexion;
			conexion = DriverManager.getConnection(url, "root", "root");
			Statement sentenciaSQL = conexion.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_READ_ONLY);
			String palabraClave = "Java";
			StringBuffer sb = new StringBuffer();
			sb.append("SELECT autores.Nombre, libro.Titulo ");
			sb.append("FROM autorlibro ");
			sb.append("INNER JOIN autores ON autorlibro.CodAutor = autores.CodigoAutor ");
			sb.append("INNER JOIN libro ON autorlibro.CodLibro = libro.CodigoLibro ");
			sb.append("WHERE libro.Titulo LIKE '%").append(palabraClave).append("%'");
			ResultSet rs = sentenciaSQL.executeQuery(sb.toString());
			System.out.println("Libros que contienen la palabra '" + palabraClave + "':\n");
			String nombre;
			String titulo;
			rs.beforeFirst();
			while (rs.next()) {
				System.out.print("\nAUTOR:  ");
				nombre = rs.getString("Nombre").toString();
				System.out.println(nombre);
				System.out.print("TITULO:  ");
				titulo = rs.getString("Titulo").toString();
				System.out.println(titulo);
				System.out.println("-----------------------");
			}
			sentenciaSQL.close();
			conexion.close();
		} catch (SQLException e) {
			System.out.println("SQLException: " + e.getMessage());
			System.out.println("SQLState: " + e.getSQLState());
			System.out.println("VendorError: " + e.getErrorCode());
		}
	}
}

*/

/*

//Ejercicio 2…Apartado A:
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
public class ConsultaStatement {
	
	private static ResultSet lanzarSelect(String select) {
		ResultSet rs = null;
		try {
			// Usamos la cadena de conexión previamente establecia en la clase Conexion.java
			String url = "jdbc:mysql://localhost:8889/libros?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC";
			Connection conexion;
			conexion = DriverManager.getConnection(url, "root", "root");
			Statement sentenciaSQL = conexion.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_READ_ONLY);
			rs = sentenciaSQL.executeQuery(select);
		} catch (SQLException e) {
			System.out.println("Error al ejecutar la consulta: " + e.getMessage());
		}
		return rs;
	}
	
	private static void mostrarSelect(ResultSet res) {
	    try {
	        ResultSetMetaData resMD = res.getMetaData();
	        int num_cols = resMD.getColumnCount();

	        // Imprimir nombres de las columnas
	        for (int i = 1; i <= num_cols; i++) {
	            System.out.print(resMD.getColumnName(i) + "\t");
	        }
	        System.out.println();

	        // Imprimir filas
	        while (res.next()) {
	            for (int i = 1; i <= num_cols; i++) {
	                System.out.print(res.getString(i) + "\t");
	            }
	            System.out.println();
	        }
	    } catch (SQLException e) {
	        System.out.println("Error al mostrar el ResultSet: " + e.getMessage());
	    }
	}

	public static void main(String[] args) {
		try {
			String palabraClave = "Java";
			StringBuffer sb = new StringBuffer();
			sb.append("SELECT autores.Nombre, libro.Titulo ");
			sb.append("FROM autorlibro ");
			sb.append("INNER JOIN autores ON autorlibro.CodAutor = autores.CodigoAutor ");
			sb.append("INNER JOIN libro ON autorlibro.CodLibro = libro.CodigoLibro ");
			sb.append("WHERE libro.Titulo LIKE '%").append(palabraClave).append("%'");
			ResultSet rs = lanzarSelect(sb.toString());
	        System.out.println("Libros que contienen la palabra '" + palabraClave + "':");

	        // Llamar al método mostrarSelect para imprimir los resultados
	        mostrarSelect(rs);

	        rs.close();
		} catch (SQLException e) {
			System.out.println("SQLException: " + e.getMessage());
			System.out.println("SQLState: " + e.getSQLState());
			System.out.println("VendorError: " + e.getErrorCode());
		}
	}
}

*/

package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class ConsultaStatement {

	private static ResultSet lanzarSelect(String select) {
		ResultSet rs = null;
		try {
			// Usamos la cadena de conexión previamente establecia en la clase Conexion.java
			String url = "jdbc:mysql://localhost:8889/libros?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC";
			Connection conexion;
			conexion = DriverManager.getConnection(url, "root", "root");
			Statement sentenciaSQL = conexion.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_READ_ONLY);
			rs = sentenciaSQL.executeQuery(select);
		} catch (SQLException e) {
			System.out.println("Error al ejecutar la consulta: " + e.getMessage());
		}
		return rs;
	}

	private static void mostrarSelect(ResultSet res) {
		try {
			ResultSetMetaData resMD = res.getMetaData();
			int num_cols = resMD.getColumnCount();

			// Imprimir nombres de las columnas
			for (int i = 1; i <= num_cols; i++) {
				System.out.print(resMD.getColumnName(i) + "\t");
			}
			System.out.println();

			// Imprimir filas
			while (res.next()) {
				for (int i = 1; i <= num_cols; i++) {
					System.out.print(res.getString(i) + "\t");
				}
				System.out.println();
			}
		} catch (SQLException e) {
			System.out.println("Error al mostrar el ResultSet: " + e.getMessage());
		}
	}

	private static int getNuevoID(String tabla, String ID) throws SQLException {
		int nuevoID = 0;
		try {
			StringBuilder sb = new StringBuilder("SELECT MAX(").append(ID).append(") FROM ").append(tabla);
			ResultSet rs = lanzarSelect(sb.toString());
			if (rs.next()) {
				int ultimoID = rs.getInt(1);
				nuevoID = ultimoID + 1;
			}
			rs.close();
		} catch (SQLException e) {
			System.out.println("Error al obtener el nuevo ID: " + e.getMessage());
			throw e;
		}
		return nuevoID + 1;
	}

	private static int gravarFila(String sql) throws SQLException {
		Conexion.setURL("jdbc:mysql://localhost:8889/libros?user=root&password=root");
		return Conexion.getConexion().createStatement().executeUpdate(sql);

	}

	public static void main(String[] args) {
		try {
			StringBuilder sb = new StringBuilder();
			String codigo = "Java";
			String insert = "INSERT INTO `autores` (`CodigoAutor`, `Nombre`, `Direccion`, `Telefono`) VALUES ('"
					+ getNuevoID("autores", "codigoautor")
					+ "', 'CARLOS', 'calle Fortuny', '33333333');";
			String update = "UPDATE libro set Fecha = CURRENT_DATE where CodigoLibro = 3;";
			String palabraClave = "Java";
			
			sb.append("SELECT autores.Nombre, libro.Titulo ");
			sb.append("FROM autorlibro ");
			sb.append("INNER JOIN autores ON autorlibro.CodAutor = autores.CodigoAutor ");
			sb.append("INNER JOIN libro ON autorlibro.CodLibro = libro.CodigoLibro ");
			sb.append("WHERE libro.Titulo LIKE '%").append(palabraClave).append("%'");
			ResultSet rs = lanzarSelect(sb.toString());
			mostrarSelect(rs);
			System.out.println("Libros que contienen la palabra '" + palabraClave + "':");

			System.out.println(sb.toString());

			ResultSet res = lanzarSelect(sb.toString());
			mostrarSelect(res);

			System.out.println(getNuevoID("Autores", "CodigoAutor"));
			System.out.println("Insert: " + insert);
			System.out.println(gravarFila(insert));
			System.out.println(gravarFila(update));
			System.out.println(update);
			rs.close();
		} catch (SQLException e) {
			System.out.println("SQLException: " + e.getMessage());
			System.out.println("SQLState: " + e.getSQLState());
			System.out.println("VendorError: " + e.getErrorCode());
		}
	}
}