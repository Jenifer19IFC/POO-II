package atendimentoMedico;

public class IdiomaIngles implements Idioma{
	
	@Override
	public String atendimentoMedico() {
		return "\n---------- MEDICAL ATTENTION ----------\n";
	}

	@Override
	public String menu() {
		return "----- MENU -----\n"
				+ "1 - Doctors and specialties\n"
				+ "2 - Service\n"
				+ "3 - Exit the program";
	}

	@Override
	public String menuOp1() {
		return "What do you want to do?\n"
				+ "1 - Access the list of doctors and specialties\n"
				+ "0 - Exit";
	}

	@Override
	public String medicosEspecialidades() {
		return " \n-- LIST OF DOCTORS AND THEIR SPECIALTIES:";
	}

	@Override
	public String voltar0() {
		return "\nEnter 0 to go back";
	}

	@Override
	public String menuOp2() {
		return "\nPlease read below carefully:"
				+ "\n 0 - Is the patient at risk of death?"
				+ "\n 1 - Sudden/constant strong symptoms?"
				+ "\n 2 - Despite mild symptoms, is there a need for an appointment?"
				+ "\n 3 - Schedule an appointment/get a new prescription or medication?"
				+ "\n 4 - Routine exams only?";
	}

	@Override
	public String trueFalse() {
		return "\n1 - Now, answer with 'true' only the alternative that corresponds to your need:";
	}

	@Override
	public String alt0() {
		return "\nAlternative 0?";
	}

	@Override
	public String alt1() {
		return "\nAlternative 1?";
	}

	@Override
	public String alt2() {
		return "\nAlternative 2?";
	}

	@Override
	public String alt3() {
		return "\nAlternative 3?";
	}

	@Override
	public String alt4() {
		return "\nAlternative 4?";
	}

	@Override
	public String digitarPrioridade() {
		return "NOTE: Maximum priority is 0."
				+ "\nEnter the priority number assigned to you";
	}

	@Override
	public String nomePaciente() {
		return "\nWhat is your name?";
	}

	@Override
	public String digitarDataNascimento() {
		return "\nEnter the date of birth in the format: dd/MM/yyyy ";
	}

	@Override
	public String idade() {
		return "\nAge: ";
	}

	@Override
	public String listaMedicos() {
		return "\nList of doctors:";
	}

	@Override
	public String digitarNumMedico() {
		return "\nEnter your doctor's number in the order it appears.";
	}

	@Override
	public String digitarInicioConsulta() {
		return "\nEnter the query start date in the format: dd/MM/yyyy HH:mm:ss";
	}

	@Override
	public String listaPorPrioridade() {
		return "\nService list ordered by priority:";
	}

	@Override
	public String aguardar() {
		return "\nWait to be called...";
	}

	@Override
	public String digitarFimConsulta() {
		return "\nEnter the end date of the query in the format: dd/MM/yyyy HH:mm:ss";
	}

	@Override
	public String duracaoAtendimento() {
		return "\nService duration:";
	}

	@Override
	public String emitirAtestadoSimNao() {
		return "\nIssue certificate? 1 - Yes and 2 - No";
	}

	@Override
	public String fimPrograma() {
		return "\nEnd of program.";
	}
	
	

}