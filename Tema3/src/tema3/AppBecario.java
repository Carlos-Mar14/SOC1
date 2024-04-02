package tema3;

public class AppBecario {

	public static void main(String[] args) {
		
		Alumno al = new Alumno("Jhon", 34444);
		
		//Constructor
		Becario bec = new Becario("Carlos Andres", 44545454, 222);
		
		//Esto me lo permite el poliformimso:
		//Gaiurdo los matrioculados en una misma
		//Estructura a pesar de ser bojeto
		//de diferente tipo, ta que estan en una 
		//misma jerarquia de herencia
		Alumno matriculados[]= new Alumno[5];
		matriculados[0]= al;
		matriculados[1]= bec;
		
		
		bec.setFechaNacimiento(30, 9, 1997);
		bec.setDireccion("Av. Fortuny, 15");
		bec.setCurso("Backend Java");
		
		for(Alumno estudiante: matriculados) {
		System.out.println(estudiante);
	
		}
	}
}
