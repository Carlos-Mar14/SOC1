package if_simple;

import java.util.Scanner;

/*
 * El programa genera un numero aleatorio entre 1 - 10
 * Despues solicita al usuario que introduzca un numero
 * Dentro de ese rango.
 * Finalmente el programa compara los dos numeros e informa 
 * Si hubo acierto o no
 * 
 */

public class IfSimple {

	public static void main(String[] args) {
		int aleatorio = generateAleatorio(); // Numero aleatorio del sistema
		int usaurio = tomarentradaUsaurio(); // Numero ingresado por el usuario
		// System.out.println(aleatorio);

		// Comprobaciòn del acierto

		boolean acierto = (aleatorio == usaurio);

		if (acierto) {
			System.out.println("EL numero " + usaurio + " es correcto.");

		}
		System.out.println("el numero del sorteo es " + aleatorio);
		System.out.println("Fin Programa");
	}

	
	private static int generateAleatorio() {
		int aleatorio = 1 + (int) (Math.random() * 10); // Numero aleatorio entre 1 - 10
		return aleatorio;
	}

	private static int tomarentradaUsaurio() {
		Scanner sc = new Scanner(System.in); // System.in: es el metodo para lectura del teclado

		System.out.println("Dime un numero del 1 al 10: ");
		int usaurio = sc.nextInt(); // Esto detiene la ejecucion del programa

		sc.close(); // Cerramos los recursos consumidos por escanner
		return usaurio;

	}

}
