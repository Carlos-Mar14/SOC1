package buffer;

import java.util.Arrays;

public class MiStringBuffer {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer();
		
//		System.out.println("length Antes:" + sb.length());
//		System.out.println("Capacity Antes" + sb.capacity());
		
		sb.append("Bienvenido al hotel IanResort de Luxe")
			.append(" La costa");
		//Queremos obtener el nombre del hotel "IanResort"
		//Para obtener el nombre creamos este array "char[]" y le damos capacidad de 20
		char[] destino = new char[20]; 
		//Luego en el String ubicamos en que linea empieza (19) y en que linea termina el nombre del hotel (29)
		//luego pasamos a imprimir el nonbre del hotel que se almacenara en "destino" y en el syso obtendremos unicamente el nombre del hotel
		sb.getChars(19, 29, destino , 0);
		System.out.println(sb);
		StringBuffer nomHotel = new StringBuffer(new String(destino));
		
		System.out.println("Nombre del hotel:" + new String(nomHotel));
		
		sb.replace(19, 29, "Alexis&Company Hotel "); //Metodo replace permite cambier el nombre del hotel
		
		sb.setLength(25);
		
		System.out.println(sb);
//		System.out.println("length despues:" + sb.length());
//		System.out.println("Capacity despues" + sb.capacity());

	}

}
