package calendar;

import java.util.Calendar;
import java.util.Date;

import utilesfecha.UtilesFecha;

public class TestCalendar {

	public static void main(String[] args) {
		
		Date finAño = UtilesFecha.str2date("31/12/2023");
		
		//Esto es similar a hacer un new
		Calendar cal = Calendar.getInstance();
		
		//Se puede configurar un calendar a partir de un Date
		cal.setTime(finAño);
		System.out.println(UtilesFecha.printBeauty(cal.getTime()));
		
		cal.setLenient(false);
		
		//cal.set(Calendar.MONTH, 1);
		cal.add(Calendar.DAY_OF_MONTH, 1);
		
		
		//Metodo getTime() de Calendar, crea un objeto Date y lo devuelve;
		/*Date fecha = cal.getTime();
		
		System.out.println(cal.getClass());
		
		cal.set(2024, 4, 9);
		*/
		
		System.out.println(UtilesFecha.printBeauty(cal.getTime()));
		
		Date coolDate = UtilesFecha.newDate(29, 2, 2024);
		System.out.println(UtilesFecha.printBeauty(coolDate));
	}

}
