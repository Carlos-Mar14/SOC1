package tema3;

import java.time.LocalDate;

public class Alumno {
	
	//Atributos
	private String nombre, direccion, curso;
	private int dni;
	private LocalDate fechaNacimiento;
	
	//contructor
	public Alumno(String nombre, int dni) {
		this.nombre = nombre;
		this.dni = dni;
	}

	
	//Metodos Getters and Metodos Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	
	public void setFechaNacimiento(int dia, int mes, int any) {
		LocalDate fecha = LocalDate.of(any, mes, dia);
		this.fechaNacimiento = fecha;
	}


	public String prettyDate() {
		if(fechaNacimiento == null)
			return null;
		else {
			String dob;
			dob = " Nacido el " + fechaNacimiento.getDayOfMonth();
			dob += "/" + fechaNacimiento.getMonthValue();
			dob += "/" + fechaNacimiento.getYear();
			return dob;
		}
			
	}
	
	//Metodo toString = Sirve para conseguir los datos de un objeto cuando queremos mostrarlo en la consola o algun lado 
	@Override
	public String toString() {
		return this.getClass().getSimpleName() + "\n Nombre=" + nombre + "\n Direccion=" + direccion + "\n Curso=" + curso + "\n Dni=" + dni
				+ "\n Fecha Nacimiento=" + prettyDate();
	}
	
	
}
