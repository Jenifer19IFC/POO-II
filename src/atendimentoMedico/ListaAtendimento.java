package atendimentoMedico;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListaAtendimento {
	
	
	public void addLista(List listAtendimentos, Atendimento atendimento) {
		listAtendimentos.add(atendimento);
	}
	
	public void comparadorPrioridade(List listAtendimentos) {
		listAtendimentos.sort(Comparator.comparing(Atendimento::getPrioridade));
	}

	public void  mostrarLista(List listAtendimento) {
		for(int i = 0; i < listAtendimento.size(); i++){
		    System.out.println(listAtendimento.get(i));
		}	
	}
	
	
	
}
