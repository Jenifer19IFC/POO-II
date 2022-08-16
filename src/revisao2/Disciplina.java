package revisao2;

public class Disciplina {

	String nome;
	int cargaHoraria;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	@Override
	public String toString() {
		return "Disciplina [nome=" + nome + ", cargaHoraria=" + cargaHoraria + "]";
	}
	
	
	

	
	
}
