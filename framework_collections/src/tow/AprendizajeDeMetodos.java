package tow;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AprendizajeDeMetodos {

	public static void main(String[] args) {
		
		//Si se tiene java 9 o superior se puede usar "List.of" para crear listas harcorded
		//List<String> lista = List.of("Manzana", "Naranja", "mango", "Pera");

		//Ahora para poder añañdir el platano hacemos lo siguinte:
		ArrayList<String> lista = new ArrayList<>( List.of("Manzana", "Naranja", "Mango", "Manzana", "Pera"));
		
		
		lista.add("Cerezas");
//		Collections.shuffle(lista);
		
		int pos = lista.indexOf("Manzana");
		
		System.out.println("La manzana se encuentra en a pocision: " + pos);
		System.out.println(lista);
		
		lista.remove(5); //Quito las cerezas
		System.out.println(lista);
		
		String salente = lista.set(1, "limon");
		System.out.println(lista);
		System.out.println("Quitaste la " + salente);
		
		System.out.println("Total de frutas en la lista: "+ lista.size());
	}

}
