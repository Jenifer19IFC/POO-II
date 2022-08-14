package revisao;

public class Aluno {

	
	public String nome;
	private String cpf;
	private String endereco;
	protected Matricula matricula;
	
	public Aluno() {
		matricula = new Matricula();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Matricula getMatricula() {
		return matricula;
	}

	public void setMatricula(Matricula matricula) {
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", cpf=" + cpf + ", endereco=" + endereco + ", matricula=" + matricula + "]";
	}

	

	

	

	
	
	
	
	
}
