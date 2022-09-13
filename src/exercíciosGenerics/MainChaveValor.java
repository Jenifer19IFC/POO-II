package exercíciosGenerics;

import java.util.ArrayList;
import java.util.List;

public class MainChaveValor {

	public static void main(String[] args) {

		ChaveValor<Integer> cv1 = new ChaveValor<Integer>("CV01",123);
		ChaveValor<String> cv2 = new ChaveValor<String>("CV02","Apontador");
		ChaveValor<String> cv3 = new ChaveValor<String>("CV03","Banana");
		ChaveValor<String> cv4 = new ChaveValor<String>("CV03","Notebok");
		ChaveValor<Integer> cv5 = new ChaveValor<Integer>("CV05",345);
		
		ListaChavesValores list = new ListaChavesValores();
		
		System.out.println(list.inserir(cv1));
		System.out.println(list.inserir(cv2));
		System.out.println(list.inserir(cv3));
		System.out.println("\nLista:");
		list.mostrarLista();
		
		System.out.println(list.inserir(cv4));
		System.out.println(list.inserir(cv5));
		
		System.out.println("\nLista agora:");
		list.mostrarLista();
		
		System.out.println("\nBUSCA:");
		list.buscaChave("CV07");
		
	}

}
