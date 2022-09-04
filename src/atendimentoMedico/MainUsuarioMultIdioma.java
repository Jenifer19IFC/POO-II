package atendimentoMedico;

import java.text.ParseException;
import java.util.Scanner;

public class MainUsuarioMultIdioma {

	public static void main(String[] args) throws ParseException {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Selecione o idioma para inicializar o sistema: 1- Português e 2- Inglês\n"
				+ "Select the language to boot the system: 1- Portuguese and 2- English");
		
		int opUsuario = input.nextInt();
		
		if(opUsuario == 1){
			//Interface / tipo de idioma
			Idioma idioma = new IdiomaPortugues();
			//EnviaTraducao não sabe o que envia, mas envia uma traducao de um tipo de idioma
			EnviaTraducao enviaTraducao = new EnviaTraducao(idioma);
			enviaTraducao.inicia();
		}else if(opUsuario == 2) {
			Idioma idioma = new IdiomaIngles();
			EnviaTraducao enviaTraducao = new EnviaTraducao(idioma);
			enviaTraducao.inicia();
		}else {
			//Sistema padrão
			Idioma idioma = new IdiomaPortugues();
			EnviaTraducao enviaTraducao = new EnviaTraducao(idioma);
			enviaTraducao.inicia();
			
		}
			

	}

}
