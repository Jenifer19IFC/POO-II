package revisao2;

public class Main {

	public static void main(String[] args) {
		
		Disciplina disciplina = new Disciplina();
		disciplina.setNome("Poo");
		disciplina.setCargaHoraria(60);

		Disciplina disciplina2 = new Disciplina();
		disciplina2.setNome("BD");
		disciplina2.setCargaHoraria(45);

		Disciplina disciplina3 = new Disciplina();
		disciplina3.setNome("Cálculo");
		disciplina3.setCargaHoraria(55);
	
		//System.out.println(disciplina2);
		
		Professor prof = new Professor();
		prof.setNome("Ruy");
		prof.setTitulacao("Pós-graduado");
		prof.listaDisciplinaProfessor.add(disciplina3);
		prof.listaDisciplinaProfessor.addLast(disciplina);
		//prof.mostrarListaDeDisciplinas(prof.listaDisciplinaProfessor);
		
		System.out.println("Professor:");
		System.out.println(prof);
		
		Aluno aluno = new Aluno();
		aluno.setNome("Jênifer");
		aluno.setMatricula(123);
		aluno.listaDisciplinaAluno.add(disciplina);
		aluno.listaDisciplinaAluno.add(disciplina2);
		aluno.listaDisciplinaAluno.add(disciplina3);
		
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Marina");
		aluno2.setMatricula(234);
		aluno2.listaDisciplinaAluno.add(disciplina2);
		
		
		System.out.println("\nAluno:");
		System.out.println(aluno2);
		
		Secretaria secretaria = new Secretaria();
		System.out.println("\n");
		
		secretaria.emitirHistorico(aluno);
		
	}

}
