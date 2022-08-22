package atendimentoMedico;

import java.util.ArrayList;
import java.util.List;

public class Medico extends Pessoa{

	List<Especialidade> listEspecialidades = new ArrayList<Especialidade>();
	
	public void addEspecialidade(Especialidade especialidade) {
		listEspecialidades.add(especialidade);
	}
	
	public void mostrarList() {
		System.out.println(listEspecialidades);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Medico [listEspecialidades=");
		builder.append(listEspecialidades);
		builder.append(", getDataNascimento()=");
		builder.append(getDataNascimento());
		builder.append(", getNome()=");
		builder.append(getNome());
		builder.append("]");
		return builder.toString();
	}

	
	

	

	

	
	
	
}
