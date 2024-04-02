package tema3;

public class App {

	public static void main(String[] args) {
		
		//Constructor
		Alumno alu = new Alumno("Carlos Andres", 2222222);
		
		alu.setFechaNacimiento(30, 9, 1997);
		alu.setDireccion("Av. Fortuny, 15");
		alu.setCurso("Backend Java");
		
		System.out.println(alu);
	}

}
