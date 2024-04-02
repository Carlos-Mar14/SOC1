package arrays;

class Alumno{
	String nom;
	int edad;
	//constructor
	Alumno(String nombre, int edad){
		nom = nombre;
		this.edad = edad;
	}
	//Metodo en el padre
	public String toString() {
		return nom + " tiene " + edad;
	}
}

public class Programa {

	public static void main(String[] args) {
		Alumno alumnos[] = { new Alumno("Luar", 15), new Alumno("Frann", 15) };
		
		for (Alumno alum: alumnos) {
			System.out.println(alum);
		}
		
		
		System.out.println("*************");
		
		//Opcion corta de dar un new, de cambiar un alumno
		//alumnos[1] = new Alumno("Paquillo", 41);
		
		
		//Opcion larga de dar un new, de cambiar un alumno
		Alumno sustituto = new Alumno("Paquillo", 41);
		alumnos[1] = sustituto;
		
		//Bucle clasico
		for(int i=0; i<alumnos.length; i++){
			System.out.println(alumnos[i]);
		}
	}

}
