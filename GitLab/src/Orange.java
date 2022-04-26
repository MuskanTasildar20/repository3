
public class Orange {
String color;
	
	Orange(String color)
	{
		this.color=color;
	}
	void Display() {
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Orange greenApple = new Orange("green");
		String color = greenApple.getColor();
		System.out.println("color of apple is " + color);
	}
	private String getColor() {
		// TODO Auto-generated method stub
		return null;
	}


}
