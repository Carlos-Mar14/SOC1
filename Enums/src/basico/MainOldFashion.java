package basico;


//Esto es una forma vieja de hacerlo sin las enums
//Pero existe un motivo por el cual se usa las enums para no usar este codigo de esta forma y es que en un codigo largo es propenso a errores
public class MainOldFashion {

	static final int Izquierda = 0, Derecha = 1,  Centrado = 2, Justificado = 3;
	
	public static void main(String[] args) {
		
		metodoX(4);
	}

	private static void metodoX(int pocision) {
		System.out.println("Pocision: " + pocision);
	}

}
