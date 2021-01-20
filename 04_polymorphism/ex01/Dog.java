package polymorphism_ex01;

public class Dog extends Animal {
	@Override
	public void cry() {
		System.out.println("왈왈");
	}
	
	// 꼬리치기
	public void lash() {
		System.out.println("꼬리치기");
	}
}
