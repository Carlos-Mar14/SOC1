package ejemfinal;

public class Final {
	
	final int valoracion; //propiedad ( atributo, campo)
	static int total = 100;
	
	//constructor
	public Final(int score) {
		this.valoracion = score; //Justo ahora el final queda sellado
		
	}
	public static void main(String[] args) {
		Final _final = new Final(9);
		System.out.println(_final.valoracion);
		
		System.out.println(total);
	}

}
