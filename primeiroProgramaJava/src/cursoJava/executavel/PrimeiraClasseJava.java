package cursoJava.executavel;

public class PrimeiraClasseJava {

	public static void main(String[] args) {

		/*Estrutura de repetição FOR e CONTINUE*/
		
		for (int numero = 0; numero <= 10; numero ++) {
			if (numero == 3 || numero == 6|| numero == 9  ) {
				System.out.println("Obaaa, encontrei o número " + numero);
				continue;
			}
			
			System.out.println("Processando laço de repetição ");
		}
		
		
	}

}