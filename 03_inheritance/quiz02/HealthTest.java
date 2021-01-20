package inheritance_quiz01;

public class HealthRateTest {

	public static void main(String[] args) {
		// 생성자를 만들지 않으면 파라미터가 없는 기본 생성자가 만들어진다.
		//    - 객체를 생성할 때 파라미터를 넣지 않으면 자동으로 만들어진 기본 생성자를 호출한다.
		// 만약에 파라미터가 있는 생성자를 만들면 파라미터가 없는 기본 생성자가 만들어지지 않는다.
		HealthRate hr1 = new HealthRate("신보람", 160, 60);
		// 상속 받은 자식 클래스의 객체를 생성할 때 첫번째 부모 생성자가 호출된 뒤 자식 생성자가 호출된다.
		System.out.println(hr1.getName());
		System.out.println(hr1.getHeight());
		System.out.println(hr1.getWeight());
		hr1.showInfo();
	}

}
