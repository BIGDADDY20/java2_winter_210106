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
