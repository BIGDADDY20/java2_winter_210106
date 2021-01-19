## 문제2) 비만도 계산하기
사람의 신장(H)와 몸무게(W)를 입력받아 비만도(B)를 계산하는 프로그램
> 표준체중:SW=(H-100)*0.9  
> 비만도: B(%)=(W-SW)/SW * 100  

1. 부모 클래스(HeathInfo.java)를 상속받는 비만도 계산 클래스를 설계한다.(HealthRate.java)
2. 표준체중 계산하는 메소드를 정의한다. 
3. 비만 여부를 구하는 메소드를 정의한다.  
(비만도가 10% 미만이면 정상, 10%이상 20% 미만이면 과체중, 20% 이상은 비만)

> 출력 예시 (HealthTest.java)  
박둘리님의 신장 160, 몸무게 45kg => 정상입니다.  
홍길동님의 신장 168, 몸무게 90kg => 비만입니다.

#### HeathInfo.java (부모 클래스)
```
public class HealthInfo {
	protected String name;
	protected int height;
	protected int weight;
	
	public HealthInfo(String name, int height, int weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
	public void showInfo() {
		// ex) 홍길동님의 신장 160, 몸무게 45kg 입니다.
		System.out.println(name + "님의 신장 " + height + ", 몸무게 " + weight + "kg 입니다.");
	}

	public String getName() {
		return name;
	}

	public int getHeight() {
		return height;
	}

	public int getWeight() {
		return weight;
	}
}
```

[정답 보기: HealthInfo.java](HealthInfo.java)  
[정답 보기: HealthRate.java](HealthRate.java)  
[정답 보기: HealthTest.java](HealthTest.java)
