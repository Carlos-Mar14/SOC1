package cast;

public class CastingPrimiPOO {

	int antiguedad= 20;
	int salarioBase =  70;
	int diasMes = 30;
	int numPagas = 14;
	int salarioBrutoAnual;
	
	public CastingPrimiPOO() {
		salarioBrutoAnual = numPagas * diasMes * salarioBase + antiguedad;
	} 
	
	public static void main(String[] args) {
		CastingPrimiPOO cp = new CastingPrimiPOO();
				cp.imprimirNomina((int)cp.salarioBrutoAnual);
	}
	void imprimirNomina (int salBruto) {
		System.out.println(salBruto + "€");
	}
}
