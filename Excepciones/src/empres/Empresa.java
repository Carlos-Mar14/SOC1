package empres;

import java.util.Arrays;

public class Empresa {
	private String nombre;
	private Empleado[] empleados;
	private static int totalEmpleados;

	public Empresa(String nom, int maxNumEmp) {
		this.nombre = nom;
		this.empleados = new Empleado[maxNumEmp];

	}

	public void addEmpleado(String nombre, double sueldo) throws CapacidadEmpresaExcedidaException {
		if (empleados.length > totalEmpleados) {
			Empleado emp = new Empleado(nombre, sueldo);
			empleados[totalEmpleados++] = emp;
		} else

			throw new CapacidadEmpresaExcedidaException(nombre);
	}

	@Override
	public String toString() {
		return "\nnom: " + nombre + "totalEmp: " + totalEmpleados + "\n" + Arrays.toString(empleados);
	}

}
