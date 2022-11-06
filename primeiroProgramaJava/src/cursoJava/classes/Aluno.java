package cursoJava.classes;

/*Esta é nossa classe/objeto que representa o Aluno*/
public class Aluno {

	/* Esses são os atributos do Aluno*/
	public String nome;
	public int idade;
	public String dataNascimento;
	public String registroGeral;
	public String numeroCpf;
	public String nomeMae;
	public String nomePai;
	public String dataMatricula;
	public String nomeEscola;
	public String serieMatriculado;
	
	public Aluno() { /* Cria os dados na memória - Sendo padrão do Java*/
		
	}
	
	public  Aluno (String nomePadrao) {
		
		nome = nomePadrao;
	}
	
	public Aluno (String nomePadrao, int idadePadrao) {
		nome = nomePadrao;
		idade = idadePadrao;
	}
}
	
