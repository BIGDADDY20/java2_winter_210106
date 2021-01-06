## 인터페이스(Interface)
인터페이스 설명하기  
https://docs.google.com/document/d/14COvBkpAQTfBDDom_GIpWCHuwXKTJY08akq5KaSF9Hw/edit  

## 인터페이스 예제
- [예제1-CProgramming](ex01/CProgramming.java): 인터페이스
- [예제1-JavaProgramming](ex01/JavaProgramming.java): 인터페이스
- [예제1-JobApplicant](ex01/JobApplicant.java): 구현 클래스
- [예제1-Naver](ex01/Naver.java): 인터페이스 객체 사용 클래스
- [예제1-JobApplicantTest](ex01/AnimalTest.java): 테스트 클래스

- [문제1](quiz01/README.md): 인터페이스(지망생)

--- 학생 보여주기 ---
## 인터페이스(Interface)
- 메소드는 구현할 수 없으며, 인터페이스를 구현(상속)하는 클래스에서 메소드를 반드시 구현해야 한다.
- `implements` 키워드를 사용하여 구현(상속)
- **다중 구현 가능**
- 인터페이스로 객체를 만들 수 없다. 자식 클래스만 객체 생성 가능.
### 인터페이스
```
public interface JavaProgramming {
    public void objectOriented(); // 구현 안함
}
```

### 인터페이스 상속(자식 클래스)
```
// 다중 상속 가능
public class Person implements JavaProgramming, CProgramming {  
    ...
}
```

## 예제
### [예제 1](ex01) : 인터페이스

## 문제
### [문제 1](quiz01/README.md)