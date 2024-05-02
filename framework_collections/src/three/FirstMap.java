package three;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class FirstMap {

	public static void main(String[] args) {
		Map<String, String> notas = new HashMap<>();

		notas.put("Felipe", "Aprobado");
		notas.put("Maria", " Exelente");
		notas.put("Jordi", " Notable");
		notas.put("Jaime", " Insuficiente");

		// notese que felipe ya existe asi que su nota se actualiza
		notas.put("Felipe", "Notable");

		System.out.println("De qué alumno quieres conocer la nota?");
		System.out.println("Felipe,Maria,Jordi,Jaime");

		// try-with- results lo podemos utilizar con objetos que implementen
		// la interfaz clasable

		try (Scanner sc = new Scanner(System.in)) {
			String query = sc.next();
			boolean resultado = notas.containsKey(query);
			if (resultado) {
				System.out.println(notas.get(query));
			} else
				System.out.println("Nombre alumno desconocido");
		}

		for (Entry<String, String> entrada : notas.entrySet()) {
			String clave = entrada.getKey();
			String valor = entrada.getValue();
			System.out.println("Clave: " + clave + " -  Valor: " + valor );
		}
		
		
	}
}
