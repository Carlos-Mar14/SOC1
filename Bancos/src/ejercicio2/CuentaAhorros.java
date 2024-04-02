package ejercicio2;

import utiles.Utiles;

public class CuentaAhorros extends CuentaBancaria{
	
	//Atributos
	private static  double tipoInteres = Utiles.TIPO_INTERES;
	

	//constructor
	public CuentaAhorros(String numCuenta, double ini, double tipoInteres) {
		super(numCuenta, ini);
		this.tipoInteres = tipoInteres;
		
	}
	
	//constructor
	public CuentaAhorros(String numCuenta, double tipoInteres) {
		super(numCuenta);
		this.tipoInteres = tipoInteres;
		
	}

	public final static double getTipoInteres() {
		return tipoInteres;
	}
	
	public final static void setTipoInteres(double tipoInteres) {
		CuentaAhorros.tipoInteres = tipoInteres;
	}
	
	//Metodos Internos
	public double calcularInteres() {
		double intereses = getSaldo() * getTipoInteres() / 100;
		return intereses;
	}
	public void capitalizarInteres(){
		//double calcularIteres();
	}
	
}