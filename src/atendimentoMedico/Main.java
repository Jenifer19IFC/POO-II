package atendimentoMedico;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import java.util.MissingResourceException;
import java.util.ResourceBundle;
public class Main {

	public static void main(String[] args) throws ParseException {
		
		Scanner input = new Scanner(System.in);
		
		//Transformar Date em String
		
		/*Date dataAtual = new Date();
	    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	    //Caso queira com horas junto: HH:mm:ss
	    String dataString = dateFormat.format(dataAtual);
	    //System.out.println(dataString);
	    
		System.out.println("Digite a data de nascimento no formato: dd/MM/yyyy ");
		String dataNascimento = input.nextLine();
		
		//Transformar String para Date
		
		Pessoa pessoa = new Pessoa();
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
		Date dataFormatada = formato.parse(dataNascimento);
		pessoa.setDataNascimento(dataFormatada);
		System.out.println(dataFormatada);		
		pessoa.setDataNascimento(dataFormatada);
		pessoa.setNome("Jênifer Vieira Goedert");
		System.out.println(pessoa);
		System.out.println("Idade: " + pessoa.calcularIdade(dataNascimento, dataString) + " anos");*/
		
		//---------------------------------------
		
		System.out.println("Digite a data de início no formato: dd/MM/yyyy HH:mm:ss");
		String dataInicio = input.nextLine();
		SimpleDateFormat formatoInicio = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); 
		Date dataFormatadaInicio = formatoInicio.parse(dataInicio);
		System.out.println(dataFormatadaInicio);
		
		System.out.println("Digite a data de fim no formato: dd/MM/yyyy HH:mm:ss");
		String dataFim = input.nextLine();
		SimpleDateFormat formatoFim = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); 
		Date dataFormatadaFim = formatoFim.parse(dataFim);
		System.out.println(dataFormatadaFim);
		
		Operacao operacao = new Operacao();
		//System.out.println("Duração da operaçaõ: " + operacao.diferencaHoras(dataInicio, dataFim) + " horas");
		
		//System.out.println("tempo total:\n");
		//operacao.diferencaHoras(dataInicio, dataFim);
		
		System.out.println("map");
		operacao.tempoTotal(dataFormatadaInicio, dataFormatadaFim);
		
		
		
		/*System.out.println("Leia abaixo com atenção:");
		System.out.println("0 - Paciente corre risco de morte?");
		System.out.println("1 - Sintomas fortes repentinos/constantes?");
		System.out.println("2 - Apesar de sintomas leves, há necessidade de uma consulta?");
		System.out.println("3 - Agendar uma consulta/pegar nova receita ou remédio?");
		System.out.println("4 - Apenas exames de rotina?");
		
		System.out.println("1 - Agora, responda com 'true' somente a alternativa que corresponde com a sua necessidade:");
		
		System.out.println(" Aternativa 0?");
		boolean resp0 = input.nextBoolean();
		System.out.println(" Aternativa 1?");
		boolean resp1 = input.nextBoolean();
		System.out.println(" Aternativa 2?");
		boolean resp2 = input.nextBoolean();
		System.out.println(" Aternativa 3?");
		boolean resp3 = input.nextBoolean();
		System.out.println(" Aternativa 4?");
		boolean resp4 = input.nextBoolean();
		
		boolean vetRespostas[] = {resp0, resp1, resp2, resp3, resp4};
		
		Atendimento atendimento = new Atendimento(); 
		atendimento.setPrioridade(2);
		atendimento.setEstado(2);
		atendimento.calcularPrioridade(vetRespostas);
		
		Atendimento atendimento2 = new Atendimento();
		atendimento2.setPrioridade(1);
		atendimento2.setEstado(3);
		
		Atendimento atendimento3 = new Atendimento();
		atendimento3.setPrioridade(5);
		atendimento3.setEstado(4);
		

		Atestado atestado = new Atestado();
		
		atestado.setCid(32);
		atestado.emitirAtestado(atendimento);
		
		System.out.println(atestado);
		
		ListaAtendimento listaAtendimento = new ListaAtendimento();
		List<Atendimento> listAtendimentos = new ArrayList<>(); 
		
		listaAtendimento.addLista(listAtendimentos, atendimento3);
		listaAtendimento.addLista(listAtendimentos, atendimento);
		listaAtendimento.addLista(listAtendimentos, atendimento2);
		listaAtendimento.comparadorPrioridade(listAtendimentos);
		System.out.println("Lista de atendimento ordenada por prioridade:");
		System.out.println(listaAtendimento.mostrarLista(listAtendimentos));
		
		
		/*Especialidade especialidade = new Especialidade();
		especialidade.setDescricao("Pediatria");
		
		Especialidade especialidade2 = new Especialidade();
		especialidade2.setDescricao("Odontologia");
		
		Especialidade especialidade3 = new Especialidade();
		especialidade3.setDescricao("Cirurgia");
		
		
		System.out.println(especialidade);
		
		System.out.println("Digite a data de nascimento do médico no formato dd/MM/yyyy:");
		String dataNascMedico = input.nextLine();
		
		SimpleDateFormat formatom = new SimpleDateFormat("dd/MM/yyyy"); 
		Date datam = formatom.parse(dataNascMedico);
		System.out.println(datam); 
		
		Medico medico = new Medico();
		medico.setNome("Valmor");
		medico.setDataNascimento(datam);
		medico.addEspecialidade(especialidade3);
		medico.addEspecialidade(especialidade);
		medico.mostrarList();
		System.out.println(medico);*/
		
		
		
	}

}
