## 생성자(Constructor)와 접근 제어자

- Quiz01에서 만든 코드를 그대로 복사시킨다.(constuctor_ex01.Person, PersonTest)  
### 생성자와 소멸자 설명
- 생성자와 소멸자 설명하고(태어날 때, 객체가 소멸될 때) 추가 시키고 수행
- 객체를 생성하는 문법 `new Person();` 이것은 생성자를 호출하는 것과 같다.

### 접근 제한자 설명
- 지금까지는 Test 클래스에서 멤버변수에 값을 넣거나 값을 출력할 수 있었다. (친구집 냉장고 예시 들기) -> 그러면 안된다.
- 데이터에 함부로 접근하지 못하도록 `은닉화(encapsulation)`을 해야한다. (집주인을 통해서만 접근하도록)
  - 접근 제어자 종류를 문서에서 보여준다.
  - Person 필드에 모두 private을 붙인다.
  - `private을 붙인 후 실행` -> 값을 바꿀 수 없다.(에러남)

### 멤버변수에 값을 넣는 법 2가지
### (1) 생성자에 넣기
- 파라미터가 있는 생성자를 만들어서 값을 저장한다.
- 멤버 변수와 외부 변수를 구분하기 위해, 클래스 내에서 멤버변수에는 this를 붙인다.

### (2) setter로 넣기
- 집주인한테 건내주듯이, setter 메소드 공간에서 필드 하나에 값 저장


## Class
- [예제1-Person](ex01/Person.java): 생성자, 접근 제어자
- [예제1-PersonTest](ex01/PersonTest.java): 생성자, 접근 제어자

- [문제1](quiz01/README.md): (사각형) 생성자, 접근제어자
- [문제2](quiz02/README.md): (OMR Card) 생성자, 접근제어자
- [문제3](quiz03/README.md): (lotto) 생성자, 접근제어자
- [문제4](quiz04/README.md): (Trump) 생성자, 접근제어자

--- 학생 보여주기 ---
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
### [문제 1](quiz01/README.md) : 생성자와 접근 제어자
### [문제2](quiz02/README.md): 생성자, 접근제어자
### [문제3](quiz03/README.md): 생성자, 접근제어자
### [문제4](quiz04/README.md): 생성자, 접근제어자