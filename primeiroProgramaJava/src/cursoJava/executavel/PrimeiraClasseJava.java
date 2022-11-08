package cursoJava.executavel;

import cursoJava.classes.Aluno;

public class PrimeiraClasseJava {

	
	/* Main é um método auto executavel em Java*/
	public static void main(String[] args) {

		
		/* new Aluno() é uma instância (criação de objeto)*/
		/* aluno1 é uma referencia para o objeto Aluno*/
		Aluno aluno1 = new Aluno(); /* Aqui será o João*/
		aluno1.setNome("João da Silva");
		aluno1.setIdade(15);
		aluno1.setDataNascimento("12/06/1984");
		aluno1.setRegistroGeral("543214786-0");
		aluno1.setNumeroCpf("145687332-32");
		aluno1.setNomeMae("Vilma");
		aluno1.setNomePai("Maurício");
		aluno1.setDataMatricula("10/01/2019");
		aluno1.setSerieMatriculado("5");
		aluno1.setNomeEscola("Jdev treinamentos");
		aluno1.setNota1(90);
		aluno1.setNota2(80.8);
		aluno1.setNota3(70.9);
		aluno1.setNota4(90.7);
		
		System.out.println("Nome do aluno 1 é : " + aluno1.getNome());
		System.out.println("Idade do aluno 1 é : " + aluno1.getIdade());
		System.out.println("Data de nascimento do aluno 1 é : " + aluno1.getDataNascimento());
		System.out.println("RG do aluno 1 é : " + aluno1.getRegistroGeral());
		System.out.println("média da nota é = " + aluno1.getMediaNota());
		System.out.println("Resultado = " +( aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
		System.out.println("Resultado 2 = " + aluno1.getAlunoAprovado2());
		
		System.out.println("=============================================");
		
		Aluno aluno2 = new Aluno(); /*Aqui será o Pedro*/ 
		aluno2.setNome("Pedro José");
		aluno2.setIdade(17);
		aluno2.setDataNascimento("18/05/2016");
		aluno2.setRegistroGeral("69875206-5");
		aluno2.setNumeroCpf("148987654-21");
		aluno2.setNomeMae("Joana");
		aluno2.setNomePai("João");
		aluno2.setDataMatricula("12/02/2016");
		aluno2.setSerieMatriculado("8");
		aluno2.setNomeEscola("Jdev treinamentos");
		aluno2.setNota1(50);
		aluno2.setNota2(60.5);
		aluno2.setNota3(70.5);
		aluno2.setNota4(70.9);
		
		System.out.println("Nome do aluno  2 é : " + aluno2.getNome());
		System.out.println("Idade do aluno 2 é : " + aluno2.getIdade());
		System.out.println("data de nascimento do aluno 2 é : " + aluno2.getDataNascimento());
		System.out.println("RG do aluno 2 é : " + aluno2.getRegistroGeral());
		System.out.println("média da nota é = " + aluno2.getMediaNota());
		System.out.println("Resultado = " +( aluno2.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
		System.out.println("Resultado 2 = " + aluno2.getAlunoAprovado2());
		
		
		
		System.out.println("=============================================");
		
		
		Aluno aluno3 = new Aluno(); /*Aqui será o André*/
		aluno3.setNome("André da Silva");
		aluno3.setIdade(38);
		aluno3.setDataNascimento("12/06/1984");
		aluno3.setRegistroGeral("43764537-x");
		aluno3.setNumeroCpf("326702208-86");
		aluno3.setNomeMae("Vilma");
		aluno3.setNomePai("Maurício");
		aluno3.setDataMatricula("08/05/2019");
		aluno3.setSerieMatriculado("1");
		aluno3.setNomeEscola("Jdev treinamentos");
		aluno3.setNota1(70);
		aluno3.setNota2(90.8);
		aluno3.setNota3(60.9);
		aluno3.setNota4(80.7);
		
		
		System.out.println("Nome do aluno  3 é : " + aluno3.getNome());
		System.out.println("Idade do aluno 3 é : " + aluno3.getIdade());
		System.out.println("data de nascimento do aluno 3 é : " + aluno3.getDataNascimento());
		System.out.println("RG do aluno 3 é : " + aluno3.getRegistroGeral());
		System.out.println("média da nota é = " + aluno3.getMediaNota());
		System.out.println("Resultado = " +( aluno3.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
		System.out.println("Resultado 2 = " +aluno3.getAlunoAprovado2() );
		
	
	
		
	}

}