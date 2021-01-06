## 문제) 연예인 오디션
오디션에 지원할 수 있는지 자격확인 하는 프로그램
> 지망생(EntertainerApplicant)  
> 기획사(JypEntertainment)에서 연기자 오디션(actorAudition)과 아이돌 오디션(idolAudition)을 모집한다.  
> 연기자 오디션에서는 연기능력(Act)을 보고, 아이돌 오디션에서는 노래능력(sing)을 본다.  

지망생이 두 오디션에 모두 지원 가능하도록 인터페이스로 구현하세요.  

### Test.java
```
public static void main(String[] args) {
	// 지원자
	EntertainerApplicant boram = new EntertainerApplicant();
		
	// 지원할 곳 (JYP)
	JypEntertainment jyp = new JypEntertainment();
	jyp.actorAudition(boram);
	jyp.idolAudition(boram);
}
```

[정답 보기: Act.java](Act.java)  
[정답 보기: Sing.java](Sing.java)  
[정답 보기: Applicant.java](Applicant.java)  
[정답 보기: JypEntertainment.java](JypEntertainment.java)  
[정답 보기: Test.java](Test.java)