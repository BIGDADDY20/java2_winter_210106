package constructor_quiz01;

public class Rectangle {
	private int width;
	private int height;
	
	public Rectangle(int width, int height) { 
		this.width = width;
		this.height = height;
		System.out.println("가로" + width + "cm, 세로" + height + "cm 사각형이 만들어졌습니다.");
	}
	
	public int getArea() {
		return width * height;
	}
	
	public int getRound() {
		return (width * 2) + (height * 2);
	}
	
}
