package atendimentoMedico;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class Pessoa {

		private Date dataNascimento;
		private String nome;
		
		public Date getDataNascimento() {
			return dataNascimento;
		}

		public void setDataNascimento(Date dataNascimento) {
			this.dataNascimento = dataNascimento;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public int calcularIdade(String primeiraData, String segundaData) throws ParseException{

			SimpleDateFormat formatarData = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
	        Date data1 = formatarData.parse(primeiraData);
	        Date data2 = formatarData.parse(segundaData);

	        long dif = data2.getTime() - data1.getTime();

	        TimeUnit time = TimeUnit.DAYS; 
	        long diferenca = time.convert(dif, TimeUnit.MILLISECONDS);
	        
	        //Converte long para int
	        int myInt = Math.toIntExact(diferenca);
	        int idade = myInt/365;
	        
	        return idade;

		}

		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("Pessoa [dataNascimento=");
			builder.append(dataNascimento);
			builder.append(", nome=");
			builder.append(nome);
			builder.append("]");
			return builder.toString();
		}
		
		
		
		
		
}
