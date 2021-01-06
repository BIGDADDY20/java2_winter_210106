## 문제) 주어진 문자열이 같은지 검사하기
> 두 개의 문자열이 같은지 비교해서 true/false 출력하기 

## 입력 
> 첫 번째 줄에 비교할 문자 쌍의 개수가 주어진다. 두 번째 줄부터 비교할 문자 쌍이 주어진다.

## 출력
> 두 문자열을 비교했을 때 같으면 true, 다르면 false를 출력한다.

### 파일 읽기 코드
```
public static void main(String[] args) {
	try {
		FileInputStream fis = new FileInputStream("src/fileio_ex/input.txt");
		InputStreamReader isr = new InputStreamReader(fis, "utf-8");
		BufferedReader br = new BufferedReader(isr);
			
		String readLine = br.readLine();
		Integer count = Integer.parseInt(readLine);
		for (int i = 0; i < count; i++) {
			// TODO
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
}
```  
### input.txt
```
3
apple appel
sparkling sparkling
natural natural
```
  
> 출력 예시
```
false  
true  
true  
```