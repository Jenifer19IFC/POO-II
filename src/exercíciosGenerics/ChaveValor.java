package exercíciosGenerics;

import java.util.ArrayList;

import java.util.Comparator;
import java.util.List;

/**
 * 
 * Classe que recebe um parâmetro genérico
 * 
 * @author jenifergoedert10@gmail.com
 *
 * @param <V> Parâmetro principal da classe
 */

public class ChaveValor<V> {
	
	public String  key;
	private V value;
	
	/**
	 * Detalhamento do construtor
	 * 
	 * @param key Key(chave) da classe, ultilizado como uma chave primária, valor String
	 * @param value Value(valor) é um tipo genérico que será passado na criação de um objeto
	 */
	
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
