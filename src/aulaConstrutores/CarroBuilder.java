package aulaConstrutores;

public abstract class CarroBuilder {
	
	protected CarroProduct carro = new CarroProduct();
	
	//enum para mysql
	public abstract void buildPreco();
	public abstract void builDscMotor();
	public abstract void buildAnoFabricacao();
	public abstract void buildModelo();
	public abstract void buildMontadora();
	
	public CarroProduct getCarro() {
		return carro;
	}
	

}
