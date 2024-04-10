package time;

import java.time.LocalDate;
import java.time.chrono.JapaneseDate;

public class OtrosCalendarios {

	public static void main(String[] args) {
		
		LocalDate fecha = LocalDate.now();
		LocalDate nuevaFecha = fecha.plusDays(5);
		System.out.println(nuevaFecha);
		
		
		//Al utilizar la siguiente instancia se utiliza el calendario
		// japones en lugar del gregoriano
		LocalDate fechaJ = LocalDate.now();
		JapaneseDate fechaJapo = JapaneseDate.from(fechaJ);
		System.out.println(fechaJapo);

	}

}
