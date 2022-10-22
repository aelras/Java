package cursoJava.executavel;

public class PrimeiraClasseJava {

	public static void main(String[] args) {

		int nota1 = 70;
		int nota2 = 80;
		int nota3 = 60;
		int nota4 = 80;
		int media = 0;

		media = (nota1 + nota2 + nota3 + nota4) / 4;

		/* Condiçóes com IF e ELSE*/
		if (media >= 70) {
			System.out.println("Aluno foi aprovado: " + media);
		} else if (media >= 40 && media <= 69) {
			System.out.println("Aluno em recuperação: " + media);
		} else {
			System.out.println("Aluno foi reprovado: " + media);
		}
		
		/* Operadores ternários são para micro validações*/
		
		String saidaResultado;
		
		saidaResultado = media >= 70 ? "Aluno Aprovado" : (media >= 40 && media <= 69) ? "Aluno em Recuperação" : "Reprovado";
		
		System.out.println(saidaResultado);
	}
}
