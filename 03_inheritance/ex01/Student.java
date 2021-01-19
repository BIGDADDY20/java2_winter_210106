package inheritance_ex01;

public class Student extends Person {
	private String major;
	
	public Student() {
		System.out.println("학생입니다.");
	}
	
	public Student(String name, String major) {
		//super(name);   // 부모 생성자를 부르는 것. 첫 줄에 있어야 한다.
		this.major = major;
		this.name = name;
		// super.name = name;
	}
	
	// 오버라이드(Override): 상속관계에서 부모클래스에 있는 메소드를 자식클래스에서 재정의 하는 것.
	@Override   // annotation(어노테이션): 메타 데이터
	public void introduce() {
		// 내 이름은 OO이다. 내 전공은 OO이다.
		super.introduce();
		System.out.println("내 전공은 " + this.major + "이다.");
	}
}
