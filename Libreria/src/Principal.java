
public class Principal {

	public static void main(String[] args) {
		System.out.println("Libreria El Quijo Presenta sus tres libros estrellas: \n");
		
		Libro miLibro1 = new Libro("Quijote", "Cervantes", "PP", 1966, 952, 20, 56854);
		System.out.println(miLibro1.getName_libro() + " " + miLibro1.getAutor());
		Libro miLibro2 = new Libro("Java enciclopedia", "ORACLE", "PP", 1966, 952, 20, 56854);
		System.out.println(miLibro2.getName_libro() + " " +  miLibro2.getAutor());
		Libro miLibro3 = new Libro("C# libro", "Microsoft", "PP", 1966, 952, 20, 56854);
		System.out.println(miLibro3.getName_libro() + " " +  miLibro3.getAutor());

	}

}
