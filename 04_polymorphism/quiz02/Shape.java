package polymorphism_quiz02;

public class Shape {
	protected String name;
	protected double area;
	
	public void printArea() {
		System.out.println("도형은 " + this.name + "이며 넓이는 " + this.area + "cm^2 입니다.");
	}
}
