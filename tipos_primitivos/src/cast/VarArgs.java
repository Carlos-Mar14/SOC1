package cast;

public class VarArgs {
	/*
	 * public static void main(String[] args) { String nombre1 = "Carlos", nombre2 =
	 * "Antonio"; int numero1 = 56, numero2 = 33; imprimir(nombre1, numero2);
	 * imprimir("Rosa", nombre2, numero1); imprimir(numero2); imprimir(); }
	 * 
	 * private static void imprimir(Object... datos) { if (datos.length == 0)
	 * System.out.println("vacio!"); for (Object dato : datos) System.out.print(dato
	 * + " "); System.out.println(); }
	 * 
	 * 
	 * }
	 */
	
	
	public static void main(String[] args) {
		imprimir(1);
		imprimir();
		imprimir(1,5);
	}

	static void imprimir(int... parametros) {
		if(parametros.length == 0) {
			System.out.println("Nada imprimir");
		}else {
			for(int x: parametros)
			System.out.println(x);
		}
	}

}
