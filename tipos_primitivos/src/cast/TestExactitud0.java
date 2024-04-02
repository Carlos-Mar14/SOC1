package cast;

import java.math.BigDecimal;
import java.text.NumberFormat;

public class TestExactitud0 {
	
/*
	
	public static void main(String[] args) {

		double fondos=1.00;
		double precio_chuches=.1;
		double importe=9*precio_chuches;
		
		System.out.println(fondos-importe);
		System.out.println("La vuelta: " + (fondos - importe));
		}
		
*/
	
	
/*
	public static void main(String[] args) {

		double fondos=1.00;
		double precio_chuches=.1;
		double importe=9*precio_chuches;
		// Obtenemos una instancia de la clase NumberFormat
		NumberFormat nf = NumberFormat.getInstance();
		// Establecemos el numero de decimales deseados
		nf.setMaximumFractionDigits(2);
		// Convertimos el numero
		String st=nf.format(fondos-importe);
		System.out.println(st);

		}
*/
	
/*	
	
	public static void main(String[] args) {

		double fondos=1.00;
		int elementosComprados=0;
		for (double precio=.10; fondos>=precio; precio+=.10) {

		fondos-=precio;
		elementosComprados++;

		}
		System.out.println(elementosComprados+" elementos comprados.");

		System.out.println("Cambio: "+fondos+ " €");

		}

*/
	
	public static void main(String[] args) {

		final BigDecimal DIEZ_CENTIMOS=new BigDecimal(".10");
		int elementosComprados=0;
		BigDecimal fondos=new BigDecimal("1.00");
		for (BigDecimal precio=DIEZ_CENTIMOS;

		fondos.compareTo(precio)>=0;
		precio=precio.add(DIEZ_CENTIMOS)) {

		elementosComprados++;
		fondos=fondos.subtract(precio);

		}
		System.out.println(elementosComprados+" elementos comprados.");
		System.out.println("Cambio: "+fondos+ " €");

		}
}
