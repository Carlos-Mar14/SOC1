package administracion;

import java.time.LocalDate;
import java.time.Period;

public class EmpleadoTemporal extends Empleado{

	private LocalDate fechaAlta;
	private LocalDate fechaBaja;
	private double sueldoEmplTempo = 1349.27;
	
	
	public EmpleadoTemporal(String nombre, int edad, String departamento, LocalDate fechaAlta, LocalDate fechaBaja) {
		super(nombre, edad, departamento);
		this.fechaAlta = fechaAlta;
		this.fechaBaja = fechaBaja;
		
	}

	public LocalDate getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(LocalDate fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public LocalDate getFechaBaja() {
		return fechaBaja;
	}

	public void setFechaBaja(LocalDate fechaBaja) {
		this.fechaBaja = fechaBaja;
	}

	@Override
	public String toString() {
		return "EmpleadoTemporal [fechaAlta=" + fechaAlta + ", fechaBaja=" + fechaBaja + "]";
	}

	@Override
	public double calcuSueldo() {
		Period periodo = Period.between(fechaBaja, fechaAlta);
		int dias = periodo.getDays();
		sueldoEmplTempo = sueldoEmplTempo * dias;
		       
		return sueldoEmplTempo ;
	}

}
