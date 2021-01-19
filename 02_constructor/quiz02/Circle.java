package constructor_quiz02;

public class Circle {
	// 필드 
	private int radius;
	private double pi = 3.14;
	
	// 메소드
	public Circle(int radius) {
		this.radius = radius;
	}
	
	public int getRadius() {
		return this.radius;
	}
	
	// 넓이 구하기
	public double getArea() {
		return this.radius * this.radius * this.pi;
	}
	
	// 둘레 구하기
	public double getRound() {
		return this.radius * 2 * this.pi;
	}
	
	// 원의 n개의 넓이 구하기
	public double getAreaByCount(int count) {
		// 원의 넓이 * count
		return this.getArea() * count;
	}
	
}
