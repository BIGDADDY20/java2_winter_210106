package set_quiz;

import java.util.HashSet;
import java.util.Set;

public class Quiz01 {

	public static void main(String[] args) {
		// Q. 1234, 3456 의 교집합, 차집합, 합집합을 구하세요.

		// 1234, 3456 값을 세팅한다.
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();

		// 아래 객체에 결과를 저장한다.
		Set<Integer> union = new HashSet<>(); // 합집합: 1, 2, 3, 4, 5, 6
        Set<Integer> difference = new HashSet<>(); // 차집합: set1 - set2 => 1, 2
		Set<Integer> intersection = new HashSet<>(); // 교집합: 3, 4

		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		
		set2.add(3);
		set2.add(4);
		set2.add(5);
		set2.add(6);
		
		// 합집합
		union.addAll(set1);
		union.addAll(set2);
		System.out.println("합집합: " + union);
		
		// 차집합
		difference.addAll(set1);
		difference.removeAll(set2);
		System.out.println("차집합: " + difference);
		
		// 교집합
		intersection.addAll(set1);
		intersection.retainAll(set2);
		System.out.println("교집합: " + intersection);
	}

}
