package exercíciosGenerics;

public class MainProduto {

	public static void main(String[] args) {
		
		Produto<Integer> produtoIdInteger = new Produto<Integer>();

		produtoIdInteger.setProduto("Sabão em pó");
		produtoIdInteger.setId(0014);
		produtoIdInteger.setValor(20.50);
		produtoIdInteger.setDataFabricacao("10/01/2022");
		produtoIdInteger.setDataVencimento("10/09/2022");
		
		System.out.println(" Produto '" + produtoIdInteger.getProduto() + "' com id do tipo Integer:");
		System.out.println(" Id: "+ produtoIdInteger.getId()
		+ "\n Valor: R$ " + produtoIdInteger.getValor()
		+ "\n Data de fabricação: " + produtoIdInteger.getDataFabricacao()
		+ " \n Data de vencimento: " + produtoIdInteger.getDataVencimento());
		
		Produto<String> produtoIdString = new Produto<String>();

		produtoIdString.setProduto("Sabão em pó"); 
		produtoIdString.setId("AC0014");
		produtoIdString.setValor(20.50);
		produtoIdString.setDataFabricacao("10/01/2022");
		produtoIdString.setDataVencimento("10/09/2022");
		
		System.out.println("\n Produto '" + produtoIdString.getProduto() + "' com id do tipo String:");
		System.out.println(" Id: "+ produtoIdString.getId()
		+ "\n Valor: R$ " + produtoIdString.getValor()
		+ "\n Data de fabricação: " + produtoIdString.getDataFabricacao()
		+ " \n Data de vencimento: " + produtoIdString.getDataVencimento());
	}

}
