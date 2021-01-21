package list_ex;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex01 {

	public static void main(String[] args) {
		// 배열(Array)
		// 1. 크기를 미리 알고 있어야 한다. 크기가 고정되어 있다.
		// 2. 중간에 있는 값을 빼내면 비어있는 채로 유지된다.
		// 3. index 기반으로 접근이 가능하다.
		// 4. 기본자료형(primitive type), 클래스 타입도 담을 수 있다.
		
		// List
		// 1. 크기가 고정되어 있지 않고, 동적으로 할당된다.
		// 2. 중간에 있는 값을 빼내면 앞으로 당겨진다.(메모리 낭비가 없다.)
		// 3. 여러 방법으로 데이터를 다룰 수 있다.
		// 4. 클래스 타입만 담을 수 있다.(기본 자료형은 저장안됨)
		// 5. 타입 안정성을 보장하는 generic을 쓸 수 있다.
		
		List<Integer> list1 = new ArrayList<>();
		list1.add(5);
		list1.add(3);
		boolean isSuccess = list1.add(8);
		System.out.println(isSuccess);
		System.out.println("list1 : " + list1);
		System.out.println("list1 toString():" + list1.toString());
		
		List<Integer> list2 = new LinkedList<>();
		list2.addAll(list1);
		System.out.println("list2:" + list2);
		
		// 요소 수정하기
		// 요소의 첫번째 값 수정  5 -> 10으로 변경
		System.out.println(list2.set(0, 10)); // 변경할 위치(index), 변경할 값
		System.out.println("list2" + list2);
		
		// 요소 삭제하기
		Integer deletedValue = list2.remove(1); // index 1의 요소를 제거
		System.out.println(deletedValue);
		System.out.println("list2:" + list2);
		
		List<String> strList1 = new ArrayList<>();
		strList1.add("abc");
		strList1.add("qwer");
		System.out.println(strList1.remove("qwer"));
		System.out.println("strList1:" + strList1);
		
		// 모든 요소 삭제하기
		list2.clear();
		System.out.println("list2:" + list2);
	}
}
