package wrapper_class_ex;

public class Ex01 {

	public static void main(String[] args) {
		// 1. 기본자료형(primitive type)에 저장하기
		int number1 = 5;
		System.out.println(number1);
		
		// 2. 래퍼 클래스(Wrapper class)에 저장하기
		Integer number2 = 5;
		System.out.println(number2);
		
		// 3. 래퍼 클래스 객체를 생성해서 값 저장하기
		Integer number3 = new Integer(5);
		System.out.println(number3);
		
		Integer number5 = new Integer(5);
		System.out.println("number3 == number5:" + (number3 == number5)); // false: 주소 비교
		
		Integer number4 = 5;  // Heap 메모리의 constant pool에 저장되어 재활용 된다.
		System.out.println(number2 == number4); // true: constant pool 주소 일치
		
		// 기본자료형과 비교를 하면 값을 비교한다.
		// 객체끼리 비교를 하면 주소값을 비교한다. => 객체의 값을 비교할 때는 반드시!!! equals 메소드를 사용한다.
		System.out.println(number1 == number2); // true
		System.out.println(number1 == number3); // true
		System.out.println(number2 == number3); // false
		System.out.println(number2 == number4); // true
	}
}
