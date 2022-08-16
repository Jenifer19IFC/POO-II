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
		
		Professor prof2 = new Professor();
		prof2.setNome("Patricia");
		prof2.setTitulacao("Mestrado");
		prof2.listaDisciplinaProfessor.add(disciplina2);
		prof2.listaDisciplinaProfessor.addLast(disciplina);
		prof2.mostrarListaDeDisciplinas(prof2.listaDisciplinaProfessor);
		
		System.out.println("Professor:");
		System.out.println(prof2);
		
		Aluno aluno = new Aluno();
		aluno.setNome("Jênifer");
		aluno.setMatricula(10);
		aluno.listaDisciplinaAluno.add(disciplina);
		aluno.listaDisciplinaAluno.add(disciplina2);
		aluno.listaDisciplinaAluno.add(disciplina3);
		
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Marina");
		aluno2.setMatricula(234);
		aluno2.listaDisciplinaAluno.add(disciplina2);
		
		
		System.out.println("\nAluno:");
		System.out.println(aluno);
		
		Secretaria secretaria = new Secretaria();
		System.out.println("\n");
		
		secretaria.emitirHistorico(aluno);
		
	}

}
