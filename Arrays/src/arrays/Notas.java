package arrays;

public class Notas {

	public static void main(String[] args) {
		
		/*
		
		//Declaracion de un array
		// float notas; sintaxis alternativa para la declaración
		//Sintaxis en dos lineas para inicializar el array
		float notas[]; 	
		notas =  new float[3];
		
		notas[0]= 6.8f;
		notas[1]= 8.3f;
		notas[2]= 7.5f;
		
		*/
		
		/*
		//Sintaxis en una linea para inicializar y definir el array
		float notasFinales[] = {6.8f, 8.3f, 7.5f};
		
		//Recorrido del array
		
		for (int i=0; i<3; i++) {
			System.out.println(notasFinales[i]);
		}
		*/
		
		/*
		
		//Sintaxis en una linea para inicializar y definir el array
		float notasFinales[] = {6.8f, 8.3f, 7.5f};
				
		//Recorrido del array	
		for (int i=0; i<notasFinales.length; i++) {
			System.out.println(notasFinales[i]);
		}
		
		*/		
		
		//Sintaxis en una linea para inicializar y definir el array
		float notasFinales[] = {6.8f, 8.3f, 7.5f};
		
		//Recorrido mas comodo - version moderna - forEach
		for(float n: notasFinales) {
			System.out.println(n);
		}
		
	}

}
