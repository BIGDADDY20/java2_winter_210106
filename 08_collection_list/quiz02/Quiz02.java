package list_quiz;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Quiz02 {

	public static void main(String[] args) {
		//20 3 5 84 17
		List<Integer> list = new ArrayList<>();
		list.add(20);
		list.add(3);
		list.add(5);
		list.add(84);
		list.add(17);
		
		// 2. 최소값 구하기
		int min = list.get(0);
		for (int i = 1; i < list.size(); i++) {
			if (min > list.get(i)) {
				min = list.get(i);
			}
		}
		System.out.println(min);
		
		// 3. 합계
		int sum = 0;
		Iterator<Integer> iter = list.iterator();
		while (iter.hasNext()) {
			sum += iter.next();
		}
		
		System.out.println(sum);
	}
}
