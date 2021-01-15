package class_quiz01;

public class PersonTest {

	public static void main(String[] args) {
		// 사람   new
		// 사람 속성 저장
		// 사람 행위 동작
		Person boram = new Person();
		boram.name = "신보람";
		boram.yyyymmdd = "19990101";
		boram.gender = "여자";
		
		boram.greet();
		boram.walk();
		boram.introduce();
		boram.printAge();
	}

}
