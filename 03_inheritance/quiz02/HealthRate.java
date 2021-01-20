package inheritance_quiz01;

public class HealthRate extends HealthInfo {

	public HealthRate(String name, int height, int weight) {
		super(name, height, weight);
//		this.name = name;
//		super.height = height;
	}
	
	//표준체중:SW=(H-100)*0.9
	private double getStandardWeight() {
		return (this.height - 100) * 0.9;
	}
	
	//비만도: B(%)=(W-SW)/SW * 100
	private double getRatio() {
		double sw = getStandardWeight();
		return (this.weight - sw) / sw * 100;
	}
	
	
	// 비만 여부 계산  => 정상, 과체중, 비만
	// 비만도가 10% 미만이면 정상, 10%이상 20% 미만이면 과체중, 20% 이상은 비만
	public String healthStatus() {
		double ratio = getRatio();
		if (ratio < 10) {  // ~10 미만
			return "정상";
		} else if (ratio < 20) {  // 10 이상 ~ 20미만 
			return "과체중";
		} else {            // 20 이상
			return "비만";
		}
	}
	
	// 오버라이드
	@Override
	public void showInfo() {
		// 박둘리님의 신장 160, 몸무게 45kg => 정상입니다.
		super.showInfo();
		System.out.println(" => " + healthStatus() + "입니다.");
	}
}
