package administracion;

import java.time.LocalDate;

public class EmpleadoFijo extends Empleado{
	
	private LocalDate anyoAltaEmpresa;
	private double complementoSalario = 192.85;
	private double salarioBase = 10931.13;
	
	public EmpleadoFijo(String nombre, int edad, String departamento, LocalDate anyoAltaEmpresa, double complementoSalario, double salarioBase) {
		super(nombre, edad, departamento);
		this.anyoAltaEmpresa = anyoAltaEmpresa;
		this.complementoSalario = complementoSalario;
		this.salarioBase = salarioBase;
	}

	public LocalDate getAanyoAltaEmpresa() {
		return anyoAltaEmpresa;
	}

	public void setAanyoAltaEmpresa(LocalDate anyoAltaEmpresa) {
		this.anyoAltaEmpresa = anyoAltaEmpresa;
	}

	@Override
	public double calcuSueldo() {
		return (complementoSalario + salarioBase) * anyoAltaEmpresa;
	}

}
