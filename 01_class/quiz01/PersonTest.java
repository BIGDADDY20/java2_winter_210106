package class_quiz01;

public class PersonTest {

	public static void main(String[] args) {
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
