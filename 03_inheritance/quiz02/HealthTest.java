package inheritance_quiz02;

public class HealthTest {

	public static void main(String[] args) {
		HealthRate healthRate1 = new HealthRate("박둘리", 160, 45);
		healthRate1.showInfo();
		
		HealthRate healthRate2 = new HealthRate("홍길동", 168, 90);
		healthRate2.showInfo();
	}

}
