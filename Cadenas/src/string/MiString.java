package string;

public class MiString {

	public static void main(String[] args) {
		//String es una clase inmutable, es decir no puede modificarse, anque aparentemente si
		String curso = "JAVA";
		curso += " 2024"; // esta operacion esta abreviaba = asi seria larga = curso = curso + "2024";
		curso = curso.concat(" en Stucom Corsega");
		System.out.println(curso);

	}

}
