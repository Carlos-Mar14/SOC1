package condicionalFor;

public class CicloFor {

	public static void main(String[] args) {
		
		/*
		
			for (inicializacion; ExpresionLogica; incremento) {
				sentencias;
			}
		
		
		*/
		
		
		
		/*
		for(int i=1; i<=10; i++){
			System.out.println( "2 * " + (i + " = ")+ (2 * i));
		}
		*/
		
		
		
		/*
			for (int i = 1, j = i + 10; i < 5; i++, j = 2*i) {
	
				System.out.println(" i = " + i + " j = " + j);

			}
		*/
		
		
		/*
		int arrayNumerico[]={2,5,7,2,0,4};
		int total=0;
		for (int n: arrayNumerico)

		total+=n;

		System.out.printf("La suma del array numerico es %d", total);
		*/
		
		for(int i=1; i<=10; i++){
			if (i==5) continue;
			System.out.println( "2 * " + (i + " = ")+ (2 * i));
			
		}
	}

}
