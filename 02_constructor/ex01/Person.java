package constructor_ex01;

public class Person {
	// 속성: 필드
	private String name; // 은닉화 (private)
	private String yyyymmdd;
	private String gender;

	// 동작: 메소드

	// 생성자 오버로딩(Overloading): 파라미터의 타입이 다르거나, 개수가 다르거나 일치하는 메소드가 선택된다.
	// 생성자(Constructor) : 객체가 생성될 때 불려지는 특수한 메소드
	public Person() {
		System.out.println("객체가 생성되었다.");
	}

	// 파라미터가 있는 생성자
	// 캡슐화 (encapsulation) : 은닉화되어 있던 필드에 접근하기 위한 매개체
	public Person(String name, String yyyymmdd, String gender) {
		this.name = name;
		this.yyyymmdd = yyyymmdd;
		this.gender = gender;
	}
	
	// setter 메소드: 멤버변수(필드)에 값을 세팅하는 메소드
	public void setName(String name) {
		this.name = name;
	}
	
	public void setYyyymmdd(String yyyymmdd) {
		this.yyyymmdd = yyyymmdd;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}

	void greet() {
		System.out.println("안녕하세요");
	}

	void walk() {
		System.out.println("걷는다.");
	}

	void introduce() {
		System.out.println("내 이름은 " + this.name + "이고 성별은 " + this.gender + "이다.");
	}

	void printAge() {
		String yearStr = this.yyyymmdd.substring(0, 4); // "yyyy"
		int year = Integer.parseInt(yearStr);
		int age = 2021 - year + 1;
		System.out.println("나이는 " + age + "세 이다.");
	}
	
	// getter
	public String getName() {
		return this.name;
	}
}
