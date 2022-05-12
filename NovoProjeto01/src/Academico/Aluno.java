package NovoProjeto01.src.Academico;

public class Aluno {
	private String matricula;
	private String nome;
	private String endereco;
	private String cpf;
	
	public Aluno(String matricula, String nome,	
		String endereco, String cpf) {
			this.matricula = matricula;
			this.nome = nome;
			this.endereco = endereco;
			this.cpf = cpf;
		}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double calculaNota(double av1, double mediaTrabalhos) {
		int av2 = 9 / 2;
		String nome = "";
		double nota = 9.0 / 2;
		float nota1 = 9F / 2;
		boolean passou = false;
		System.out.println("av2: " + av2);
		System.out.println(nome);
		System.out.println("nota: " + nota);
		System.out.println("nota1: " + nota1);
		System.out.println(passou);
		return ((av1 * 2) + mediaTrabalhos) / 3;
	}
}
