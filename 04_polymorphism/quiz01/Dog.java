package polymorphism_quiz01;

public class Dog extends Animal {
	@Override
	public void cry() {
		System.out.println("왈왈");
	}
	
	public void lash() {
		System.out.println("꼬리치기");
	}
}
