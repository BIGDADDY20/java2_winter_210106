package Ex02;

public class CellphoneTest {

	public static void main(String[] args) {
		//+ 핸드폰을 공장에서 찍어낼 것이다.
		//+ 핸드폰 출시하기 전에 제일 중요한거 뭐해야될까?
		//+ 테스트를 해야한다. 높은데서 떨어뜨려보기도 하고, 엄청 추운곳에 놔둬보기도 하고 고온에서 테스트도 해보고..
		//+ 우리도 테스트를 해보자
		
		//+ 아까 만든 핸드폰 설계도대로 테스트용 실제 핸드폰을 만들 것이다.
		//+ 인스턴스화 해야된다고 했다.  -> 객체로 만들어야 한다.
		
		// test
		Cellphone cellphone1 = new Cellphone();
		System.out.println(cellphone1.color);
		System.out.println(cellphone1.maker);
		System.out.println(cellphone1.price);
		System.out.println(cellphone1.model);
		
		cellphone1.call();
		cellphone1.camera();
		
		//+ 테스트가 끝나고 이제 만들어도 될 것 같다. 
		//+ 핸드폰 100개를 공장에서 찍어낼거다.
		Cellphone[] cellphones = new Cellphone[100];
		for (int i = 0; i < 100; i++) {
			cellphones[i] = new Cellphone();
		}
		
		//+ 만약에 설계도대로 만들지 않고, 절차지향적으로 만들었다면 구조도 복잡하고 코드가 엄청 길어지고 관리도 힘들었을것이다.
		
		//+ 애플폰인데 애플이 맘에 안들어서 갖고싶었던 폰으로 바꾸고 싶다. 가능할까??? 가능하다!
		// 멤버변수 또는 field를 변경하기
		cellphone1.maker = "삼성";
		cellphone1.model = "z플립";
		
		System.out.println(cellphone1.maker);
		System.out.println(cellphone1.model);
		
		// 변경이 불가능하게 하고싶으면 설계도인 클래스에서 접근제어자를 변경해야 한다.
		
		// Cellphone클래스에서 default, public, protected, private로 변경 가능
		// default: 같은 패키지 내에서 접근 가능 (생략하면 default)
		// public: 어디서든 접근 가능
		// protected: default와 같다, 상속 관계일 때 접근 가능
		// private: 같은 클래스 내에서만 접근 가능
	}

}
