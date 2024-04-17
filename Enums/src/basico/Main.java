package basico;

public class Main {

	enum Alineacion{
		Izquierda, Derecha, Centro, Justificado
	}
	
	public static void main(String[] args) {
	
		Alineacion modo = Alineacion.Justificado;
		metodoX(modo);
	}
	
	static void metodoX(Alineacion alineacion) {
		System.out.println(alineacion);
		System.out.println(alineacion.ordinal());
		System.out.println(alineacion.name());
		
		System.out.println("**********************************************************************************************************************************************************");
		
		//Si usamos "value" este nos devuelve un array con las enums
		for (Alineacion ali: Alineacion.values()) {
			System.out.println(ali);
		}
	}
}
