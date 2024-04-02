package if_simple;

import java.util.Scanner;

public class IfParImpart {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // System.in: es el metodo para lectura del teclado

		System.out.println("Dime un numero del 1 al 10: ");
		int num = sc.nextInt(); // Esto detiene la ejecucion del programa
		sc.close(); // Cerramos los recursos consumidos por escanner

		/*

		if (num % 2 == 0) {
			System.out.println("Es Par");
		}else{
			System.out.println("Es impar");
		}
			System.out.println("Fin Programa");
		*/
		
		
		/*
		//	Que por teclado se meta un numero y el sistema diga si es par o impar
		//Usamos la expresion logica terniaria ((expre_log) ? a : b;)
		String x= (num % 2 == 0) ? "Es par" : "Es impar";
		System.out.println(x);
		System.out.println("Fin Programa");
		*/
		
		
		/*
		//Se añade otro operador ternario para limitar que solo acepte numeros del 1 al 10
		String x= (num >= 1 && num <= 10) ? (num % 2 == 0) ? "Es par" : "Es impar" : "Numero incorrecto";
		System.out.println(x);
		System.out.println("Fin Programa");
		*/
		
		
	}

}
