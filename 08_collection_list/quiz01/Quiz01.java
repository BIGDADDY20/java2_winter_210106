package list_quiz;

import java.util.ArrayList;
import java.util.List;

public class Quiz01 {

	public static void main(String[] args) {
		// 1. 3, 8, 9, 4, 2, 1, 7, 5
		List<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(8);
		list.add(9);
		list.add(4);
		list.add(2);
		list.add(1);
		list.add(7);
		list.add(5);
		System.out.println(list);
		
		// 2. 값 수정하기 
		list.set(3, 6);
		System.out.println(list);
		
		// 3. List에서 8과 7을 삭제하고 전체를 출력하세요.
		list.remove(1);
		list.remove(5); // [3, 9, 6, 2, 1, 7, 5]
		System.out.println(list);
	}
}
