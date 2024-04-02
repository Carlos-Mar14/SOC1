package ordenador_mac;

public class Ordenador {
	
	/*
	 *	La clase Ordenador puede incluir los siguientes atributos:
		Marca: Dell, Toshiba, HP
		Procesador: Intel, AMD
		Peso: 2, 2.5, 3
	 */
	  String marca;
	  String procesador;
	  int peso;
	  boolean encendido = false;
	  boolean pantalla = false;
	  
	  
	  
	  public Ordenador(String marca, String procesador, int peso) {
		super();
		this.marca = marca;
		this.procesador = procesador;
		this.peso = peso;
	}

	public void encender()
	  {
	    if (encendido == true)
	    {
	      System.out.println("El ordenador ya está encendido");
	    }
	    else 
	    {
	      encendido = true;
	      pantalla = true;
	      System.out.println("El ordenador ha sido encendido");
	    }
	  }

	  public void estado()
	  {
	    System.out.print("\nEl estado del ordenador es el siguiente:");
	    System.out.print("\nMarca: " + marca);
	    System.out.print("\nProcesador: " + procesador);
	    System.out.print("\nPeso: " + peso + " kg.");

	    if (encendido == true)
	    {
	      System.out.print("\nEl ordenador está encendido");
	    }
	    else
	      System.out.print("\nEl ordenador está apagado");

	    if (pantalla == false)
	    {
	      System.out.print("\nLa pantalla está activada");
	    }
	    else
	      System.out.print("\nLa pantalla está desactivada");

	    System.out.println("\n");
	  }
	  
	  public void EncenderPantalla() {
		  if(pantalla == true) {
			  System.out.println("Pantalla Encendida");
		  }
	  }
	 public void apagar(){
		 if(!encendido) {}
		 System.out.println("ORDENADOR APAGADO");
	 }
	  
}
