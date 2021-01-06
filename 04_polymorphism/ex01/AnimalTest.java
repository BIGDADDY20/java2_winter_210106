package polymorphism_ex01;

public class AnimalTest {

	public static void main(String[] args) {
		//Animal animal = new Animal();
		
		/**
		 * up casting(업캐스팅): 자식 -> 부모로 캐스팅
		 * 1. 부모 클래스의 메소드를 사용할 수 있다.
		 * 2. 부모 클래스에 있는 메소드를 오버라이드 한 메소드를 사용할 수 있다.
		 * 3. 자식 클래스에만 있는 메소드는 사용할 수 없다. 
		 */
		Animal animal = new Cat();
		animal.eat();
		animal.cry();
		// animal.grooming();  // 사용 불가
		
		/**
		 * down casting(다운캐스팅): 부모 -> 자식으로 캐스팅
		 */
		if (animal instanceof Dog) {
			Dog dog = (Dog) animal;
			dog.lash();
		} else if (animal instanceof Cat) {
			Cat cat = (Cat) animal;
			cat.grooming();
		}
	}

}
