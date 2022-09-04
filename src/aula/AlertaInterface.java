package aula;

public class AlertaInterface {

	protected NotificacaoInterface notificacao;
	
	public  AlertaInterface(NotificacaoInterface notificacao) {
		this.notificacao = notificacao;
	}
	
	public String dispararAlerta() {
		return this.notificacao.enviar();
	}
}
