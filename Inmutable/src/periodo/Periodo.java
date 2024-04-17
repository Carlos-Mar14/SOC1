package periodo;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Periodo {
	
	final Date inicio, fin;

	public Periodo(Date ini, Date fin) {

		if (fin.before(ini))
			throw new IllegalArgumentException("Periodo mal proporcionado");

		// Copia defensiva
		Calendar c = Calendar.getInstance();

		c.setTime(ini);
		this.inicio = c.getTime();

		c.setTime(fin);
		this.fin = c.getTime();
	}

	public Date getInicio() {
		return inicio;
	}

	public Date getFin() {
		Calendar c = Calendar.getInstance();
		c.setTime(fin);
		c.setTime(fin);
		return c.getTime();
	}

	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String sIni = sdf.format(inicio);
		String sFin = sdf.format(fin);
		return "inicio: " + sIni + "\nfin: " + sFin;

	}

}
