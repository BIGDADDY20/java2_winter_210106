## Set 자료구조
- 수학에서의 집합과 같다.
- 중복이 되지 않는다.
- 순서가 없다.
- 따라서 **index가 없다.** 

## 자주 사용하는 Set의 종류
### HashSet
- 일반적으로는 HashSet을 사용한다. 
- 집합 연산과 같다.

### TreeSet
- 값을 정렬한다.
- 그래서 HashSet보다 상대적으로 느리다.

## Set의 메소드
|메소드명|설명|반환값|
|---|---|---|
|toString()|리스트 값을 `[값, 값...]`의 문자열 형태로 돌려준다.|String|
|add(값)|값을 추가한다|boolean: add가 성공했는지 여부|
|addAll(콜렉션)|Collection을 통째로 추가한다.|boolean: add가 성공했는지 여부|
|contains(값)|리스트에 값이 들어있는지 확인|boolean: 들어있는지 여부|
|remove(값)|(값이 숫자가 아닌 경우)값으로 삭제한다.|boolean: 삭제가 됐는지 여부|
|clear()|모든 요소 삭제|void|
|isEmpty()|리스트가 비어있는지 확인|boolean: 비었는지 여부|
|size()|Set의 크기|int: set의 크기|
|retainAll(콜렉션)|두 콜렉션에서 같은 것만 남긴다.|boolean: 성공한지 여부|

## 예제
### [예제 1](ex01/Ex01.java) : Set 초기화, 추가/수정/삭제, 반복문 접근

## 문제
### [문제 1](quiz01/README.md)
