package four.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// Construimos el contenedor
		List<Persona> personas = new ArrayList<>();

		// Se llama un metodo y se le pasa personas
		rellenar(personas);
		System.out.println(">>>>> Info tal cual: >>>>>>");
		System.out.println(personas);
		
		//Con este metodo estoy queriendo ordenar las personas 
		Collections.sort(personas);
		
		System.out.println(">>>>> Info Ordenada: >>>>>>");
		System.out.println(personas);
		
		System.out.println("Programa Finalizado");
	}

	private static void rellenar(List<Persona> personas) {
		// Se crea objeto persona
		Persona persona = new Persona();

		// Se configura la persona
		persona.setNombre("Manuel");
		persona.setApellidos("Torres Jimenez");
		persona.setEdad(56);

		// Y se añade al array que mediante "persona" y se esta pasado como parametro
		personas.add(persona);

		persona = new Persona();
		persona.setNombre("Roberto");
		persona.setApellidos("Calvo Sanchez");
		persona.setEdad(8);
		personas.add(persona);

		persona = new Persona();
		persona.setNombre("Maria Luisa");
		persona.setApellidos("Fernandez Gutierrez");
		persona.setEdad(16);
		personas.add(persona);

		
		persona = new Persona();
		persona.setNombre("Raquel");
		persona.setApellidos("Martinez Lopez");
		persona.setEdad(16);
		personas.add(persona);
	}

}
