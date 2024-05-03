package tow;

import java.util.Arrays;
import java.util.Stack;

public class Pila {
	public static void main(String[] args) {

		String[] op = { "5", "+", "3" };
		System.out.println("Operacion: " + Arrays.toString(op));
		Stack<String> pila = new Stack<>();

		for (int i = 0; i < op.length; i++) {
			pila.push(op[i]);

			ejecutar(pila);

		}

	}

	private static void ejecutar(Stack<String> pila) {
		
		//pop() siempre retira el valor de la cima de la pila
		int op1 = Integer.parseInt(pila.pop());// Esto nos da el numoero 3
		
		// peek, te da lo de la cima pero no lo retira de la pila
		String op = pila.peek(); //esto nos da el + de la operacion matematica
		System.out.println("Operacion: " + op);
			switch (pila.pop()){
			case "+": {
				op2 = Integer.parseInt(pila.pop());
				System.out.println(op1 + op2);
			break;
			case "-":
			op2 = Integer.parseInt(pila.pop());
			break;
				}
	
}
}
}