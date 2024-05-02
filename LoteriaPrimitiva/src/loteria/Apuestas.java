package loteria;

public class Apuestas {
	
	private int[] numeros;
	private int numeroComplementario;
	private int numeroReintegro;

	public Apuestas(int[] numeros, int numeroComplementario, int numeroReintegro) {
		this.numeros = numeros;
		this.numeroComplementario = numeroComplementario;
		this.numeroReintegro = numeroReintegro;
	}

	public int[] getNumeros() {
		return numeros;
	}

	public void setNumeros(int[] numeros) {
		this.numeros = numeros;
	}

	public int getNumeroComplementario() {
		return numeroComplementario;
	}

	public void setNumeroComplementario(int numeroComplementario) {
		this.numeroComplementario = numeroComplementario;
	}

	public int getNumeroReintegro() {
		return numeroReintegro;
	}

	public void setNumeroReintegro(int numeroReintegro) {
		this.numeroReintegro = numeroReintegro;
	}
}
