package polymorphism_quiz02;

public class Triangle extends Shape {
	// 밑변, 높이 => 넓이
	// 삼각형 => 이름
	public Triangle(double base, double height) {
		this.name = "삼각형";
		this.area = base * height / 2;
	}
}
