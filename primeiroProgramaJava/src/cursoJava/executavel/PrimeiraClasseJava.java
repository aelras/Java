package cursoJava.executavel;

import cursoJava.classes.Aluno;

public class PrimeiraClasseJava {

	
	/* Main é um método auto executavel em Java*/
	public static void main(String[] args) {

		
		Aluno aluno1 = new Aluno(); /* Aqui será o João*/
		
		Aluno aluno2 = new Aluno(); /*Aqui será o Pedro*/ 
		
		Aluno aluno3 = new Aluno(); /*Aqui será o André*/
		
		Aluno aluno4 = new Aluno("Maria");
		
		Aluno  aluno5 = new Aluno("José", 50);
	
	}

}