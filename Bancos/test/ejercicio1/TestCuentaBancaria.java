package ejercicio1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import junit.framework.*;
class TestCuentaBancaria {

	@Test
	void testIngresarCasoFavorable() {
		//Setting
		CuentaBancaria cb = new CuentaBancaria("AAA", 500);
		
		//Invocación al Subjet Under Test (Estamos llamando al metodo que deseamos testear)
		cb.ingresar(500);
		
		//Check de los resultados
		assertEquals(1000, cb.getSaldo());
	}
	
	@Test
	void testIngresarNoCasoFavorable() {
		//Setting
		CuentaBancaria cb = new CuentaBancaria("AAA", 500);
		
		try {
		//Invocación al Subjet Under Test (Estamos llamando al metodo que deseamos testear)
		cb.ingresar(-5);	
		}
		catch(RutimeException e);
	}
}
