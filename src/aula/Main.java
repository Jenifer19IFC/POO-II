package aula;

public class Main {

	public static void main(String[] args) {
		
		Notificacao n = new NotificacaoEmail();
		Alerta a = new Alerta(n);
		System.out.println(a.dispararAlerta());
		n = new NotificacaoSMS();
		a = new Alerta(n);
		System.out.println(a.dispararAlerta());
		n = new NotificacaoWhatsApp();
		a = new Alerta(n);
		System.out.println(a.dispararAlerta());
		
		NotificacaoInterface nI = new NotificacaoImplementsEmail();
		AlertaInterface aI = new AlertaInterface(nI);
		System.out.println(aI.dispararAlerta());
		nI = new NotificacaoImplementsSMS();
		aI = new AlertaInterface(nI);
		System.out.println(aI.dispararAlerta());
		nI = new NotificacaoImplementsWhatsApp();
		aI = new AlertaInterface(nI);
		System.out.println(aI.dispararAlerta());
		

	}

}
