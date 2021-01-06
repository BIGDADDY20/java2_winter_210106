## 클래스(Class) 설명

만약 사람 정보를 저장해야 한다고 생각해보자.  
이름, 나이, 주소 등의 정보를 저장하려면 우리가 배운 것중에 어디다 저장하면 될까?  
변수 3개를 만들어서 각각 저장하면 되지?  
배열에 넣으면 좋겠지만 3개의 타입이 이름은 String, 나이는 int, 주소는 String이다보니 배열에는 넣을 수가 없다.  
  
만약 사람이 3명이 있는데 각각 인적정보를 저장해야 한다면  
이름 변수 3개, 나이 변수 3개, 주소 변수 3개를 만들어야 하는 번거로움이 있다.  
  
사람, Person 이라는 자료형이 있어서 이름, 나이, 주소 정보를 한꺼번에 담을 수 있다면 좋겠다.  
이렇게 하나의 의미로 묶을 수 있게 해주는게 바로 구조체, Structure의 약어 Struct라고 한다.
  
개발자가 여러 변수를 하나로 묶은 새로운 자료형을 만드는 것이다.

## Class
- [예제1](ex01/ex.java): Class 정의와 사용법
- [문제1](quiz01/README.md):  클래스 정의와 사용

--- 학생 보여주기 ---
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