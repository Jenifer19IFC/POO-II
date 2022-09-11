package injecaoDependenciaPaiFilha;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EnviaPersistencia {

	protected AlvoPersistencia alvo;
	
	public EnviaPersistencia(AlvoPersistencia alvo) {
		this.alvo = alvo;
	}
	
	public void dispararArquivo(List listAlunos) throws IOException {
		alvo.salva(listAlunos);
	}
	
}
