## 추상 클래스(Abstract Class)
추상클래스 설명하기  
https://docs.google.com/document/d/1XRRSwdXBNRf839ZRbGN3-A3rghc6or-eGwrg_uYT-nc/edit

## 추상 클래스 예제
- [예제1-Animal](ex01/Animal.java): 부모클래스
- [예제1-Dog](ex01/Dod.java): 자식클래스
- [예제1-Tiger](ex01/Tiger.java): 자식클래스
- [예제1-AnimalTest](ex01/AnimalTest.java): 테스트 클래스

- [문제1](quiz01/README.md): 추상클래스(컨버터)

--- 학생 보여주기 ---
## 추상 메소드(Abstract Method)
- 상속 기반
- 부모 클래스에서는 구현하지 않고, 자식 클래스에서 반드시 구현해야 하는 메소드이다.
### 부모 클래스
```
// 추상 메소드
public abstract void cry();  // 부모 클래스에서 구현하지 않음

// 일반 메소드
public void eat() {
    System.out.println("냠냠");
}
```

## 추상 클래스(Abstract Class)
- 추상 메소드가 하나라도 존재하는 클래스
- 일반 메소드도 존재할 수 있다.
- 추상 클래스로는 **객체를 생성할 수 없다.**
- 추상 클래스를 물려받은 자식 클래스만 객체 생성 가능(상속 문법은 클래스 상속과 동일함)
```
public abstract class Animal { // 추상 클래스
	public abstract void cry(); // 추상 메소드
}
```

## 예제
### [예제 1](ex01) : 추상 클래스

## 문제
### [문제 1](quiz01/README.md)