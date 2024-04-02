package entrada_salida;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Entrada {
	private static String inicializar() {
		String info = "";		
		BufferedReader teclado = 
				new BufferedReader(new InputStreamReader(System.in));
		try {
			info = teclado.readLine();			
		} catch (Exception e) {
			System.out.append("Entrada incorrecta)");
		}
		return info;
	}
	
	public static int entero() {
		int valor = Integer.parseInt(inicializar());
		return valor;
	}

	public static double real() {
		double valor = Double.parseDouble(inicializar());
		return valor;
	}

	public static String cadena() {
		String valor = inicializar();
		return valor;
	}

	public static char caracter() {
		String valor = inicializar();
		return valor.charAt(0);
	}

}
