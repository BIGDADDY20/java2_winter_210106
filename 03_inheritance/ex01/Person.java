package inheritance_ex01;

public class Person {
	protected String name;
	
	public Person() {
		System.out.println("응애~~");
	}
	
	// 생성자 오버로딩
	// 오버로딩: 같은 이름의 메소드를 여러개 가지면서 매개변수(파라미터)가 다르게 하는 것 
	public Person(String name) {
		this.name = name;
	}
	
	public void introduce() {
		// 내 이름은 OO 입니다.
		System.out.println("내 이름은 " + this.name + "입니다.");
	}
}
