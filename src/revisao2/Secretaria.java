package revisao2;

public class Secretaria {

	public void emitirHistorico(Aluno aluno) {
		System.out.println("\nHist�rico do aluno: ");
		System.out.println(aluno.getNome());
		System.out.println("----------");
		System.out.println(aluno.getListaDisciplinaAluno());
	}
	
}
