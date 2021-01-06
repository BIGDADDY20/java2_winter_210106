package Ex02;

public class Cellphone {
	//+ 핸드폰 스펙 설계를 해본다.  -> 자신이 갖고 있는 핸드폰 또는 갖고싶은 폰으로

	// 속성: member 변수 또는 field - 명사로 짓기
	String maker = "apple";
	String model = "iPhone11pro";
	String color = "gold";
	int price = 183;
	
	// 기능: method - 동사로 짓기
	public void call() {
		System.out.println("여보세요");
	}
	
	public void camera() {
		System.out.println("찰칵");
	}
	
	//+ 일어나
	//+ 기능은 무엇무엇을 하다. 동사이기 때문에 메소드명을 동사로 지어야 한다.
	//+ 메소드명은 길어도 상관없고 다른 사람이 이해만 할 수 있으면 된다.
	//+ 필드나 변수명은 명사로 간단하게 짓는것이 좋다.
}
