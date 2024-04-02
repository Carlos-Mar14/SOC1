package if_simple;

import java.util.Scanner;

public class IfEjercicio1 {

	public static void main(String[] args) {
		String[] Name= { "Luis", "Sara", "Eduardo", "Carlos", "Vanesa", "Clara", "Juan"};
		String[] Generos = {"H", "M"};
		String[] ColorOjos = {"Marrones", "Azules", "Verdes"};
		String[] ColorCabello = {"Rubio", "Moreno", "Castaño"};
		
		Scanner sc = new Scanner(System.in); // System.in: es el metodo para lectura del teclado

		System.out.println("Digita tu Genero: ");
		String Genero = sc.next();
		
		System.out.println("Digita tu color de ojos: ");
		String ColorOjo = sc.next();
		
		System.out.println("Digital el color de tu cabello: ");
		String ColorCabellos = sc.next();
		sc.close(); // Cerramos los recursos consumidos por escanner
		
		if(Genero.equals(Generos[0])) {
			
		}else if(Genero.equals(Generos[1])) {
		
		System.out.println("Genero Incorrecto");
		}
		
		if(ColorOjo.equals(ColorOjos[0])) {
			
		}else if(ColorOjo.equals(ColorOjos[1])) {
			
		}else if(ColorOjo.equals(ColorOjos[2])) {
		
		System.out.println("Ojos Incorrecto");
		}
		
		if(ColorCabellos.equals(ColorCabello[0])) {
			
		}else if(ColorCabellos.equals(ColorCabello[1])) {
			
		}else if(ColorCabellos.equals(ColorCabello[2])) {
		
		System.out.println("Cabello Incorrecto");
		}
		
		System.out.println("Name: " + Name);
	}

}
