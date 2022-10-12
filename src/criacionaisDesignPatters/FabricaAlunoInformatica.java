package criacionaisDesignPatters;

public class FabricaAlunoInformatica implements FabricaDeAluno {

	@Override
	public Aluno criarAluno() {
		return new AlunoInformatica();
	}

}
