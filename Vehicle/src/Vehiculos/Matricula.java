package Vehiculos;

public class Matricula {

	//atributos:
	private int cod_provincia;
	private int num;
	private String letra_adicional;
	
	//El constructor es un metodo
	Matricula(int cod_provincia, int num, String letra_adicional)
	{
		this.cod_provincia = cod_provincia;
		this.num = cod_provincia;
		this.letra_adicional = letra_adicional;
	}
	
	
	public String toString() {
		return cod_provincia + "-" + num + "-" + letra_adicional;
	}
	

	//getters and setters son metodos
	public int getCod_provincia() {
		return cod_provincia;
	}

	public void setCod_provincia(int cod_provincia) {
		this.cod_provincia = cod_provincia;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getLetra_adicional() {
		return letra_adicional;
	}

	public void setLetra_adicional(String letra_adicional) {
		this.letra_adicional = letra_adicional;
	}
	
}
