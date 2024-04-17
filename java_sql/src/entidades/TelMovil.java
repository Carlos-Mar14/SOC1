package entidades;

public class TelMovil {

	// atributos
	private long id;
	private String fabricante, modelo;
	private double precio;

	// Constructor hermano
	public TelMovil(String fabricante, String modelo, double precio) {
		this(0, fabricante, modelo, precio); // Llama a su constructor hermano
	}

	// Constructor
	public TelMovil(long id, String fabricante, String modelo, double precio) {
		this.id = id;
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.precio = precio;
	}

	// Metodos Guetters and Setters
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	// ToString, que
	@Override
	public String toString() {
		return "id: " + id + " \nfabricante: " + fabricante + "\nmodelo: " + modelo + "\nprecio: " + precio
				+ "\n--------------------";
	}
}
