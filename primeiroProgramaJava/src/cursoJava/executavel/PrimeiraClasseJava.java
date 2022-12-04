package cursoJava.executavel;

import javax.swing.JOptionPane;

import cursoJava.classes.Aluno;
import cursoJava.classes.Disciplina;

public class PrimeiraClasseJava {

	/* Main é um método auto executavel em Java */
	public static void main(String[] args) {

		/* new Aluno() é uma instância (criação de objeto) */
		/* aluno1 é uma referencia para o objeto Aluno */

		String nome = JOptionPane.showInputDialog("Qual é o nome do aluno? ");
		/*String idade = JOptionPane.showInputDialog("Qual é a idade ? ");
		String dataNascimento = JOptionPane.showInputDialog("Qual é a data de nascimento? ");
		String RegistroGeral = JOptionPane.showInputDialog("Qual é o RG do aluno? ");
		String Cpf = JOptionPane.showInputDialog("Qual é o Cpf do aluno? ");
		String NomeMae = JOptionPane.showInputDialog("Qual é o nome da mãe do aluno? ");
		String NomePai = JOptionPane.showInputDialog("Qual é o nome do pai do aluno? ");
		String DataMatricula = JOptionPane.showInputDialog("Qual é a data da matricula do aluno? ");
		String SerieMatriculado = JOptionPane.showInputDialog("Qual é a série do aluno? ");
		String NomeEscola = JOptionPane.showInputDialog("Qual é o nome da escola do aluno ?");*/

		Aluno aluno1 = new Aluno();

		aluno1.setNome(nome);
		/*aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(RegistroGeral);
		aluno1.setNumeroCpf(Cpf);
		aluno1.setNomeMae(NomeMae);
		aluno1.setNomePai(NomePai);
		aluno1.setDataMatricula(DataMatricula);
		aluno1.setSerieMatriculado(SerieMatriculado);
		aluno1.setNomeEscola(NomeEscola);*/
		
		for (int pos = 1; pos <= 4; pos++) {
			
			String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina "+pos+" ?");
			String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina "+pos+" ?");
			
			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(Double.valueOf(notaDisciplina));
			
			aluno1.getDisciplinas().add(disciplina);
		}
		
		int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina? ");
		
		if (escolha == 0) {
			String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina 1, 2, 3 ou 4 ? ");
			aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - 1); 
		}

		/*System.out.println("Nome do aluno 1 é : " + aluno1.getNome());
		System.out.println("Idade do aluno 1 é : " + aluno1.getIdade());
		System.out.println("Data de nascimento do aluno 1 é : " + aluno1.getDataNascimento());
		System.out.println("RG do aluno 1 é : " + aluno1.getRegistroGeral());
		System.out.println("média da nota é = " + aluno1.getMediaNota());
		System.out.println("Resultado = " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
		System.out.println("Resultado 2 = " + aluno1.getAlunoAprovado2());*/

		System.out.println(aluno1.toString()); /* Descrição do objeto na memoria */
		System.out.println("Média do aluno = " + aluno1.getMediaNota());
		System.out.println("resultado =  " + aluno1.getAlunoAprovado2());

	}

}
