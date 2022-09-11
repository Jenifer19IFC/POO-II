package exercíciosGenerics;

public class MainMyGenerics {

	public static void main(String[] args) {
		
		MyObjectColor myColor = new  MyObjectColor();
		myColor.setColor("Vermelho");
		
		MyGenerics<Integer> i = new MyGenerics<Integer>(234); // Tipo 1
		MyGenerics<String> s = new MyGenerics<String>("Olá!"); // Tipo 2
		MyGenerics<MyObjectColor> myColorGererics = new MyGenerics<MyObjectColor>(myColor); // Tipo 3
		
		int MyInt = i.getElement();
		String MyString = s.getElement();
		MyObjectColor myC  = myColor;
		
		System.out.println("Tipo INTEIRO: " + MyInt);
		System.out.println("Tipo STRING: " + MyString);
		System.out.println("Tipo COR: " + myC);

	}

}
