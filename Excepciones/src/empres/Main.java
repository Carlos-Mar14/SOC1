package empres;

public class Main {

	public static void main(String[] args) {
		
		Empresa emp1 = new Empresa("Mango", 3);
		try {
			emp1.addEmpleado("Adolfo", 1400);
			emp1.addEmpleado("Mary", 1500);
			emp1.addEmpleado("Ezquiel", 17000);
			emp1.addEmpleado("Mario", 17000);
		} catch (CapacidadEmpresaExcedidaException | RuntimeException e) {
		System.out.println(e.getMessage());
		}
			System.out.println(emp1);
	}

}
