package date;

import java.util.Date;

import static utilesfecha.UtilesFecha.*;

public class TestFecha {

	public static void main(String[] args) {
		Date verbenaSanJuan = str2date("23/06/2024");
		
		Date diaTrabajador = str2date("01/05/2024");
		 
		if (diaTrabajador.before(verbenaSanJuan)) {
			System.out.println("Cierto");
		}else {
			System.out.println("Falso");
		}
		System.out.println("Dia trabajador: " + printBeauty(diaTrabajador));

		System.out.println("Verbena: " + printBeauty(verbenaSanJuan));
	}

}
