package revisao2;

import java.util.LinkedList;

public class Aluno extends Pessoa{

	int matricula;
	LinkedList<Disciplina> listaDisciplinaAluno = new LinkedList<Disciplina>();

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		if(matricula > 0 && matricula <= 1000)
			this.matricula = matricula;
		else
			System.out.println("Matrícula inválida");
	}

	public LinkedList<Disciplina> getListaDisciplinaAluno() {
		return listaDisciplinaAluno;
	}

	public void setListaDisciplinaAluno(LinkedList<Disciplina> listaDisciplinaAluno) {
		this.listaDisciplinaAluno = listaDisciplinaAluno;
	}

	@Override
	public String toString() {
		return "Aluno [matricula=" + matricula + ", listaDisciplinaAluno=" + listaDisciplinaAluno + ", nome=" + nome
				+ "]";
	}

	

	

	//Não precisa mostrar as diciplinas aqui e sim na Secretaria
	
	
}
