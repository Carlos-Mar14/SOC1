package entidades;


public class Local {
	//Atributos
	private String name;
	private String schedule;
	private int employee;
	private double squareMeter;
	
	

	@Override
	public String toString() {
		return "Local [name=" + name + ", schedule=" + schedule + ", employee=" + employee + ", squareMeter="
				+ squareMeter + "]";
	}

	//Constructor
	public Local(String name, String schedule, int employee, double squareMeter) {
		super();
		this.name = name;
		this.schedule = schedule;
		this.employee = employee;
		this.squareMeter = squareMeter;
	}
	
	public Local() {
		super();
	}
	

	// Metodos Getters and Setters
	public String getSchedule() {
		return schedule;
	}
	
	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public int getEmployee() {
		return employee;
	}
	public void setEmployee(int employee) {
		this.employee = employee;
	}
	public double getSquareMeter() {
		return squareMeter;
	}
	public void setSquareMeter(double squareMeter) {
		this.squareMeter = squareMeter;
	}

	public double calculoImpuesto() {
		
		return 0;
	}
	
}
