package ejercicio2;

public class Cajero {

	public static void main(String[] args) {
		CuentaBancaria miCuentaMinima = null;
		CuentaBancaria micuentaConValor = null;
		try {
			
			miCuentaMinima = new CuentaCorriente("00000", false);
			System.out.println(miCuentaMinima);
			
			
			miCuentaMinima.retirar(25);
			miCuentaMinima.ingresar(30);
			System.out.println(miCuentaMinima);
			
			
			 micuentaConValor =  new CuentaCorriente("asdfg", 50, true);
			 System.out.println(micuentaConValor);
			
			
		} catch (Exception e) {
			
			System.out.println("Ooooooops!" + e.getMessage());
			
		}
		
		 System.out.println("Fin del programa");
		
	}
}
