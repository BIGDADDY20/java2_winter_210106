## 다형성(Polymorphism)
다형성 설명하기  
https://docs.google.com/document/d/1vFtwY4EsPPiykQ1sXelmsPcCIuGcZTBKndz5V-eQl6A/edit

## 다형성 예제
- [예제1-Animal](ex01/Animal.java): 부모클래스
- [예제1-Cat](ex01/Cat.java): 자식클래스
- [예제1-Dog](ex01/Dod.java): 자식클래스
- [예제1-AnimalTest](ex01/AnimalTest.java): 테스트 클래스

- [문제1](quiz01/README.md): 다형성, 업캐스팅/다운캐스팅(고양이, 강아지)
- [문제2](quiz02/README.md): 다형성, 업캐스팅/다운캐스팅(도형)

--- 학생 보여주기 ---
## 다형성(Polymorphism)
- 상속 기반  
- 다형성의 예
  - 과일: 사과, 귤, 포도, 딸기
  - 동물: 고양이, 개, 사자, 호랑이
  - 도형: 삼각형, 사각형, 육각형
- 위처럼 여러 개념을 아우르는 큰 개념은 부모 클래스, 부모 클래스의 개념에 속하는 개념은 자식 클래스

## Up Casting(업캐스팅)
- 자식 -> 부모 클래스로(위쪽 방향으로) 캐스팅
- 부모 클래스로 type이 변환된 것이므로
   - 부모 클래스의 메소드를 사용할 수 있다.
   - 부모 클래스에 있는 메소드를 오버라이드 한 메소드를 사용할 수 있다.
   - 자식 클래스에만 있는 메소드는 사용할 수 없다. 
```
Animal animal = (Animal) new Cat();
```

## Down Casting(다운 캐스팅)
- 부모 -> 자식 클래스로(아래 방향으로) 캐스팅
- 특정 자식객체임이 확인 되어야만 캐스팅이 가능하다. 
   - `instanceof`로 객체의 타입을 확인해야 한다.
```
Animal animal = (Animal) new Dog();

if (animal instanceof Dog) {
    Dog dog = (Dog) animal;
    dog.lash();
}
```

## 예제
### [예제 1](ex01) : 다형성, 업캐스팅, 다운캐스팅

## 문제
### [문제 1](quiz01/README.md)
### [문제 2](quiz02/README.md) 