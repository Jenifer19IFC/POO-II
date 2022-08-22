package atendimentoMedico;

import java.util.LinkedList;

public class Atestado extends Operacao{

	private int cid;
	
	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}
	
	public void emitirAtestado(Atendimento atendimento) {
		System.out.println("\n ------- ATESTADO -------");
		System.out.println("Prioridade " + atendimento.getPrioridade());
		System.out.println("Estados possíveis:\n"
				+ "1 - Chegada e recebimento de fita\n"
				+ "2 - Triagem\n"
				+ "3 - Atendimento\n"
				+ "4 - Resultado do médico");
		System.out.println("Estado atual: "+ atendimento.getEstado());
		System.out.println("Paciente: " + atendimento.getPaciente().getNome());
		System.out.println("Data de nascimento: " + atendimento.getPaciente().getDataNascimento());
		System.out.println("Médico: " + atendimento.getMedico().getNome());
		System.out.println("------------------");
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Atestado [cid=");
		builder.append(cid);
		builder.append(", getInicio()=");
		builder.append(getInicio());
		builder.append(", getFim()=");
		builder.append(getFim());
		builder.append("]");
		return builder.toString();
	}

	

	
	
	
}
