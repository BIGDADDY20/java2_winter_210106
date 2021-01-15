
## 클래스(Class) 정의 예제
* 여러 변수를 묶어서 하나로 관리하기 위한 설계도
* 클래스는 속성과 행위로 구성된다.
```
public class ScoreData {
    // 속성: 필드(멤버변수)
	int score;
	String name;
	int ranking;

    // 행위: 메소드
    int getScore() {
        return this.score;
    }
}
```

## 클래스(Class) 사용하기
* `객체명.속성명`으로 접근한다.
```
public class Ex01 {
	public static void main(String[] args) {
        ScoreData scoreData = new ScoreData();
        // 값 초기화
        scoreData.subject = "국어";
        scoreData.score = 80;
        scoreData.ranking = 10;

        // 출력
        System.out.println(scoreData.subject);
        System.out.println(scoreData.score);
        System.out.println(scoreData.ranking);

        // 메소드 호출
        System.out.println(scoreData.getScore());  // 점수
    }
}
```
클래스는 설계도일 뿐이며 반드시 **객체를 생성*(인스턴스 화)*하여 사용한다.  
`ScoreData scoreData = new ScoreData();`

## 예제
### [예제 1](ex01) : 클래스 정의와 사용

## 문제
### [문제 1](quiz01/README.md) : 클래스 정의와 사용
