package empres;

public class Empleado {
	private String nom;
	private double sueldo;
	
	public Empleado(String nom, double sueldo) {
		this.setNom(nom);
		this.setSueldo(sueldo);
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "\nNombre: " + nom + ", Sueldo: " + sueldo;
	}
	
 
	
}
