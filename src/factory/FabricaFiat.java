package factory;

public class FabricaFiat implements FabricaDeCarro{
	
	public CarroSedan criaCarroSedan() {
		return new Siena();
	}
	
	public CarroPopular criaCarroPopular() {
		return new Palio();
	}
		

}
