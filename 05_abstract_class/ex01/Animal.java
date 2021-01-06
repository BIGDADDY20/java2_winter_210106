package abstract_class_ex01;

public abstract class Animal {
	// 추상메소드
	// 자식 클래스가 반드시 구현해야 하는 메소드이다.
	public abstract void cry();

	// 일반메소드
	public void eat() {
		System.out.println("냠냠");
	}
}
