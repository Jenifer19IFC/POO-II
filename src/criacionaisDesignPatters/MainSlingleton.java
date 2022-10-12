package criacionaisDesignPatters;

public class MainSlingleton {

	public static void main(String[] args) {
		
		//Singleton
		ComunicaSlingleton com1 = ComunicaSlingleton.getInstance();
		ComunicaSlingleton com2 = ComunicaSlingleton.getInstance();
		ComunicaSlingleton com3 = ComunicaSlingleton.getInstance();
		
		com1.setCodigo(1);
		com2.setMsg("Teste");
		com3.setTipo(true);
		
		System.out.println(com1);
		System.out.println(com2);
		System.out.println(com3);

	}

}
