package exercíciosGenerics;

public class MainProdutosAtv3 {

	public static void main(String[] args) {
		
		ProdutoXAtv3 produto = new ProdutoXAtv3();
		produto.setNome("Pasta");
		produto.setId(0012);
		produto.setMarca("Colgate");

		ProdutoXAtv3 produto2 = new ProdutoXAtv3();
		produto2.setNome("Sabonete");
		produto2.setId(0021);
		produto2.setMarca("Nívea");
		
		PedidoAtv3<ProdutoXAtv3> pedido = new PedidoAtv3<ProdutoXAtv3>();
		
		pedido.addProduto(produto);
		pedido.addProduto(produto2);
		pedido.mostrarListProdutos();
		
		System.out.println(pedido.mostrarListProdutos());
		
		

	}

}
