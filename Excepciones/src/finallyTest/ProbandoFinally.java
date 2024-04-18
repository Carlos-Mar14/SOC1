package finallyTest;

public class ProbandoFinally {

	public static void main(String[] args) {

		try { // Aqui va el codigo posible de generar errores
			int resultado = 100 / 5;
			if(resultado % 2 == 0) return;
			System.out.println(resultado);

		} catch (Exception Barça) { // Aqui va el codigo que gestiona el programa
			System.out.println(Barça.getMessage());
		}finally {
			System.out.println("finally ejecutado!!!!!!!!!!!!!!");
		}

		System.out.println("Programa finalizado");

	}

}
