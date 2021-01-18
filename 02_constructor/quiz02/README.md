## 문제) OMR 카드 채점 프로그램 만들기  
> 객관식 문제 5개를 OMR 카드 리더기로 읽어 점수를 구하는 프로그램  
  
**1. OmrCard 클래스**  
＊문제는 객관식으로 문제 개수는 총 5개이다.(답은 1~5중에 하나만 선택 가능)  
＊학번과 이름을 입력 받는다.  
＊순서대로 학생의 답 5개를 입력받는 메소드를 만든다.  
  
**2. OmrCardReader 클래스**  
＊객체 생성 시 문제의 정답 5개를 입력받아 정답 배열에 저장해둔다.  
＊OmrCard 하나를 입력받아서 이름, 학번, 점수(100점 만점)를 출력한다.  

**3. OmrCardTest 클래스**
- OMR 카드와 카드 리더기 객체를 만드는 클래스
- OmrCard 객체에는 정답을 입력한다.
- OmrCardReader 객체에는 위에서 만든 OmrCard를 넣어 결과를 받는다.
  
> 출력 예시
```
이름: 신보람
학번: 20200302
점수: 80점
```

[정답 보기: OmrCard.java](OmrCard.java)  
[정답 보기: OmrCardReader.java](OmrCardReader.java)  
[정답 보기: OmrCardTest.java](OmrCardTest.java)
