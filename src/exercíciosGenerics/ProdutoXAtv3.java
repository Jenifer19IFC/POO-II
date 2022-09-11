package exercíciosGenerics;

public class ProdutoXAtv3 {
	
	String nome;
	int id;
	String marca;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ProdutoXAtv3 [nome=");
		builder.append(nome);
		builder.append(", id=");
		builder.append(id);
		builder.append(", marca=");
		builder.append(marca);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
