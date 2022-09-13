package exercíciosGenerics;

import java.util.ArrayList;
import java.util.List;

public class PedidoAtv3<T> { //Pedido<T extends Produto> "correto"
	
	List<T> listProdutos = new ArrayList<T>();
	
	public void addProduto(T produto) {
		listProdutos.add(produto);
	}
	
	public List mostrarListProdutos() {
		return listProdutos;
	}

}
