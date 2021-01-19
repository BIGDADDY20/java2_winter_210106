package inheritance_ex01;

public class InheritanceTest {

	public static void main(String[] args) {
//		Person p1 = new Person("신보람");
//		p1.introduce();
		
		Student st1 = new Student("신보람", "컴퓨터공학과"); // 부모 생성자가 불린 후 자식 생성자 불린다.
		st1.introduce();
	}

}
