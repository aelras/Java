package cursoJava.executavel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import cursoJava.classes.Aluno;
import cursoJava.classes.Disciplina;

public class PrimeiraClasseJava {

	/* Main é um método auto executavel em Java */
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		for (int qtd = 1 ; qtd <= 2; qtd++) {

		/* new Aluno() é uma instância (criação de objeto) */
		/* aluno1 é uma referencia para o objeto Aluno */

		String nome = JOptionPane.showInputDialog("Qual é o nome do aluno? " + qtd + " ?");
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
		
		if (escolha == 0) { /* Opção sim é 0*/
			
			int continuarRemover = 0;
			int posicao = 1;
			
			while(continuarRemover == 0){
				String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina 1, 2, 3 ou 4 ? ");
				aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao); 
				posicao++; // ++ soma +1
				continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover ? ");
			}
		}
			
		alunos.add(aluno1);
	}
		
		for (Aluno aluno : alunos) {
			
			System.out.println(aluno.toString()); /* Descrição do objeto na memoria */
			System.out.println("Média do aluno = " + aluno.getMediaNota());
			System.out.println("resultado =  " + aluno.getAlunoAprovado2());
			System.out.println("------------------------------------------------------------------------");
		}
	
		
	}

}
