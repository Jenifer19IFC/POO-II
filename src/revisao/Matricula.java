package revisao;

public class Matricula {

	public int numMatricula;
	
	public int getNumMatricula() {
		return numMatricula;
	}

	public void setNumMatricula(int numMatricula) {
		this.numMatricula = numMatricula;
	}

	public boolean validarMatricula(int numMatricula) {
		if(numMatricula > 0 && numMatricula <= 1000) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Matricula [numMatricula=" + numMatricula + "]";
	}
	
	
	
}
