package cursoJava.executavel;

import cursoJava.classes.Aluno;

public class PrimeiraClasseJava {

	
	/* Main é um método auto executavel em Java*/
	public static void main(String[] args) {

		
		/* new Aluno() é uma instância (criação de objeto)*/
		/* aluno1 é uma referencia para o objeto Aluno*/
		Aluno aluno1 = new Aluno(); /* Aqui será o João*/
		aluno1.nome = "joão";
		aluno1.idade = 50;
		
		System.out.println("Nome do aluno 1 é: " + aluno1.nome);
		System.out.println("Idade é: " + aluno1.idade);
		
		Aluno aluno2 = new Aluno(); /*Aqui será o Pedro*/ 
		
		Aluno aluno3 = new Aluno(); /*Aqui será o André*/
		
		Aluno aluno4 = new Aluno("Maria");
		
		Aluno  aluno5 = new Aluno("José", 50);
	
		
	}

}