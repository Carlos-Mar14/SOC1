package tow;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class AprendizajeDeMetodos2 {

	public static void main(String[] args) {
		
		//Si se tiene java 9 o superior se puede usar "List.of" para crear listas harcorded
		//List<String> lista = List.of("Manzana", "Naranja", "mango", "Pera");

		//Ahora para poder añañdir el platano hacemos lo siguinte:
		ArrayList<String> lista = new ArrayList<>( List.of("Manzana", "Naranja", "mango", "Pera"));
		
		
		//Y si se tienes java entre version 5 y 9 se usa este metodo para listas 
		// List<String> lista = Arrays.asList("Manzana", "Naranja", "mango", "Pera");
		
		boolean resultado=false;
		try {
			//lista.clear();
			Collection<String> otra= Set.of("Ponelo", "Melos");
			resultado= lista.addAll(otra);
			
		} catch (Exception e) {
			System.out.println("No se  pudo agregar en la lista. consulte con Admin!!!!!!!!!");
		}
		System.out.println(resultado?"**añadido":"**no añadido");
		lista.forEach(e->System.out.println(e));
		
		boolean hayNaranja = lista.contains("Naranja");
		System.out.println(hayNaranja?"**si hay Naranja":"**no hay Naranja");
		
		String frutaCaribe = lista.get(2); //el mango, que esta en la pocision 3
		System.out.println(frutaCaribe);
	}

}
