package NovoProjeto01.src.Academico;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aluno aluno = new Aluno("20201123456","Ze da Silva",
				"rua das marrecas s/n", "12345678910");
		System.out.println("matricula: " + aluno.getMatricula());
		System.out.println("nome: " + aluno.getNome() + " cpf: " + aluno.getCpf());
		System.out.println("endere�o: " + aluno.getEndereco());
		System.out.println("cpf: " + aluno.getCpf());
		
		System.out.println("nota: " + aluno.calculaNota(7, 5));
		
		int a = 20,b=11;
		
		
	}
}
