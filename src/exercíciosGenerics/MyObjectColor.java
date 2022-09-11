package exercíciosGenerics;

public class MyObjectColor {
	
	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MyObjectColor [color=");
		builder.append(color);
		builder.append("]");
		return builder.toString();
	}
	
	
	

}
