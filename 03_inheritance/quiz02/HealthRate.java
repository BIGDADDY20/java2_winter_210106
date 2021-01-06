package inheritance_quiz02;

public class HealthRate extends HealthInfo {

	public HealthRate(String name, int height, int weight) {
		// 상속을 받으면 부모생성자를 반드시 불러주어야 한다.
		super(name, height, weight);
	}
	
	// 표준 체중 계산
	public double standardWeight() {
		//SW=(H-100)*0.9
		return (this.height - 100) * 0.9;
	}
	
	// 비만도 계산
	public double getRate() {
		// 비만도: B(%)=(W-SW)/SW*100
		return (this.weight - standardWeight()) / standardWeight() * 100;
	}
	
	// 비만 여부 계산
	public String status() {
		// 비만도가 10% 이내이면 정상, 10%이상 20% 미만이면 과체중, 20% 이상은 비만
		double rate = getRate();
		if (rate < 10) {
			return "정상";
		} else if (rate < 20) {
			return "과체중"; 
		} else {
			return "비만";
		}
	}
	
	@Override
	public void showInfo() {
		출력 (ex: 박둘리님의 신장 160, 몸무게 45kg => 정상입니다.)
		super.showInfo();
		System.out.println(" => " + status() + "입니다.");
	}
}
