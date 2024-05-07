package four.comparator;

public class SmartPhone {
	private String marca;
	private String modelo;
	private int precio;

	public SmartPhone(String marca, String modelo, int precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
	}

	@Override
	public String toString() {
		StringBuilder formato = new StringBuilder();
		formato.append("\nMarca: ").append(marca);
		formato.append("\nModelo: ").append(modelo);
		formato.append("\nPrecio: ").append(precio).append("\n_________\n");

		return formato.toString();

	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

}
