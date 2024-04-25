package empres;

public class CapacidadEmpresaExcedidaException extends Exception{
	public CapacidadEmpresaExcedidaException(String nomEmpleado) {
		super("Capacidad excedida! el Empleado " + nomEmpleado + " no cabe!!");
	}
}
