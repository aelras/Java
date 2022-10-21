package cursoJava.executavel;

public class PrimeiraClasseJava {
	
	/* Main é um método auto executavel em Java*/
	public static void main(String[] args) {
		
		/* String no Java sempre será um texto de tamanho qualquer */
		String nome = "André Gattermeyer";
		String cpf = "326.702.208-86";
		String telefone = "998726874";
		String endereco = "Londrina -PR";
		int idade = 38;
		
		/*
		System.out.println("Meu nome é " + nome + " e o meu CPF é " + cpf + " e eu moro em "
		+ endereco + " meu telefone é " + telefone + "minha idade é " + idade + "anos" );*/
		
		String saida = "Meu nome é " + nome + " e o meu CPF é " + cpf 
				+ " e eu moro em "
				+ endereco + " meu telefone é " + telefone + " e minha idade é " + idade + "anos" ;
		System.out.println(saida);
	}
}
