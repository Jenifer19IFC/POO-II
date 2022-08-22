package atendimentoMedico;

import java.util.Date;
import java.util.Iterator;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NewMain {

	public static void main(String[] args) throws ParseException {
		
		Scanner input = new Scanner(System.in);
		
		Pessoa pessoa = new Pessoa();
		Paciente paciente = new Paciente();
		DateFormat dateFormat1 = new SimpleDateFormat("dd/MM/yyyy");
		//AQUIII
		Paciente paciente1 = new Paciente();
		paciente1.setNome("Ruan");
		String dataPac1 = "10/07/2000";
		SimpleDateFormat formato1 = new SimpleDateFormat("dd/MM/yyyy"); 
		Date dataFormatada1 = formato1.parse(dataPac1);
		//System.out.println(dataFormatada1);	
		paciente1.setDataNascimento(dataFormatada1);
		
		Paciente paciente2 = new Paciente();
		paciente2.setNome("Camila");
		String dataPac2 = "01/04/1990";
		SimpleDateFormat formato2 = new SimpleDateFormat("dd/MM/yyyy"); 
		Date dataFormatada2 = formato2.parse(dataPac2);
		//System.out.println(dataFormatada2);
		paciente2.setDataNascimento(dataFormatada2);
		
		Paciente paciente3 = new Paciente();
		paciente3.setNome("Karla");
		String dataPac3 = "15/06/1999";
		SimpleDateFormat formato3 = new SimpleDateFormat("dd/MM/yyyy"); 
		Date dataFormatada3 = formato3.parse(dataPac3);
		//System.out.println(dataFormatada3);
		paciente3.setDataNascimento(dataFormatada3);		
		
		Atendimento atendimento = new Atendimento();
		Operacao operacao = new Operacao();
		Atestado atestado = new Atestado();
		ListaAtendimento listaAtendimento = new ListaAtendimento();
		
		Especialidade especialidadePediatria = new Especialidade();
		especialidadePediatria.setDescricao("Pediatria");
		Especialidade especialidadeOdontologia = new Especialidade();
		especialidadeOdontologia.setDescricao("Odontologia");
		Especialidade especialidadePsicologia = new Especialidade();
		especialidadePsicologia.setDescricao("Psicologia");
		Especialidade especialidadeCirurgiasGeral = new Especialidade();
		especialidadeCirurgiasGeral.setDescricao("Cirurgias em geral");
		
		List<Medico> listMedicos = new ArrayList<>();
		Medico medicoValmor = new Medico();
		SimpleDateFormat formatoV = new SimpleDateFormat("dd/MM/yyyy"); 
		java.util.Date datam = formatoV.parse("11/05/1985");
		medicoValmor.setNome("Valmor");
		medicoValmor.setDataNascimento(datam);
		medicoValmor.addEspecialidade(especialidadePediatria);
		medicoValmor.addEspecialidade(especialidadePsicologia);
		//System.out.println(medicoValmor);
		listMedicos.add(medicoValmor);
		
		Medico medicoRubens = new Medico();
		SimpleDateFormat formatoR = new SimpleDateFormat("dd/MM/yyyy"); 
		java.util.Date dataR = formatoR.parse("01/09/1970");
		medicoRubens.setNome("Rubens");
		medicoRubens.setDataNascimento(dataR);
		medicoRubens.addEspecialidade(especialidadeCirurgiasGeral);
		//System.out.println(medicoRubens);
		listMedicos.add(medicoRubens);
		
		Medico medicoDanubia = new Medico();
		SimpleDateFormat formatoD = new SimpleDateFormat("dd/MM/yyyy"); 
		java.util.Date dataD = formatoR.parse("25/12/1990");
		medicoDanubia.setNome("Danubia");
		medicoDanubia.setDataNascimento(dataD);
		medicoDanubia.addEspecialidade(especialidadeOdontologia);
		//System.out.println(medicoDanubia);
		listMedicos.add(medicoDanubia);
		
		
		System.out.println("\n---------- ATENDIMENTO MÉDICO ----------\n");
		
		while(true) {
			
			System.out.println("----- MENU -----\n"
					+ "1 - Médicos e especialidades\n"
					+ "2 - Atendimento\n"
					+ "3 - Sair do programa");
			int menuOp = input.nextInt();
			
				if(menuOp == 1) {
					
						System.out.println("O que deseja fazer?\n"
								+ "1 - Acessar lista de médicos e especialidades\n"
								+ "0 - Sair");
						int medicoOp = input.nextInt();
						
						if(medicoOp == 1) {
							System.out.println(" -- LISTA DE MÉDICOS E SUAS ESPECIALIDADES:");
							for(int i = 0; i < listMedicos.size(); i++){
							    System.out.println(listMedicos.get(i));
							}	
							System.out.println("\nDigite 0 para voltar");
							int voltar = input.nextInt();
						}
						else {
							continue;
						}
				}//menuOp
				
				
				if(menuOp == 2) {
	
						System.out.println("\nLeia abaixo com atenção:");
						System.out.println("0 - Paciente corre risco de morte?");
						System.out.println("1 - Sintomas fortes repentinos/constantes?");
						System.out.println("2 - Apesar de sintomas leves, há necessidade de uma consulta?");
						System.out.println("3 - Agendar uma consulta/pegar nova receita ou remédio?");
						System.out.println("4 - Apenas exames de rotina?");
						
						System.out.println("\n1 - Agora, responda com 'true' somente a alternativa que corresponde com a sua necessidade:");
						
						atendimento = new Atendimento();
						System.out.println("\nAternativa 0?");
						boolean resp0 = input.nextBoolean();
						System.out.println(" \nAternativa 1?");
						boolean resp1 = input.nextBoolean();
						System.out.println(" \nAternativa 2?");
						boolean resp2 = input.nextBoolean();
						System.out.println(" \nAternativa 3?");
						boolean resp3 = input.nextBoolean();
						System.out.println(" \nAternativa 4?");
						boolean resp4 = input.nextBoolean();
						
						boolean vetRespostas[] = {resp0, resp1, resp2, resp3, resp4};
						
						atendimento.calcularPrioridade(vetRespostas);
						
						System.out.println("OBS: Prioridade máxima é 0.");
						System.out.println("\nDigite o n° da prioridade designada a você");
						int prioPaciente = input.nextInt();
						
						atendimento.setPrioridade(prioPaciente);
						atendimento.setEstado(1);
						
						paciente = new Paciente();
						
						input.nextLine();
						
						System.out.println("\nQual o seu nome?");
						String nomePaciente = input.nextLine();
						paciente.setNome(nomePaciente);
						
						Date dataAtual = new Date();
					    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
					    //Caso queira com horas junto: HH:mm:ss
					    String dataString = dateFormat.format(dataAtual);
					    
						System.out.println("\nDigite a data de nascimento no formato: dd/MM/yyyy ");
						String dataNascimento = input.nextLine();
						
						//Transformar String para Date
						SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
						Date dataFormatada = formato.parse(dataNascimento);
						paciente.setDataNascimento(dataFormatada);	
						System.out.println("\nIdade: "+ paciente.calcularIdade(dataNascimento, dataString) + " anos");
						
						atendimento.setPaciente(paciente);
						
						System.out.println("\nLista de médicos:");
						for (Medico p : listMedicos) {
							System.out.println(p);
						}
						System.out.println("\nDigite o número do seu médico na ordem em que aparece.");
						int numMedico = input.nextInt();
						
						if(numMedico == 1) {
							atendimento.setMedico(medicoValmor);
						}
						else if(numMedico == 2) {
							atendimento.setMedico(medicoRubens);
						}else {
							atendimento.setMedico(medicoDanubia);
						}
						
						input.nextLine();
						
						operacao = new Operacao();
						atestado = new Atestado();
						
						System.out.println("\nDigite a data de início da consulta no formato: dd/MM/yyyy HH:mm:ss");
						String dataInicio = input.nextLine();
						SimpleDateFormat formatoInicio = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); 
						Date dataFormatadaInicio = formatoInicio.parse(dataInicio);
						atestado.setInicio(dataFormatadaInicio);
						System.out.println(dataFormatadaInicio);
						

						Atendimento atendimento1 = new Atendimento(); 
						atendimento1.setPrioridade(2);
						atendimento1.setEstado(2);
						atendimento1.setMedico(medicoDanubia);
						atendimento1.setPaciente(paciente1);
						
						Atendimento atendimento2 = new Atendimento();
						atendimento2.setPrioridade(1);
						atendimento2.setEstado(3);
						atendimento2.setMedico(medicoRubens);
						atendimento2.setPaciente(paciente3);
						
						Atendimento atendimento3 = new Atendimento();
						atendimento3.setPrioridade(5);
						atendimento3.setEstado(3);
						atendimento3.setMedico(medicoValmor);
						atendimento3.setPaciente(paciente2);
						
						Atendimento atendimento4 = new Atendimento();
						atendimento4.setPrioridade(3);
						atendimento4.setEstado(1);
						atendimento4.setMedico(medicoValmor);
						atendimento4.setPaciente(paciente1);
						
						listaAtendimento = new ListaAtendimento();
						List<Atendimento> listAtendimentos = new ArrayList<>();
						listAtendimentos.add(atendimento1);
						listAtendimentos.add(atendimento2);
						listAtendimentos.add(atendimento3);
						listAtendimentos.add(atendimento4);
						listAtendimentos.add(atendimento);
						listaAtendimento.comparadorPrioridade(listAtendimentos);
						System.out.println("\nLista de atendimento ordenada por prioridade:");
						listaAtendimento.mostrarLista(listAtendimentos);
						
						System.out.println("\n Aguarde ser chamado...");
						
						System.out.println("\nDigite a data de fim da consulta no formato: dd/MM/yyyy HH:mm:ss");
						String dataFim = input.nextLine();
						SimpleDateFormat formatoFim = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); 
						Date dataFormatadaFim = formatoFim.parse(dataFim);
						atestado.setFim(dataFormatadaFim);
						System.out.println(dataFormatadaFim);
						
						System.out.println("\nDuração do atendimento:");
						operacao.tempoTotal(dataFormatadaInicio, dataFormatadaFim);

						listAtendimentos.add(atendimento);
	
						atendimento.setEstado(4);
						
						System.out.println("\nEmitir atestado? 1 - Sim e 2 - Não");
						int emitirAtestado = input.nextInt();
						
						if(emitirAtestado == 1) {
							atestado.emitirAtestado(atendimento);
						}
						
					}
				if(menuOp == 3) {
					System.out.println("\n Fim do programa.");
					System.exit(0);
				}
					
		}//while menu
		

	}

}
