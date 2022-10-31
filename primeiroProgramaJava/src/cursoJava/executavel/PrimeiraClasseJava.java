package cursoJava.executavel;

public class PrimeiraClasseJava {

	public static void main(String[] args) {

		/*Estrutura de repetição WHILE*/
		
		int numero = 0;
		
		while(numero <= 60) { /*Verifica e depois executa o código*/
			
			System.out.println("O número atual é : " + numero);
			numero ++; // acrecenta um número a cada iteração
		}
		/*--------------------*/
		
		int numero2 = 0;
		do { /*Primeiro executa e depois verifica*/
			
			System.out.println("O número atual é : " + numero2);
			numero2 ++;
		}while(numero2 <= 60);
	}

}