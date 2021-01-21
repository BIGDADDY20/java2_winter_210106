package list_ex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex02 {

	public static void main(String[] args) {
		List<String> fruits = new ArrayList<>();
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("grape");
		
		// 반복문을 통해 요소 접근하기
		// 1. index를 기반으로 출력
		//    문제점: 요소를 중간에 제거하면 문제가 생긴다.
		System.out.println("### 1. for문");
		for (int i = 0; i < fruits.size(); i++) {
			System.out.println(fruits.get(i));  // 마지막 요소가 찍히지 않고 반복문이 종료된다.
			
			// b로 시작하는 요소는 제거 하기
			String fruit = fruits.get(i);
			if (fruit.startsWith("b")) {
				fruits.remove(i);
			}
		}
		
		// 2. Iterator로 출력하기
		// 요소를 중간에 삭제해도 된다.
		Iterator<String> iter = fruits.iterator();
		while (iter.hasNext()) {  // 다음 요소가 있는 동안 반복문 수행
			String fruit = iter.next(); // next()를 호출할 때마다 소비가 되므로 반복문에서 한번만 수행하는 것이 좋다.
			System.out.println(fruit);
			
			if (fruit.startsWith("b")) {
				iter.remove(); // 중요!!!! 리스트에서 삭제가 아니라 반드시 iterator의 remove로 삭제해야 한다.
			}
		}
		System.out.println(fruits);
		
		// 3. 향상된 for문으로 출력하기
		// java 버전에 따라서 중간에 요소 삭제가 안되기도 한다. => 권장 하지 않음
		for (String fruit : fruits) {
			System.out.println(fruit);
		}
	}
}
