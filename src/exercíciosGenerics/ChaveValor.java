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

	

	
	
	

}
