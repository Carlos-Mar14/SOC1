package periodo;

import java.util.Calendar;
import java.util.Date;

public class Main {

	public static void main(String[] args) {

		Calendar c = Calendar.getInstance();

		c.set(2024, 1, 20);
		Date begin = c.getTime();

		c.set(2024, 8, 15);
		Date end = c.getTime();

		Periodo duracionCurso = new Periodo(begin, end);

		duracionCurso.getFin().setYear(73);

		end.setYear(130);

		System.out.println(duracionCurso);
	}
}
