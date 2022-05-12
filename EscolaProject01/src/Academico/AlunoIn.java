package EscolaProject01.src.Academico;

public class AlunoIn {
	private int id;
	private String nome;
	private String matricula;
	
	public AlunoIn(int id, String nome, String mat) {
		this.id = id;
		this.nome = nome;
		this.matricula = mat;
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
	
}
