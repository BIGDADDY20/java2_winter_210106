package polymorphism_quiz02;

public class Rectangle extends Shape {
	// 가로, 세로
	public Rectangle(double width, double height) {
		this.name = "사각형";
		this.area = width * height;
	}
}
