package atendimentoMedico;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class EnviaTraducao {

	protected Idioma idioma;
	
	public  EnviaTraducao(Idioma idioma) {
		this.idioma = idioma;
	}
	
	public void inicia() throws ParseException {
		
		Scanner input = new Scanner(System.in);
		
		Pessoa pessoa = new Pessoa();
		Paciente paciente = new Paciente();
		DateFormat dateFormat1 = new SimpleDateFormat("dd/MM/yyyy");
		
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
		
		
		System.out.println(idioma.atendimentoMedico());
		
		while(true) {
			
			System.out.println(idioma.menu());
			int menuOp = input.nextInt();
			
				if(menuOp == 1) {
					
						System.out.println(idioma.menuOp1());
						int medicoOp = input.nextInt();
						
						if(medicoOp == 1) {
							System.out.println(idioma.medicosEspecialidades());
							for(int i = 0; i < listMedicos.size(); i++){
							    System.out.println(listMedicos.get(i));
							}	
							System.out.println(idioma.voltar0());
							int voltar = input.nextInt();
						}
						else {
							continue;
						}
				}//menuOp
				
				
				if(menuOp == 2) {
	
						System.out.println(idioma.menuOp2());
						
						System.out.println(idioma.trueFalse());
						
						atendimento = new Atendimento();
						System.out.println(idioma.alt0());
						boolean resp0 = input.nextBoolean();
						System.out.println(idioma.alt1());
						boolean resp1 = input.nextBoolean();
						System.out.println(idioma.alt2());
						boolean resp2 = input.nextBoolean();
						System.out.println(idioma.alt3());
						boolean resp3 = input.nextBoolean();
						System.out.println(idioma.alt4());
						boolean resp4 = input.nextBoolean();
						
						boolean vetRespostas[] = {resp0, resp1, resp2, resp3, resp4};
						
						atendimento.calcularPrioridade(vetRespostas);
						
						System.out.println(idioma.digitarPrioridade());
						int prioPaciente = input.nextInt();
						
						atendimento.setPrioridade(prioPaciente);
						atendimento.setEstado(1);
						
						paciente = new Paciente();
						
						input.nextLine();
						
						System.out.println(idioma.nomePaciente());
						String nomePaciente = input.nextLine();
						paciente.setNome(nomePaciente);
						
						Date dataAtual = new Date();
					    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
					    //Caso queira com horas junto: HH:mm:ss
					    String dataString = dateFormat.format(dataAtual);
					    
						System.out.println(idioma.digitarDataNascimento());
						String dataNascimento = input.nextLine();
						
						//Transformar String para Date
						SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
						Date dataFormatada = formato.parse(dataNascimento);
						paciente.setDataNascimento(dataFormatada);	
						System.out.println(idioma.idade());
						System.out.println(paciente.calcularIdade(dataNascimento, dataString));
						
						atendimento.setPaciente(paciente);
						
						System.out.println(idioma.listaMedicos());
						for (Medico p : listMedicos) {
							System.out.println(p);
						}
						System.out.println(idioma.digitarNumMedico());
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
						
						System.out.println(idioma.digitarInicioConsulta());
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
						System.out.println(idioma.listaPorPrioridade());
						listaAtendimento.mostrarLista(listAtendimentos);
						
						System.out.println(idioma.aguardar());
						
						System.out.println(idioma.digitarFimConsulta());
						String dataFim = input.nextLine();
						SimpleDateFormat formatoFim = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); 
						Date dataFormatadaFim = formatoFim.parse(dataFim);
						atestado.setFim(dataFormatadaFim);
						System.out.println(dataFormatadaFim);
						
						System.out.println(idioma.duracaoAtendimento());
						operacao.tempoTotal(dataFormatadaInicio, dataFormatadaFim);

						listAtendimentos.add(atendimento);
	
						atendimento.setEstado(4);
						
						System.out.println(idioma.emitirAtestadoSimNao());
						int emitirAtestado = input.nextInt();
						
						if(emitirAtestado == 1) {
							atestado.emitirAtestado(atendimento);
						}
						
					}
				if(menuOp == 3) {
					System.out.println(idioma.fimPrograma());
					System.exit(0);
				}
					
		}//while menu
		
		
		
	}
}
