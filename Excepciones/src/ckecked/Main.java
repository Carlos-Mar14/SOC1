package ckecked;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random num = new Random();
		int numero = num.nextInt(100);
		
		metodoX(numero);
		
		System.out.println("El numero es: " + numero);
		System.out.println("Fin del programa");
	}

	public static void metodoX(int num) {
		CheckedVsUnchecked e = new CheckedVsUnchecked();
		
		if (num % 2 == 0) // Si es par...
			throw e;
	}
}
