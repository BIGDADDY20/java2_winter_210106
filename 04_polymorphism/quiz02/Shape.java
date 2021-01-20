package polymorphism_quiz02;

public class Shape {
	// field
	protected String name;
	protected double area;
	
	// method
	public void printArea() {
		System.out.println("도형은 " + this.name + "이며 넓이는 " + this.area + "입니다.");
	}
}
