package utilesfecha;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class UtilesFecha {
	// Formato corto de fecha con la hora
	// static DateFormat df = DateFormat.getInstance();

	// Format medium, trae la fecha mas larga sin la hora
	// static DateFormat df = DateFormat.getDateInstance();

	// Estilo: .FULL, trae el formato completo de la fecha: "jueves, 4 de abril de
	// 2024"
	// Con el Locale.ENGLISH = "thursday, april 4, 2024"
	/*
	 * final static int estilo = DateFormat.FULL; static DateFormat df =
	 * DateFormat.getDateInstance(estilo, Locale.ENGLISH);
	 */

	// SimpleDateFormat
	static SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");

	public static String printBeauty(Date fecha) {
		return df.format(fecha);
	}

	public static Date str2date(String fecha) {
		try {
			return df.parse(fecha);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}

	/*
	 * Ejercicio:
	 * Metodo a partir de tres enteros representando dia, mes, año y usando la clase
	 * Calendar, retorne un objeto java.util.Date
	 */
	public static Date newDate(int dia, int mes, int anyo) {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.DAY_OF_MONTH, dia);
		cal.set(Calendar.MONTH, mes - 1);
		cal.set(Calendar.YEAR, anyo);
		
		return cal.getTime();
	}

}
