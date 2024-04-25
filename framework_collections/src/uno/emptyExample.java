package uno;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class emptyExample {

	/*
	 * public static void main(String[] args) {
	 * 
	 * List<String> ciudadesRevisadas = ciudades(); if(ciudadesRevisadas != null)
	 * for(String ciudad : ciudadesRevisadas ) System.out.println(ciudad); else
	 * System.out.println("Sin ciudades"); }
	 * 
	 * 
	 * static List<String> ciudades(){ Random aleatorio = new Random(); int num =
	 * aleatorio.nextInt(2);
	 * 
	 * if(num % 2 == 0) { //Simulo una DB que a veces no enceuntra info return new
	 * ArrayList<String>(List.of("BArcelona", "Madrid", "Ibiza")); } else { return
	 * null; } }
	 */

	
	
	/*
	//Codigo bien hecho y con validacion
	public static void main(String[] args) {
		List<String> cities = ciudades();
		if (cities.size() == 0)
			System.out.println("No cities!!");
		else
			for (String ciudad : cities)
				System.out.println(ciudad);
		
		System.out.println("Programa finalizado");
	}

	static List<String> ciudades() {
		Random aleatorio = new Random();
		int num = aleatorio.nextInt(2);

		List<String> sinDatos = Collections.emptyList();
		
		if (num % 2 == 0) { // Simulo una DB que a veces no enceuntra info
			return new ArrayList<String>(List.of("Barcelona", "Madrid", "Ibiza"));
		} else {
			return sinDatos;
		}
	}
	*/
	
	
	//Si esto  fuese un metodo SET
	public static void main(String[] args) {
		Collection<String> cities = ciudades();
		if (cities.size() == 0)
			System.out.println("No cities!!");
		else
			for (String ciudad : cities)
				System.out.println(ciudad);
		
		System.out.println("Programa finalizado");
	}

	static Collection<String> ciudades() {
		Random aleatorio = new Random();
		int num = aleatorio.nextInt(2);

		Set<String> sinDatos = Collections.emptySet();
		
		if (num % 2 == 0) { // Simulo una DB que a veces no enceuntra info
			return new HashSet<String>(List.of("Barcelona", "Madrid", "Ibiza", "Barcelona"));
		} else {
			return sinDatos;
		}
	}
}
