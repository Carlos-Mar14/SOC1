package p;

public class TestStringBuilderInmutable {
    private static void modificar(StringBuilder stringBuilder) {
        stringBuilder.append("-modificado");
        System.out.println("en metodo: " + stringBuilder);
    }

    public static void main(String[] args) {
        StringBuilder cadena1 = new StringBuilder("jj");
        System.out.println("Antes del metodo: " + cadena1);
        
        modificar(cadena1);
        
        System.out.println("Despues llamada metodo: " + cadena1);
    }
}
