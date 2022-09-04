package injecaoDependenciaPaiFilha;

public class Aluno extends Pessoa {

	int matricula;
	String cpf;
	String dataNascimento;
	String email;
	
	public Aluno() {
		
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Aluno [matricula=");
		builder.append(matricula);
		builder.append(", cpf=");
		builder.append(cpf);
		builder.append(", dataNascimento=");
		builder.append(dataNascimento);
		builder.append(", email=");
		builder.append(email);
		builder.append(", nome=");
		builder.append(nome);
		builder.append("]");
		return builder.toString();
	}
	
	
}
