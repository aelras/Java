package cursoJava.executavel;

public class PrimeiraClasseJava {
	
	/* Variável global é acessivel a todos*/
	static int maiorIdadeGlobal = 30;
	
	/* Main é um método auto executavel em Java*/
	public static void main(String[] args) {
		
		/* Variável local porque pertence somente a esse método*/
	int maiorIdade = 18;
	System.out.println("Valor variável local =" +maiorIdade);
	
	metodo2();
	}
	
	public static void metodo2 () {
		System.out.println("Valor da variável global = " + maiorIdadeGlobal);
	}
	
}
	
		
