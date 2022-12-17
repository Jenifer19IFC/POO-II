package aulaConstrutores;

public class FaitBuilder extends CarroBuilder{

	@Override
	public void buildPreco() {
		carro.setPreco(33000.00);
	}

	@Override
	public void builDscMotor() {
		carro.setDscMotor("1.4 Flex");
	}

	@Override
	public void buildAnoFabricacao() {
		carro.setAnoFabricacao(2018);
	}

	@Override
	public void buildModelo() {
		carro.setModelo("Palio");
	}

	@Override
	public void buildMontadora() {
		carro.setMontadora("Fiat");
	}
	

}
