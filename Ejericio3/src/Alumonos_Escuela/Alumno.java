package Alumonos_Escuela;
import java.util.Date;

public class Alumno {

	private static int total;
		
	
	
	private String nombre;
	private int dni;
	private Date fechaNacimiento;
	private String curso;
	private String direccion;

	public static int getTotal() {
		return total;
	}
	
	public Alumno(String nom, int dni) 
	{	
		this(); //thi() debe ir de primero
		//total++; // total++ es reemplazado por this(); 
		this.nombre = nom;
		this.dni = dni;
	}
	
	public Alumno(){
		total++;
	}
	
	public String getNombre() {
		return nombre + "_";
	}
	public void setNombre(String  nombre) {
	    this.nombre = nombre;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
}
