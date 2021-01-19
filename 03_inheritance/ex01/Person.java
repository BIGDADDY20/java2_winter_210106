package inheritance_ex01;

// 부모클래스, super class
public class Person {
	protected String name;    // public, private, default, protected
	
	public Person() {
		System.out.println("응애~~~");
	}
	
	// 생성자 Overloading 
	public Person(String name) {
		this.name = name;
	}
	
	public void introduce() {
		System.out.println("내 이름은 " + this.name + "입니다.");
	}
	
}
