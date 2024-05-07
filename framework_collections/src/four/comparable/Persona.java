package four.comparable;

/*
 * Bean ( Javabean): se esta modelando una entidad, una persona y se limita a tener solo getters y setters
 */
public class Persona implements Comparable<Persona>{
	
	public int compareTo(Persona otra) {
		int firstComp = this.nombre.compareTo(otra.nombre);
		//Si this  > otra entonces 1
		
		//Si this == otra entonces 0
		
		//Si this < otra entonces -1
		
		if( firstComp == 0)
			return this.apellidos.compareTo(otra.apellidos);
		return firstComp;
	}
	
	private String nombre;
	private String apellidos;
	private int edad;

	@Override
	public String toString() {
		return "\n...Nombre: " + nombre + "\nApellidos: " + apellidos + "\nEdad: " + edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

}
