package atendimentoMedico;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class Operacao {
	
	private Date inicio;
	private Date fim;
	
	
	
	public Date getInicio() {
		return inicio;
	}

	public void setInicio(Date inicio) {
		this.inicio = inicio;
	}

	public Date getFim() {
		return fim;
	}

	public void setFim(Date fim) {
		this.fim = fim;
	}

	public void tempoTotal(Date date1, Date date2) {

	    long diff = date2.getTime() - date1.getTime();

	    List<TimeUnit> unidades = new ArrayList<TimeUnit>(EnumSet.allOf(TimeUnit.class));
	    Collections.reverse(unidades);

	   
	    Map<TimeUnit,Long> resultado = new LinkedHashMap<TimeUnit,Long>();
	    long restoMilesimo = diff;

	    for ( TimeUnit unidade : unidades ) {

	    long diferenca = unidade.convert(restoMilesimo,TimeUnit.MILLISECONDS);
	    long difMilesimosUnidade = unidade.toMillis(diferenca);
	    restoMilesimo = restoMilesimo - difMilesimosUnidade;

	    resultado.put(unidade,diferenca); 
	    System.out.println(diferenca + " " + unidade);
	    
	    }
	   
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Operacao [inicio=");
		builder.append(inicio);
		builder.append(", fim=");
		builder.append(fim);
		builder.append(", getInicio()=");
		builder.append(getInicio());
		builder.append(", getFim()=");
		builder.append(getFim());
		builder.append("]");
		return builder.toString();
	}

	

	

}
