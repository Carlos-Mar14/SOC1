package date;

import java.util.Date;

import static utilesfecha.UtilesFecha.*;

public class GetTime {

	public static void main(String[] args) {
		
		Date hoy = str2date("09/04/2024");
	    long mseg = hoy.getTime();
	    long dias = mseg / (24 * 60 * 60 * 1000);

	    Date anoNuevo = str2date("01/01/2024");
	    long mseg1 = anoNuevo.getTime();
	    long dias1 = mseg1 /(24 * 60 * 60 * 1000);
	    System.out.println(dias - dias1 );

	    long dosMeses =hoy.getTime() + (60 * (24 * 60 * 60 * 1000L));
	    hoy.setTime(dosMeses);
	    System.out.println(printBeauty(hoy));
	}

}
