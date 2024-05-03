package three;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestReverse {

	public static void main(String[] args) {
		List<Character> alfabet = new ArrayList<Character>(List.of('a', 'm', 'z'));
		Collections.reverse(alfabet);
		System.out.println(alfabet);
		
		Collections.replaceAll(alfabet, 'a', '^');
		System.out.println(alfabet);
	}

}
