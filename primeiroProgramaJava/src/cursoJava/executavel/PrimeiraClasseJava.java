package cursoJava.executavel;

public class PrimeiraClasseJava {

	public static void main(String[] args) {

		int nota1 = 70;
		int nota2 = 80;
		int nota3 = 70;
		int nota4 = 60;
		int media = 0;

		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.println("A média é: " + media);
		/* Operações lógicas aninhadas: São operações dentro de operações*/
		
		if (media >= 50) {
			if (media >= 70) {
				if (media > 90) {
					System.out.println("Aluno está aprovado! Parabéns");
				} else {
					System.out.println("Aluno está aprovado!");
				}
			} else {
				System.out.println("Aluno está em recuperação!");
			}
		}
	}
}