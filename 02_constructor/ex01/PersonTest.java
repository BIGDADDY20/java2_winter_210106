package constructor_ex01;

public class PersonTest {

	public static void main(String[] args) {
		// 사람 new
		// 사람 속성 저장
		// 사람 행위 동작
		Person boram = new Person("신보람", "19990101", "여자");
// private 필드여서 직접 접근 안됨
//		boram.name = "신보람";
//		boram.yyyymmdd = "19990101";
//		boram.gender = "여자";

		boram.setName("신바다");
		boram.setGender("남자");
		boram.setYyyymmdd("20200101");
		
		boram.greet();
		boram.walk();
		boram.introduce();
		boram.printAge();
		
		String name = boram.getName();
		System.out.println(name);

	}
}
