package constructor_ex01;

public class PersonTest {

	public static void main(String[] args) {
		Person boram = new Person("19990101", "여자", "신보람");  
		// 멤버 변수 접근 제어자가 private이면 아래와 같이 넣을 수 없다.
		//   1. 생성자 파라미터로 넣거나
		//   2. setter 메소드로 넣거나
//		boram.name = "신보람";
//		boram.yyyymmdd = "19990101";
//		boram.gender = "여자";
		
		// setter로 넣기
		boram.setName("김바다");
		boram.setGender("남자");
		boram.setYyyymmdd("20191108");
		
		boram.greet();
		boram.walk();
		boram.introduce();
		boram.printAge();
	}

}
