package class_quiz01;

public class Person {
	// 속성: 필드
//	이름(String)
//	생년월일(String) - 'yyyymmdd' 형식
//	성별(String)
	String name;
	String yyyymmdd;
	String gender;
	
	// 동작: 메소드
//	인사하기: 인사말을 출력한다.
//	걷기: 걷는다고 출력한다.
//	자기소개 하기: "내 이름은 OOO이고 성별은 OO이다." 라고 출력한다.
//	나이 알려주기: 생년월일을 이용해서 나이를 계산하여 "나이는 OO세이다."라고 출력한다.
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
	
	
	
}
