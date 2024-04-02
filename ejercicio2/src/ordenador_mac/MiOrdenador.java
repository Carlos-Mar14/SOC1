package ordenador_mac;

public class MiOrdenador {

	public static void main(String[] args) {
		
		Ordenador pc = new Ordenador("Intel", "i9",3);
		
		pc.encender();
		pc.EncenderPantalla();
		pc.estado();
		pc.apagar();
	}
}
