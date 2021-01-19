package constructor_quiz02;

public class CircleTest {

	public static void main(String[] args) {
		Circle circle1 = new Circle(8);
		System.out.println(circle1.getRadius());
		
		System.out.println("원의 넓이는: " + circle1.getArea());
		System.out.println("원의 둘레는: " + circle1.getRound());
		System.out.println("원 25개의 넓이: " + circle1.getAreaByCount(25));
	}

}
