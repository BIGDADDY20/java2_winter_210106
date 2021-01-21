package list_ex;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Ex03 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(3);
		list.add(9);
		list.add(1);
		
		// list에 숫자 5가 들어있는가?
		boolean containValue = list.contains(5);
		System.out.println(containValue);
		// list에 숫자 7이 들어있는가?
		System.out.println(list.contains(7));
		
		// 오름차순으로 정렬하기
		//  Comparator.naturalOrder() 이렇게 사용할 수 있는 이유: 메소드가 static으로 선언되어 메모리에 올라가 있기 때문
		//    그래서 new Comparator()를 하지 않아도 사용이 가능하다.
		list.sort(Comparator.naturalOrder()); // 리턴값을 세팅하지 않아도 sort가 되어있다.
		System.out.println(list);
		
		// 내림차순으로 정렬하기
		list.sort(Comparator.reverseOrder());
		System.out.println(list);
		
		// 리스트가 비어있는지 여부
		System.out.println(list.isEmpty());
		
		list.clear();
		System.out.println(list.isEmpty());
	}
}
