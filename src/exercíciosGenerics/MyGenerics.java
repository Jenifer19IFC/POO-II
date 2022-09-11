package exercíciosGenerics;

public class MyGenerics<T>{
	
	public T element;
	
	public MyGenerics(T element) {
		this.element = element;
	}
	
	public void setElement(T element) {
		this.element = element;
	}
	
	public T getElement() {
		return element;
	}

	
	
}
