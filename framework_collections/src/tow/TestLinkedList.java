package tow;

import java.util.LinkedList;

public class TestLinkedList {

	public static void main(String[] args) {
		LinkedList<Integer> pila = new LinkedList<>();
		pila.push(5);
		pila.push(2);
		pila.push(0);
		
		//***
		while(!pila.isEmpty())
			pila.pop();
		
		
		
		for (Integer num : pila)
			System.out.println(num);
		
		System.out.println("Progama finalizado");

	}

}
