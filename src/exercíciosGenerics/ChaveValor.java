package exercíciosGenerics;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ChaveValor<V> {
	
	public String  key;
	private V value;
	
	public ChaveValor(String key, V value) {
		this.key = key;
		this.value = value;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ChaveValor [key=");
		builder.append(key);
		builder.append(", value=");
		builder.append(value);
		builder.append("]");
		return builder.toString();
	}

	

	
	
	

}
