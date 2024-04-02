/*

OBJETIVO

En esta serie de ejercicios trabajaremos diferentes aspectos básicos de la Programación Orientada a Objetos (POO).

Actividades:

Crear en Java la declaración de la clase Vehículo:

atributos:
· marca y modelo (cadenas de caracteres)
· año de compra (entero)
· matrícula (cadena de caracteres)
· consumo, en litros de combustible por kilómetro (real)

métodos:
· el constructor de la clase, que tendrá la siguiente cabecera:

Vehículo(String fabricante, String mod, int año, String prov_matr, int num_matr, String letras_matr, float consumo)
donde prov_matr es la o las letras de la matrícula que forman el código de provincia, num_matr es el número de la 
matrícula y letras_matr son las letras adicionales que suelen llevar las matrículas.

· para cada atributo un método de obtención de su valor

· el cálculo de la autonomía del vehículo: dada una cantidad de combustible (en litros), retornar los kilómetros 
que este vehículo podría recorrer.

*/
package Vehiculos;

//Crear en Java la declaración de la clase Vehículo:
public class Vehiculo {
	
	//atributos:
	//· marca y modelo (cadenas de caracteres)
	//· año de compra (entero)
	//· matrícula (cadena de caracteres)
	//· consumo, en litros de combustible por kilómetro (real)
	//atributos:
	private String marca;
	private String modelo;
	private int anyCompra;
	private Matricula matricula;
	private float consumo;
	
	//métodos:
		// Los metodos son el constructor y los getters and setters
	
	
	//Constructor de la clase
	//prov_matri = Ejemplo B-12345-FG
	//El constructor es un metodo
	Vehiculo(String fabricant, String mod, int anyCompra, int cod_provincia, int num, String letra_adicional,float consum) 
	{
		marca = fabricant;
		modelo = mod;
		this.anyCompra = anyCompra;
		
		matricula = new Matricula(cod_provincia, num, letra_adicional);
		
		consumo = consum;
	}
	
	
	//· el cálculo de la autonomía del vehículo: dada una cantidad de combustible (en litros), 
		//  retornar los kilómetros que este vehículo podría recorrer.
		public String autonomia(float litros) {
			return "Puedes recorrer: " + litros / consumo * 100 + " KM";
		}
	
	
	//getters and setters son metodos
	//Para cada atributo un método de obtención de su valor = getter and setter
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
	public int getAnyCompra() {
		return anyCompra;
	}
	public void setAnyCompra(int anyCompra) {
		this.anyCompra = anyCompra;
	}
	public Matricula getMatricula() {
		return matricula;
	}
	public void setMatricula(Matricula matricula) {
		this.matricula = matricula;
	}
	public float getConsumo() {
		return consumo;
	}
	public void setConsumo(float consumo) {
		this.consumo = consumo;
	}
	
	@Override
	public String toString() {
		return "Vehiculo marca= " + marca + ", modelo= " + modelo + ", anyCompra= " + anyCompra + ", matricula= "
				+ matricula + ", consumo= " + consumo;
	}
	
	
}
