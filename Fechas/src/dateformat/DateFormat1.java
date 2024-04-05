package dateformat;

import java.util.Date;

import static utilesfecha.UtilesFecha.*;

public class DateFormat1 {

	public static void main(String[] args) {

		Date ahora = new Date();

	
		String salida = printBeauty(ahora);
		System.out.println(salida);

		Date ayer = str2date("04/04/2024");
		System.out.println(printBeauty(ayer));
	}

}
