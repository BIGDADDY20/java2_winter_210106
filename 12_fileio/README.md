## 스트림(Stream)
- 가상의 연결 통로
- 한쪽 방향으로만 흐르며, 자바에서는 byte 단위로 데이터를 입력 받거나(입력 스트림) 출력(출력 스트림)한다.
- java.io 패키지에서 기능을 제공한다.

## 파일 쓰기
- 출력 스트림을 통해 파일을 쓴다.
- `FileOutputStream(파라미터1, 파라미터2)`
   - 파라미터1: 파일명
   - 파라미터2: true-기존 파일에 덧붙이기(append) false-새로 쓰기
```
FileOutputStream fileOutputStream = new FileOutputStream("output1.txt", true); // 자바 프로젝트 경로에 생성된다.
OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, "utf-8"); // utf-8로 인코딩해서 문자를 byte로 변환
BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter); // 파일을 쓴다.

String text = "파일에 쓸 내용";
bufferedWriter.write(text.getBytes())
bufferedWriter.close(); // 스트림(가상 연결 통로)을 닫아준다.
```

## 파일 읽기
- 입력 스트림을 통해 파일을 읽는다.
- `FileInputStream(파일 경로)`
```
FileInputStream input = new FileInputStream("input.txt"); // 운영체제에 있는 파일을 byte로 읽어들인다.
InputStreamReader isr = new InputStreamReader(input, "utf-8"); // byte를 문자로 변환, utf-8로 문자 인코딩
BufferedReader br = new BufferedReader(isr); // 한 줄씩 읽어들인다.

while (true) {
    String readLine = br.readLine(); // 한 줄씩 저장됨
    if (readLine == null) { 
        break;
    }
}
```

## 이클립스에서 txt 파일 만들기
`패키지 우측 마우스 > New > General > File > 파일명.txt`

## 예제
### [예제 1](ex01/Ex01.java) : 파일 쓰기
### [예제 2](ex02/Ex02.java) : 파일 읽기
### [예제 3](ex03/Ex03.java) : 파일 읽어서 문제 풀기

## 문제
### [문제 1](quiz01/README.md)
### [문제 2](quiz02/README.md)
