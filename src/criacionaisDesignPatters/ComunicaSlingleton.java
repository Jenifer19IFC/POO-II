package criacionaisDesignPatters;

public class ComunicaSlingleton {
	
	//Singleton
	private static ComunicaSlingleton conn;
	
	private int codigo;
	private String msg;
	private boolean tipo;
	
	private ComunicaSlingleton() {
		
	}
	

	public static ComunicaSlingleton getConn() {
		return conn;
	}

	public static void setConn(ComunicaSlingleton conn) {
		ComunicaSlingleton.conn = conn;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public boolean isTipo() {
		return tipo;
	}

	public void setTipo(boolean tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Comunica [codigo=");
		builder.append(codigo);
		builder.append(", msg=");
		builder.append(msg);
		builder.append(", tipo=");
		builder.append(tipo);
		builder.append("]");
		return builder.toString();
	}
	
	public static ComunicaSlingleton getInstance() {
		if(conn == null) {
			conn = new ComunicaSlingleton();
		}
		return conn;//sempre a mesma instancea
	}

}
