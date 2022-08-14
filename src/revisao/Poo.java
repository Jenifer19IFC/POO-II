package revisao;

import java.util.LinkedList;

public class Poo extends Disciplina {

	LinkedList<Aluno> listaAlunos = new LinkedList<Aluno>();
	
	public Poo() {
		
	}

	public LinkedList<Aluno> getListaAlunos() {
		return listaAlunos;
	}


	public void setListaAlunos(LinkedList<Aluno> listaAlunos) {
		this.listaAlunos = listaAlunos;
	}


	public void addAluno(Aluno aluno) {
		if((aluno.matricula.validarMatricula(aluno.matricula.getNumMatricula()))) {
			listaAlunos.add(aluno);
			System.out.println("Aluno adicionado.");
		}else
			System.out.println("Matrícula inválida. Não foi possível adicionar o aluno!");
	}
	
	public void removerAluno(Aluno aluno) {
		if(listaAlunos.remove(aluno)) {
			System.out.println("\nAluno removido.");
		}else
			System.out.println("\nx 1Aluno não existe para remover.");
		
	}
	
	public void mostrarListaDeAlunos() {
		System.out.println(listaAlunos);
	}


	@Override
	public String toString() {
		return "Poo [listaAlunos=" + listaAlunos + ", professor=" + professor + "]";
	}



	
	
	
}
