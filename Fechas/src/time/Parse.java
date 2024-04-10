package time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Parse {

	public static void main(String[] args) {
		DateTimeFormatter formateador = DateTimeFormatter.ISO_LOCAL_DATE;
		LocalDate fecha = LocalDate.parse("2020-01-01", formateador);
		System.out.println(fecha);
	}

}
