package atendimentoMedico;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Iterator;

public class Atendimento extends Operacao implements Comparable<Atendimento>{

	private int prioridade;
	private int estado;
	private Medico  medico;
	private Paciente paciente;
	
	public int getPrioridade() {
		return prioridade;
	}


	public void setPrioridade(int prioridade) {
		this.prioridade = prioridade;
	}


	public int getEstado() {
		return estado;
	}


	public void setEstado(int estado) {
		if(estado > 0 && estado < 5)
			this.estado = estado;
	}
	

	public Medico getMedico() {
		return medico;
	}


	public void setMedico(Medico medico) {
		this.medico = medico;
	}


	public Paciente getPaciente() {
		return paciente;
	}


	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}


	public void calcularPrioridade(boolean vetRespostas[]) {
		int prioridade = 0;
		for (int i = 0; i < vetRespostas.length; i++) {
			if(vetRespostas[i] == true) {
				prioridade = i;
			}
		}
		if(prioridade == 0) {
			System.out.println("Prioridade " + prioridade);
		}if(prioridade == 1) { 
			System.out.println("Prioridade " + prioridade);
		}if(prioridade == 2) {
			System.out.println("Prioridade " + prioridade);
		}if(prioridade == 3){
			System.out.println("Prioridade " + prioridade);
		}if(prioridade == 4){
			System.out.println("Prioridade " + prioridade);
		}
		
		
	}
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Atendimento [prioridade=");
		builder.append(prioridade);
		builder.append(", estado=");
		builder.append(estado);
		builder.append(", medico=");
		builder.append(medico);
		builder.append(", paciente=");
		builder.append(paciente);
		builder.append("]");
		return builder.toString();
	}


	@Override
	public int compareTo(Atendimento o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
