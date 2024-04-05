package entidades;

public class CentroComercial {
	
	private String nombre;
	private Local[] locales;
	
	public String getNombre() {
		return nombre;
	}
	public CentroComercial(String nombre, Local[] locales) {
		super();
		this.nombre = nombre;
		this.locales = locales;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Local[] getLocales() {
		return locales;
	}
	public void setLocales(Local[] locales) {
		this.locales = locales;
	}
}
