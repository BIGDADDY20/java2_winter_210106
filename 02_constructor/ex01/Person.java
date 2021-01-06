package constructor_ex01;

public class Person {
	// 속성: 멤버 변수 또는 field
	private String yyyymmdd;
	private String gender;
	private String name;

	// 기능: method
	// 생성자(Constructor): 객체가 생성될 때 자동으로 불려지는 특이한 메소드
	public Person() {
		System.out.println("응애~~~");
	}
	
	public Person(String yyyymmdd, String gender, String name) {
		this.yyyymmdd = yyyymmdd;
		this.gender = gender;
		this.name = name;
	}
	
	public void greet() {
		System.out.println("안녕하세요");
	}

	public void walk() {
		System.out.println("걷기");
	}

	public void introduce() {
		System.out.println("내 이름은 " + name + "이고 성별은" + gender + "이다.");
	}

	public void printAge() {
		int year = Integer.parseInt(yyyymmdd.substring(0, 4));
		int age = 2021 - year + 1;
		System.out.println("나이는 " + age + "세 이다.");
	}
	
	// setter 메소드
	public void setYyyymmdd(String yyyymmdd) {
	    this.yyyymmdd = yyyymmdd;
	}

	public void setGender(String gender) {
	    this.gender = gender;
	}

	public void setName(String name) {
	    this.name = name;
	}
}
