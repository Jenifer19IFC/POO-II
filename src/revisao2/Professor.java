package revisao2;

import java.util.LinkedList;

public class Professor extends Pessoa{

	String titulacao;
	LinkedList<Disciplina> listaDisciplinaProfessor = new LinkedList<Disciplina>();
	
	public String getTitulacao() {
		return titulacao;
	}
	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}
	
	public LinkedList<Disciplina> getListaDisciplinaProfessor() {
		return listaDisciplinaProfessor;
	}
	public void setListaDisciplinaProfessor(LinkedList<Disciplina> listaDisciplinaProfessor) {
		this.listaDisciplinaProfessor = listaDisciplinaProfessor;
	}
	public void mostrarListaDeDisciplinas(LinkedList lista) {
		System.out.println("\nLista de disciplinas do professor:");
		System.out.println(lista);
	}
	@Override
	public String toString() {
		return "Professor [titulacao=" + titulacao + ", listaDisciplinaProfessor=" + listaDisciplinaProfessor
				+ ", nome=" + nome + "]";
	}
	
	
	
	
	
	
	
	
}
