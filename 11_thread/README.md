## 프로세스(Process)
- **실행 중인 프로그램**

## 쓰레드(Thread)
- 프로그램의 실행 단위
- 여태까지 작성한 코드를 실행한 것은 하나의 main thread에서 수행된 것이다.

## 멀티 쓰레드(Multi Thread)
- 여러 쓰레드를 만들어서 각각의 쓰레드에서 **동시에** 다른 수행을 하도록 하는 것

## Thread 구현하는 방법
### 1. Thread 클래스를 상속받아(extends) 구현한다.
- run() 메소드에 구현된 내용이 쓰레드에서 수행된다.
- **start() 메소드**를 호출해야 **멀티 쓰레드**로 수행된다.  
    (start 메소드가 내부적으로 run메소드를 호출함)
```
// 쓰레드 구현 클래스
public class T1 extends Thread {
    public void run() {
        // 쓰레드에서 수행할 내용
    }
}

// 쓰레드 사용 클래스
public class Test {
    public static void main() {
        T1 t1 = new T1();
        t1.run();   // 싱글 쓰레드
        t1.start();  // 멀티 쓰레드
    }
}
```

### 2. Runnable 인터페이스를 구현(implements)해서 구현한다.
- run() 메소드에 구현된 내용이 쓰레드에서 수행된다.
- **멀티 쓰레드**로 사용하기 위해서는 Thread 객체에 구현체를 넣고 start()를 호출해야 한다.
```
// 쓰레드 구현 클래스
public class T2 implements Runnable {
    public void run() {
        // 쓰레드에서 수행할 내용
    }
}

// 쓰레드 사용 클래스
public class Test {
    public static void main() {
        T2 t2 = new T2();
        t2.run();   // 싱글 쓰레드

        Thread t = new Thread(t2);
        t.start();  // 멀티 쓰레드
    }
}
```

## 쓰레드가 모두 수행될 때까지 기다리기(Lock 거는 법)
- `쓰레드객체.join()` 메소드를 사용하면 해당 쓰레드가 모두 수행될 때까지 메인쓰레드가 기다린다.

## 예제
### [예제 1](ex01) : Thread 사용법

## 문제
### [문제 1](quiz01/README.md)
### [문제 2](quiz02/README.md)
