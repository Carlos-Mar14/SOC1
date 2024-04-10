package time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TestNewApiDateTime {

	static DateTimeFormatter formato = DateTimeFormatter.ISO_LOCAL_DATE;

	public static void main(String[] args) {

		//Fecha año, mes y dia
		LocalDate hoy = LocalDate.now();
		System.out	.println(hoy);

		//Formato europeo
		//Patron de fechas "custom"
		LocalDate miFecha = LocalDate.of(2024, 4, 10);
		String formatoEuro = "dd-MM-yyyy";
		
		//Se lo paso al formateador
		DateTimeFormatter formateadorEuro = DateTimeFormatter.ofPattern(formatoEuro);
		System.out.println(formateadorEuro.format(miFecha));

	}

}
