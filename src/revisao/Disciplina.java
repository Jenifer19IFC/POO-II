package revisao;

public class Disciplina {

	String professor;
	
	public Disciplina() {
	}

	public String getProfessor() {
		return professor;
	}

	public void setProfessor(String professor) {
		this.professor = professor;
	}

	@Override
	public String toString() {
		return "Disciplina [professor=" + professor + "]";
	}
	
	
}
