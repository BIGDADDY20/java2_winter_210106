package inheritance_ex01;

public class Student extends Person {
	private String major;
	
	public Student() {
		System.out.println("학생입니다.");
	}
	
	public Student(String name, String major) {
		this.major = major;
		// 부모클래스의 name에 저장하는 법
		//super.name = name; 
		//super(name); // 부모의 생성자를 부른다. 생성자 호출은 첫번째 줄에만 위치해야 함
		this.name = name;
	}
	
	// 오버라이드: 부모클래스에 있는 메소드를 자식 클래스에서 재정의 하는 것
	@Override
	public void introduce() {
		 System.out.println("내 전공은 " + this.major + "입니다.");
		 super.introduce();
	}
}
