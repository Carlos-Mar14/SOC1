package p;

//EJEMPLO DE PASO POR VALOR = PASO POR COPIA, LO QUE SE HAGA EN EL METODO NO AFECTA EL VALOR
public class P {

	static void f(int i) {
		System.out.println(++i);
	}

	public static void main(String[] args) {
		int n = 5;
		System.out.println(n);
		f(n);
		System.out.println(n);
	}
}
