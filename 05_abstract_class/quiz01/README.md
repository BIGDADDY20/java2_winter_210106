## 문제) 단위를 변환하는 추상클래스 만들기
Converter 달러->원, cm->inch로 변환하는 클래스를 작성하세요.  

> 달러 -> 원, cm -> inch 로 바꾸는 Converter를 만든다.  
> 예를 들어  
>   1달러는 1200, 3달러는 3600원  
>   1cm는 0.3inch, 3cm는 0.9inch

결과를 출력하는 단위와 형태가 다르기 때문에 추상메소드로 만들어서 자식 클래스에게 강제 구현을 시킨다.

### Converter.java (추상클래스)
```
public abstract class Converter {
	abstract protected void printConverted(); // 추상 메소드(필수 구현)
	protected double ratio; // 비율(환율 또는 1cm의 inch값)
	protected double result; // 결과
	
	public Converter() {
		// do nothing
	}
	
    // 생성자
	public Converter(double ratio) {
		this.ratio = ratio;
	}
	
    // 계산
	public void convert(int input) {
		this.result = input * ratio;
	}
}
```  

### ConverterTest.java
```
public static void main(String[] args) {
		Converter d2w = new DollerToWon(1188); // 환율 검색하기
		Converter c2i = new CmToInch(); // cm -> inch 비율 검색하기
		
		d2w.convert(10000); // input 값
		d2w.printConverted(); 
		
		c2i.convert(20); // input 값
		c2i.printConverted();
	}
```

> 출력 예시
```
1.188E7원
7.874020000000001inch
```

[정답 보기: Converter.java](Converter.java)  
[정답 보기: CmToInch.java](CmToInch.java)  
[정답 보기: DollerToWon.java](DollerToWon.java)  
[정답 보기: ConverterTest.java](ConverterTest.java)  