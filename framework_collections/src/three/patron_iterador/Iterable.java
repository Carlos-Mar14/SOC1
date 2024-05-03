package three.patron_iterador;

public interface Iterable {
	boolean end();
	Object current();
	void next();
}
