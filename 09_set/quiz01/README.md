## 문제) 집합 연산
> 1234, 3456 의 합집합, 차집합, 교집합을 구하세요.

### Quiz01.java
```
public static void main(String[] args) {
		// Q. 1234, 3456 의 합집합, 차집합, 교집합을 구하세요.

        // 1234, 3456 값을 세팅한다.
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();
		
        // 아래 객체에 결과를 저장한다.
        Set<Integer> union = new HashSet<>(); 
        Set<Integer> difference = new HashSet<>(); 
		Set<Integer> intersection = new HashSet<>();

		// TODO: 구현하기
}
```  
> 출력 예시
```
합집합: [1, 2, 3, 4, 5, 6]
차집합: [1, 2]
교집합: [3, 4]
```
[정답 보기](Quiz01.java)