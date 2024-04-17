package coches;

public enum Coche {

	FERRARI("F50", 4700), LAMBORGHINI("Murcielago", 6000), PORSCHE("959", 2850);

	public final String modelo;
	public final int cilindrada;

	private Coche(String modelo, int cilindrada) {
		this.modelo = modelo;
		this.cilindrada = cilindrada;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.getClass().getSimpleName())
		.append("{\nModelo: ")
		.append(modelo)
		.append(" \nCilindrada: ")
		.append(cilindrada)
		.append("\n}");
		return sb.toString();
	}
}
