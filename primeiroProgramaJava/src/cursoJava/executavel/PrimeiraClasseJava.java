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
		
		System.out.println("Nome do aluno 1 é : " + aluno1.getNome());
		System.out.println("Idade do aluno 1 é : " + aluno1.getIdade());
		System.out.println("Data de nascimento do aluno 1 é : " + aluno1.getDataNascimento());
		System.out.println("RG do aluno 1 é : " + aluno1.getRegistroGeral());
		System.out.println("CPF do aluno 1 é : " + aluno1.getNumeroCpf());
		System.out.println("Nome da mãe  do aluno 1 é : " + aluno1.getNomeMae());
		System.out.println("Nome do pai do aluno 1 é : " + aluno1.getNomePai());
		System.out.println("Data da matrícula do aluno 1 é : " + aluno1.getDataMatricula());
		System.out.println("Série do aluno 1 é : " + aluno1.getSerieMatriculado() + " série");
		System.out.println("Nome da escola é : " + aluno1.getNomeEscola());
		
		
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
		
		System.out.println("Nome do aluno  2 é : " + aluno2.getNome());
		System.out.println("Idade do aluno 2 é : " + aluno2.getIdade());
		System.out.println("data de nascimento do aluno 2 é : " + aluno2.getDataNascimento());
		System.out.println("RG do aluno 2 é : " + aluno2.getRegistroGeral());
		System.out.println("CPF do aluno 2 é : " + aluno2.getNumeroCpf());
		System.out.println("Nome da mãe  do aluno 2 é : " + aluno2.getNomeMae());
		System.out.println("Nome do pai do aluno 2 é : " + aluno2.getNomePai());
		System.out.println("Data da matrícula do aluno 2 é : " + aluno2.getDataMatricula());
		System.out.println("Série do aluno 2 é : " + aluno2.getSerieMatriculado() + " série");
		System.out.println("Nome da escola é : " + aluno2.getNomeEscola());
		
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
		
		System.out.println("Nome do aluno  3 é : " + aluno3.getNome());
		System.out.println("Idade do aluno 3 é : " + aluno3.getIdade());
		System.out.println("data de nascimento do aluno 3 é : " + aluno3.getDataNascimento());
		System.out.println("RG do aluno 3 é : " + aluno3.getRegistroGeral());
		System.out.println("CPF do aluno 3 é : " + aluno3.getNumeroCpf());
		System.out.println("Nome da mãe  do aluno 3 é : " + aluno3.getNomeMae());
		System.out.println("Nome do pai do aluno 3 é : " + aluno3.getNomePai());
		System.out.println("Data da matrícula do aluno 3 é : " + aluno3.getDataMatricula());
		System.out.println("Série do aluno 3 é : " + aluno3.getSerieMatriculado() + " série");
		System.out.println("Nome da escola é : " + aluno3.getNomeEscola());
		
		Aluno aluno4 = new Aluno("Maria");
		
		Aluno  aluno5 = new Aluno("José", 50);
	
		
	}

}