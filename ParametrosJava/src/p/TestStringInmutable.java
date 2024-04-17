package p;

public class TestStringInmutable {

	   private static void modificar(String string) {
	      string+="-modificado";
	      System.out.println("en el metodo: "+string);
	   }

	   public static void main(String[] args) {
	      String cadena1="Antonio";
	      System.out.println("antes de la llamada al metodo: "+cadena1);

	      modificar(cadena1);

	      System.out.println("despues de la llamada al metodo: "+cadena1);
	   }

	}
