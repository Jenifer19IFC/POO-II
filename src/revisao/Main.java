package revisao;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Disciplina disciplina = new Disciplina();
		disciplina.setProfessor("Daniel");
		//System.out.println(disciplina);

		Matricula matricula = new Matricula();
		
		Aluno aluno = new Aluno();
		aluno.setNome("Jênifer");
		aluno.setCpf("109.419.629-03");
		aluno.setEndereco("Centro, Rio do Sul");
		aluno.matricula.setNumMatricula(123);
		System.out.println("Aluno 1:\n" + aluno);
		
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Ana");
		aluno2.setCpf("100.419.324-03");
		aluno2.setEndereco("Centro, Rio do Sul");
		aluno2.matricula.setNumMatricula(500);
		System.out.println("Aluno 2:\n" + aluno2);
		
		Aluno aluno3 = new Aluno();
		aluno3.setNome("Djonatan");
		aluno3.setCpf("132.342.343-78");
		aluno3.setEndereco("Canta Galo, Rio do Sul");
		aluno3.matricula.setNumMatricula(999);
		System.out.println("Aluno 3:\n" + aluno3);
		
		Poo poo = new Poo();
		System.out.println("\nDiscipina de Poo:\n");
		poo.setProfessor("Curvello");
		poo.addAluno(aluno);
		poo.addAluno(aluno2);
		poo.addAluno(aluno3);
		System.out.println("\nMostrando alunos matriculados\n");
		poo.mostrarListaDeAlunos();
		poo.removerAluno(aluno2);
		System.out.println("\nMostrando após alunos removidos\n");
		poo.mostrarListaDeAlunos();
		System.out.println(poo);
		
	}

}
