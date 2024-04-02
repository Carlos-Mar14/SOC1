package if_simple;

public class switch_ {

	public static void main(String[] args) {
		char car = 'a';
		switch(car){
		case 'a','e','i','o','u': 
			System.out.println("Es una vocal");
			break;
		default:
			System.out.println("Es una consonante");
		}

	}

}
