package cast;

public class CastPrimi {

	public static void main(String[] args) {
		
		int antiguedad= 20;
		int salarioBase =  70;
		int diasMes = 30;
		int numPagas = 14;
		
		int salarioBrutoAnual  =numPagas * diasMes * salarioBase + 5 * antiguedad;
		
		imiprmirNomina((int)salarioBrutoAnual);
	}
	
		static void imiprmirNomina(int salBruto) {
			System.out.println(salBruto + " €");
		}
}
