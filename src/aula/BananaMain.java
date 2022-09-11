package aula;

import java.util.ArrayList;
import java.util.List;

public class BananaMain {

	/*public static void main(String[] args) {
		
		List<Banana> list = new ArrayList<Banana>(); //LISTA DEFINE TIPO
		Banana b = new Banana("Branca","Brasil");
		list.add(b);
		
		Banana b1 = list.get(0);
		System.out.println(b1.toString());
		
	}*/
	
	public static void main(String[] args) {
		
		List list = new ArrayList();//LISTA SEM DEFINIR TIPO
		Banana b = new Banana("Branca","Brasil");
		list.add(b); // => VALIDADO EM TEMPO DE EXECUCAO
		
		Banana b1 = (Banana)list.get(0); // CAST(BANANA) PARA ESPECIFICAR TIPO => VALIDADO EM TEMPO DE EXECUCAO
		System.out.println(b1.toString());
		
	}

}
