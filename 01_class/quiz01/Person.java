package class_quiz01;

public class Person {
		// 속성: 멤버 변수 또는 field
		String yyyymmdd;
		String gender;
		String name;
		
		// 기능: method
		void greet() {
			System.out.println("안녕하세요");
		}
		
		void walk() {
			System.out.println("걷기");
		}
		
		void introduce() {
			System.out.println("내 이름은 " + name + "이고 성별은" + gender + "이다.");
		}
		
		void printAge() {
			int year = Integer.parseInt(yyyymmdd.substring(0, 4));
			int age = 2021 - year + 1;
			System.out.println("나이는 " + age + "세 이다.");
		}
}
