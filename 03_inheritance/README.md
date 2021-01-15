## 상속(Inheritance)
- `extends` 키워드를 사용하여 부모 클래스로부터 상속한다.  
- **다중 상속 불가**
- 한 번에 하나의 클래스만 extends 가능하지만, A -> B -> C 구조로 상속은 가능하다.

## 부모 클래스(Parant Class 또는 SuperClass)
- 상위 개념의 클래스  
- 자식 클래스보다 작은 개념  
```
public class Person {
    protected String name;  // 자식 클래스가 사용 가능
    private int age;        // 자식 클래스에서 접근 불가
}
```

## 자식 클래스(Child Class)
- 하위 개념의 클래스
- 부모 클래스를 포함한다.
```
public class Student extends Person {
    ...
}
```
- 자식 클래스에서 부모 클래스의 변수나 메소드를 접근할 때 `super` 키워드 사용
- 자식 클래스에서 부모 클래스의 메소드를 재정의할 때 `@Override` 사용
```
@Override
public void introduce() {
	// 부모 클래스에 있는 메소드를 재정의
}
```

## 예제
### [예제 1](ex01) : 생성자와 접근 제어자

## 문제
### [문제 1](quiz01/README.md) : 상속 구조로 정리
### [문제 2](quiz02/README.md) : 상속 구조 구현
