package tema3.complejos;

import java.util.Objects;

public class Complejo {
	
	
	//Ejemplo: 5 + 4i
	//5 es la aprte real y 4i la parte imaginaria
	
	//Atributos
	private double real;
	private double img;
	
	private Complejo(Complejo c) {
		real = c.real;
		img = c.img;
	}
	
	public Complejo copion() {
		return new Complejo(this);
	}
	
	//Constructor
	public Complejo(double real, double img) {
		this.real = real;
		this.img = img;
	}
	
	
	public String toString() {
		return "real: " + real + ", img: " + img;
	}


	@Override
	public int hashCode() {
		return Objects.hash(img, real);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Complejo other = (Complejo) obj;
		return Double.doubleToLongBits(img) == Double.doubleToLongBits(other.img)
				&& Double.doubleToLongBits(real) == Double.doubleToLongBits(other.real);
	}
	
	/*
	public boolean equals(Object o) {
		if (o == null) return false;
		if (this == o) return true;
		
		if(o  instanceof Complejo) {
			Complejo c = (Complejo) o;
			return
					this.real == ((Complejo) o).real &&
					this.img == ((Complejo) o).img;
		} else {
			return false;
		}
		
	}
	*/
}
