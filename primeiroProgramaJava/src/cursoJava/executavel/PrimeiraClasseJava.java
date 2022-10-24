package cursoJava.executavel;

public class PrimeiraClasseJava {

	public static void main(String[] args) {

		/* SWITCH CASE: OPERAÇÕES EXATAS*/
		int dia = 2;
		switch (dia) {
		case 1: 
			System.out.println("domingo");
			break;
		case 2: 
			System.out.println("segunda-feira");
			break;
		case 3: 
			System.out.println("terça-feira");
			break;
		default: System.out.println("Outro dia quaquer" );
			break;
		}
	}
}