package exercíciosGenerics;

public class Produto<T> {
	
	String produto;
	private T id;
	double valor;
	String dataFabricacao;
	String dataVencimento;
	
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	public T getId() {
		return id;
	}
	public void setId(T id) {
		this.id = id;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public String getDataFabricacao() {
		return dataFabricacao;
	}
	public void setDataFabricacao(String dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}
	public String getDataVencimento() {
		return dataVencimento;
	}
	public void setDataVencimento(String dataVencimento) {
		this.dataVencimento = dataVencimento;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SoftwareProdutos [produto=");
		builder.append(produto);
		builder.append(", id=");
		builder.append(id);
		builder.append(", valor=");
		builder.append(valor);
		builder.append(", dataFabricacao=");
		builder.append(dataFabricacao);
		builder.append(", dataVencimento=");
		builder.append(dataVencimento);
		builder.append("]");
		return builder.toString();
	}
	

	

}
