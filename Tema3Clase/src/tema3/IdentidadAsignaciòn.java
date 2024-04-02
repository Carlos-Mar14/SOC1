package tema3;

class Figura{
	public String toString() {return getClass().getSimpleName();}
}
	class Triangulo extend Figura() {}
	class Retangulo extend Figura() {}

public class IdentidadAsignaciòn {
	public static void main(String[] args) {
		
		Triangulo t1 = new Triangulo();
		Triangulo t2 = t1;
		
		boolean resultado = t1.equals(t2);
		System.out.println(resultado);
		render(t1);
	}
	
	public static void render (Figura figura) {
		Triangulo rec = (Triangulo) figura;
		System.out.println(rec);
	}
	
}
