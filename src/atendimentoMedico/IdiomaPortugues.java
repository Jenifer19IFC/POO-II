package atendimentoMedico;


public class IdiomaPortugues implements Idioma{
	
	@Override
	public String atendimentoMedico() {
		return "\n---------- ATENDIMENTO MÉDICO ----------\n";
	}

	@Override
	public String menu() {
		return "----- MENU -----\n"
				+ "1 - Médicos e especialidades\n"
				+ "2 - Atendimento\n"
				+ "3 - Sair do programa";
	}

	@Override
	public String menuOp1() {
		return "O que deseja fazer?\n"
				+ "1 - Acessar lista de médicos e especialidades\n"
				+ "0 - Sair";
	}

	@Override
	public String medicosEspecialidades() {
		return " -- LISTA DE MÉDICOS E SUAS ESPECIALIDADES:";
	}

	@Override
	public String voltar0() {
		return "\nDigite 0 para voltar";
	}

	@Override
	public String menuOp2() {
		return "\nLeia abaixo com atenção:"
				+ "\n 0 - Paciente corre risco de morte?"
				+ "\n 1 - Sintomas fortes repentinos/constantes?"
				+ "\n 2 - Apesar de sintomas leves, há necessidade de uma consulta?"
				+ "\n 3 - Agendar uma consulta/pegar nova receita ou remédio?"
				+ "\n 4 - Apenas exames de rotina?";
	}

	@Override
	public String trueFalse() {
		return "\n1 - Agora, responda com 'true' somente a alternativa que corresponde com a sua necessidade:";
	}

	@Override
	public String alt0() {
		return "\nAternativa 0?";
	}

	@Override
	public String alt1() {
		return "\nAternativa 1?";
	}

	@Override
	public String alt2() {
		return "\nAternativa 2?";
	}

	@Override
	public String alt3() {
		return "\nAternativa 3?";
	}

	@Override
	public String alt4() {
		return "\nAternativa 4?";
	}

	@Override
	public String digitarPrioridade() {
		return "OBS: Prioridade máxima é 0."
				+ "\nDigite o n° da prioridade designada a você";
	}

	@Override
	public String nomePaciente() {
		return "\nQual o seu nome?";
	}

	@Override
	public String digitarDataNascimento() {
		return "\nDigite a data de nascimento no formato: dd/MM/yyyy ";
	}

	@Override
	public String idade() {
		return "\nIdade: ";
	}

	@Override
	public String listaMedicos() {
		return "\nLista de médicos:";
	}

	@Override
	public String digitarNumMedico() {
		return "\nDigite o número do seu médico na ordem em que aparece.";
	}

	@Override
	public String digitarInicioConsulta() {
		return "\nDigite a data de início da consulta no formato: dd/MM/yyyy HH:mm:ss";
	}

	@Override
	public String listaPorPrioridade() {
		return "\nLista de atendimento ordenada por prioridade:";
	}

	@Override
	public String aguardar() {
		return "\n Aguarde ser chamado...";
	}

	@Override
	public String digitarFimConsulta() {
		return "\nDigite a data de fim da consulta no formato: dd/MM/yyyy HH:mm:ss";
	}

	@Override
	public String duracaoAtendimento() {
		return "\nDuração do atendimento:";
	}

	@Override
	public String emitirAtestadoSimNao() {
		return "\nEmitir atestado? 1 - Sim e 2 - Não";
	}

	@Override
	public String fimPrograma() {
		return "\n Fim do programa.";
	}
	

}
