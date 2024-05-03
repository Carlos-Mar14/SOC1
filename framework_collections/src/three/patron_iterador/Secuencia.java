package three.patron_iterador;

public class Secuencia {

	private final Object[] almacen;
	private int pos;
	static final String msj = "No queda espacio en el amancen interno!!";

	// Constructor
	public Secuencia(int tam) {
		this.almacen = new Object[tam];
	}

	public void add(Object obj) throws Exception {
		if (pos < almacen.length)
			almacen[pos++] = obj;

		else
			throw new Exception(msj);

	}

	// Metodo
	Iterable getIterador() {
		return new Iterador();

	}

	private class Iterador implements Iterable {

		private int index;

		@Override
		public boolean end() {

			return index >= almacen.length;
		}

		@Override
		public Object current() {
			return almacen[index];
		}

		@Override
		public void next() {
			index++;

		}

	}
}
