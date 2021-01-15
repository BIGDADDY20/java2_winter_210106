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
