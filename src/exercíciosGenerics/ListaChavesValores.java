package exercíciosGenerics;

import java.util.ArrayList;
import java.util.List;

public class ListaChavesValores {
	
	List<ChaveValor> listChavesValores = new ArrayList<ChaveValor>();
	
	public  boolean inserir(ChaveValor cv) {
		boolean x = false;
		int cont = 0;
		for(int i = 0; i < this.listChavesValores.size(); i++){
		    if(cv.getKey().equals(this.listChavesValores.get(i).getKey())) {
		    	cont++;
		    }
		}
		if(cont == 0) {
			this.listChavesValores.add(cv);
			return x = true;
		}else {
			return x = false;
		}
	}
	
	public void mostrarLista() {
		for(int i = 0; i < this.listChavesValores.size(); i++){
			System.out.println("Chave: " + this.listChavesValores.get(i).getKey() +" - Valor: " +this.listChavesValores.get(i).getValue());
		}
		
	}
	
	public void buscaChave(String chave) {
		for(int i = 0; i < this.listChavesValores.size(); i++){
		    if(chave.equals(this.listChavesValores.get(i).getKey())) {
		    	System.out.println("Chave: " + this.listChavesValores.get(i).getKey() + " - Valor: " + this.listChavesValores.get(i).getValue());	
		    	break;
		    }
		}

	}

	

	
	


}
