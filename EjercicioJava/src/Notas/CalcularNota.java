package Notas;

public class CalcularNota {

	static float calcularPromedio(){
		
		
		float nota1 = 3.4f;
		float nota2 = 4.6f;
		float nota3 = 1.4f;
		float nota4 = 9.9f;
		float nota5 = 9.9f;
		
		float promedio = (nota1 + nota2 + nota3 + nota4 + nota5) / 5;
		return promedio;
		
	}

	public static void main(String[] args) {
		
		String matricula;
		float media;
		matricula="123-456-789-012";
		
		// llamar a calcularPromedio pasando las cinco notas
		media= calcularPromedio();
		
		System.out.println("El alumno con matricula "+matricula
				+" ha obtenido una media de " + media);
		
		// mostrar si está o no aprobado
		if( media < 5) {
			System.out.println("No aprobado");
		} else{
			System.out.println("Aprobado");
		}
	}

}
