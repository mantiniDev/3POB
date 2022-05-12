package EscolaProject01.src.Academico;

public class Aluno {
	private int id;
	private String nome;
	private String matricula;
	
	public Aluno(AlunoIn aluno) {
		this.id = aluno.getId();
		this.nome = aluno.getNome();
		this.matricula = aluno.getMatricula();
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public boolean validarMatricula() {
		return false;
	}
}
