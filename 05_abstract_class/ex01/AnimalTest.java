package abstract_class_ex01;

public class AnimalTest {

	public static void main(String[] args) {
		/**
		 * 추상클래스(Abstract class)
			-상속 기반
			-객체로 생성할 수 없다. new를 할 수 없다.
			-부모 클래스가 된다.
			-구현이 하나라도 안된 메소드가 있으면 추상클래스
		 */
		Animal animal = new Tiger(); // upcasting
		animal.cry();
		animal.eat();
	}

}
