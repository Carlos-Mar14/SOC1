package three;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestBinarySearch {

	public static void main(String[] args) {

		int key = 33;
		List<Integer> loteria = new ArrayList<Integer>( List.of(34, 2, 40, 22, 12, 3));
		System.out.println(loteria);
		
		System.out.println("** Ordenada **");
		Collections.sort(loteria);
		System.out.println(loteria);
		
		
		int pos = Collections.binarySearch(loteria, key);

		if (pos < 0)
			System.out.println("El " + key + " No esta pero ocuparia la posicion " + Math.abs(pos));
		else
			System.out.printf("el %d esta en la posicion %d", key, pos );

	}

}
