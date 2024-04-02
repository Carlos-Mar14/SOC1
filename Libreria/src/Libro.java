
public class Libro {

	// Atributos del libro
	private String name_libro;
	private String autor;
	private String editorial;
	private int anyo_publicacion;
	private int cant_ejemplares;
	private int coste;
	private int isbn;

	// constructor
	public Libro(String name, String autor, String editor, int anyo, int num_ejemplar, int coste, int isbn) {
		this.setName_libro(name);
		this.setAutor(autor);
		this.setEditorial(editor);
		this.setAnyo_publicacion(anyo);
		this.setCant_ejemplares(num_ejemplar);
		this.setCoste(coste);
		this.setIsbn(isbn);
	}

	public String getName_libro() {
		return name_libro;
	}

	public void setName_libro(String name_libro) {
		this.name_libro = name_libro;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public int getAnyo_publicacion() {
		return anyo_publicacion;
	}

	public void setAnyo_publicacion(int anyo_publicacion) {
		this.anyo_publicacion = anyo_publicacion;
	}

	public int getCant_ejemplares() {
		return cant_ejemplares;
	}

	public void setCant_ejemplares(int cant_ejemplares) {
		this.cant_ejemplares = cant_ejemplares;
	}

	public int getCoste() {
		return coste;
	}

	public void setCoste(int coste) {
		this.coste = coste;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

}
