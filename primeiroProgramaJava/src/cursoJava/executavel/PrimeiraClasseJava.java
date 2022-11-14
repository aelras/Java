package cursoJava.executavel;

import javax.swing.JOptionPane;

import cursoJava.classes.Aluno;

public class PrimeiraClasseJava {

	
	/* Main é um método auto executavel em Java*/
	public static void main(String[] args) {

		
		/* new Aluno() é uma instância (criação de objeto)*/
		/* aluno1 é uma referencia para o objeto Aluno*/
		
		/*String nome = JOptionPane.showInputDialog("Qual é o nome do aluno? ");
		String idade = JOptionPane.showInputDialog("Qual é a idade ? ");
		String dataNascimento = JOptionPane.showInputDialog("Qual é a data de nascimento? ");
		String RegistroGeral = JOptionPane.showInputDialog("Qual é o RG do aluno? ");
		String Cpf = JOptionPane.showInputDialog("Qual é o Cpf do aluno? ");
		String NomeMae = JOptionPane.showInputDialog("Qual é o nome da mãe do aluno? ");
		String NomePai = JOptionPane.showInputDialog("Qual é o nome do pai do aluno? ");
		String DataMatricula = JOptionPane.showInputDialog("Qual é a data da matricula do aluno? ");
		String SerieMatriculado = JOptionPane.showInputDialog("Qual é a série do aluno? ");
		String NomeEscola = JOptionPane.showInputDialog("Qual é o nome da escola do aluno ?");
		String nota1 = JOptionPane.showInputDialog("Nota 1");
		String nota2 = JOptionPane.showInputDialog("Nota 2");
		String nota3 = JOptionPane.showInputDialog("Nota 3");
		String nota4 = JOptionPane.showInputDialog("Nota 4");
		
		
		Aluno aluno1 = new Aluno(); 
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade)); 
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(RegistroGeral);
		aluno1.setNumeroCpf(Cpf);
		aluno1.setNomeMae(NomeMae);
		aluno1.setNomePai(NomePai);
		aluno1.setDataMatricula(DataMatricula);
		aluno1.setSerieMatriculado(SerieMatriculado);
		aluno1.setNomeEscola(NomeEscola);
		aluno1.setNota1(Double.parseDouble(nota1));
		aluno1.setNota2(Double.parseDouble(nota2));
		aluno1.setNota3(Double.parseDouble(nota3));
		aluno1.setNota4(Double.parseDouble(nota4));
		
		System.out.println("Nome do aluno 1 é : " + aluno1.getNome());
		System.out.println("Idade do aluno 1 é : " + aluno1.getIdade());
		System.out.println("Data de nascimento do aluno 1 é : " + aluno1.getDataNascimento());
		System.out.println("RG do aluno 1 é : " + aluno1.getRegistroGeral());
		System.out.println("média da nota é = " + aluno1.getMediaNota());
		System.out.println("Resultado = " +( aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
		System.out.println("Resultado 2 = " + aluno1.getAlunoAprovado2());
		

		/*System.out.println(aluno1.toString()); /*Descrição do objeto na memoria*/
		/*System.out.println("Média do aluno = "  + aluno1.getMediaNota());
		System.out.println("resultado =  " + aluno1.getAlunoAprovado2());*/
		
		
		/*Equals e hashcode (diferenciar e comparar objetos)*/
		
		Aluno aluno1 = new Aluno();
		aluno1.setNome("André");
		aluno1.setNumeroCpf("123");
		
		Aluno aluno2 = new Aluno();
		aluno2.setNome("André");
		aluno2.setNumeroCpf("1234");
		
		if (aluno1.equals(aluno2)) {
			System.out.println("alunos são iguais");
		}else {
			System.out.println("Alunos não são iguais");
		}
		
		
	}

}