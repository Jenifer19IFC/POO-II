package aula;

import java.util.ArrayList;
import java.util.List;

public class UvaMain {

	/*public static void main(String[] args) {
		
		List list = new ArrayList();//LISTA SEM DEFINIR TIPO
		Uva b = new Uva("Verde");
		list.add(b); // => VALIDADO EM TEMPO DE EXECUCAO
		
		Banana b1 = (Banana)list.get(0); // CAST(BANANA) PARA ESPECIFICAR TIPO => VALIDADO EM TEMPO DE EXECUCAO
		System.out.println(b1.toString());

	}*/
	
	public static void main(String[] args) {
		
		//Erro de compilação => nem compila
		List<Banana> list = new ArrayList<Banana>();//LISTA SEM DEFINIR TIPO
		Uva b = new Uva("Verde");
		//list.add(b); // => VALIDADO EM TEMPO DE EXECUCAO
		
		Banana b1 = (Banana)list.get(0); // CAST(BANANA) PARA ESPECIFICAR TIPO => VALIDADO EM TEMPO DE EXECUCAO
		System.out.println(b1.toString());

	}

}
