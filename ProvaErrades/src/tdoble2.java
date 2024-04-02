
public class tdoble2 {

	public tdoble2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] argv) {
		// Definició de les varibles.
		int nombre_1;
		int resultat;
		int i;
		String missatge;
		System.out.println("Càlcul del doble d'un nombre entrat");
		if ((argv.length > 10) || (argv.length < 1)) {
			System.out.println("Error: Has d'entrar un mínim d'un nombre i com a molt 10");
		} else {
			for (i = 0; i <= argv.length; i++) {
				nombre_1 = Integer.parseInt(argv[i]);
				resultat = nombre_1 * 2;
				missatge = "El doble de " + " " + nombre_1 + " " + "és" + " " + resultat;
				System.out.println(missatge);
			}
		}
	}

}
