package list_ex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex02 {

	public static void main(String[] args) {
		List<String> strList = new ArrayList<>();
		strList.add("apple");
		strList.add("banana");
		strList.add("grape");
		
		/**
		 * 반복문을 통해 요소에 접근하기
		 */
		// 1. index 기반으로 출력
		// 문제점: 요소를 중간에 제거하면 문제가 생긴다.
		System.out.println("### 1. for문");
		for (int i = 0; i < strList.size(); i++) {
			System.out.println(strList.get(i));
			
			// b로 시작하는 요소는 제거하기
			String element = strList.get(i);
			if (element.startsWith("b")) {
				strList.remove(i);  // 마지막 요소가 찍히지 않고 반복문 종료됨
			}
		}
		
		// 2. Iterator로 출력하기
		// 요소를 중간에 삭제해도 된다.
		System.out.println("### 2. Iterator");
		
		// iterator는 다음 요소가 무엇인지 가리키고 있다.
		// 중간에 요소가 삭제되면, 다음 요소가 무엇인지 가리키는 곳이 변경됨
		Iterator<String> iter = strList.iterator(); // generic에는 꺼낼 데이터의 type을 명시한다.
		while (iter.hasNext()) { // 다음 요소가 있을 경우 loop 수행
			String element = iter.next();
			System.out.println(element);
			
			if (element.startsWith("b")) {
				iter.remove(); // 리스트에서 삭제가 아니라 반드시 iterator의 remove로 삭제해야 한다.
			}
		}
		
		
		// 3. 향상된 for문으로 출력하기
		// 문제점: java 버전에 따라 안되기도 한다.(최신버전에서 안된다)
		System.out.println("### 3. 향상된 for문");
		for (String element : strList) {
			System.out.println(element);
			if (element.startsWith("b")) {
				strList.remove(element);
			}
		}
	}

}
