## 생성자(Constructor)
- 객체가 생성될 때 자동으로 불려지는 특이한 메소드
- 클래스 이름과 같고, return type이 없다.
- 생성자를 정의하지 않을 경우, 파라미터가 없는 기본 생성자가 내부적으로 만들어져 호출된다.
```
public class Person {

    // 기본 생성자
    Person() {
        System.out.print("객체가 생성됨");
    }
}
```

## 접근 제어자(Access Modifier)
객체 사용 시 데이터에 접근 가능한 제어 단계  
- **default**: 지정하지 않았을 경우 default. 같은 패키지 내에서만 접근이 가능하다.
- **public**: 접근 제한이 없다. 모두 접근 가능.
- **protected**: 같은 패키지 내에서 접근 가능, 다른 패키지의 자손클래스에서 접근 가능.
- **private**: 같은 클래스 내에서만 접근 가능. 외부에서는 접근 불가.

## 사용 가능한 접근 제어자

|||
|---|---|
|클래스|default, public|
|메소드|default, public, protected, private|
|멤버변수|default, public, protected, private|

- 클래스는 외부에서 사용되므로 **public**을 기본으로 한다.
- 멤버변수는 웬만하면 **private**으로 설정하여 외부 접근을 허용하지 않는게 좋다.
- 메소드는 외부에서 사용된다면 public으로, 아닌 경우에는 적절히 선택한다.

## 필드에 값을 넣는 법 2가지
### (1) 생성자를 통해 넣기
- 외부 변수와 멤버변수(필드)를 구분하기 위해 Person 클래스 내에서는 필드에 `this.`를 붙인다.
```
public Person(String yyyymmdd, String gender, String name) {
		this.yyyymmdd = yyyymmdd;
		this.gender = gender;
		this.name = name;
}
```

### (2) Setter 메소드를 통해 넣기
- 필드 각각 setter 메소드를 만들어서 값을 저장한다.
```
public void setYyyymmdd(String yyyymmdd) {
    this.yyyymmdd = yyyymmdd;
}

public void setGender(String gender) {
    this.gender = gender;
}

public void setName(String name) {
    this.name = name;
}
```

## 필드 값을 꺼내는 법
### (1) 일반 메소드 이용
```
public void introduce() {
		System.out.println("내 이름은 " + this.name + "이고 성별은" + this.gender + "이다.");
	}
```

### (2) getter 이용
- 필드 각각 getter 메소드를 만들어서 값을 꺼낸다.
```
public String getYyyymmdd() {
    return this.yyyymmdd;
}

public String getGender() {
    return this.gender;
}

public String getName() {
    return this.name;
}
```


## 예제
### [예제 1](ex01) : 생성자와 접근 제어자

## 문제
### [문제1](quiz01/README.md) : 생성자와 접근 제어자(사각형 넓이, 둘레 구하기)
### [문제2](quiz02/README.md) : 생성자와 접근 제어자
### [문제3](quiz03/README.md) : 생성자와 접근 제어자
### [문제4](quiz04/README.md): OMR CARD 고급문제
### [문제5](quiz05/README.md): LOTTO 고급문제
### [문제6](quiz06/README.md): TRUMPCARD 고급문제
