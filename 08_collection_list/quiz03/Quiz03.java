package list_quiz;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Quiz03 {

	public static void main(String[] args) {
		// 1. 체조 경기 평균 점수
		List<Integer> scores = new ArrayList<>();
		scores.add(8);
		scores.add(7);
		scores.add(6);
		scores.add(10);
		scores.add(9);
		scores.add(4);
		// 오름차순으로 정렬 후
		scores.sort(Comparator.naturalOrder());
		
		// 첫번째와 맨 마지막 값을 제거한다.
		scores.remove(0);
		scores.remove(scores.size() - 1); // 맨 마지막 index
		
		int sum = 0;
		for (int i = 0; i < scores.size(); i++) {
			sum += scores.get(i);
		}
		System.out.println("최고점과 최저점을 제외한 평균 점수는 " + sum / (double) scores.size());
		
		// 2. 회원 추가하기
		List<String> names = new ArrayList<>();
		names.add("우솝");
		names.add("루피");
		names.add("상디");
		names.add("나미");
		names.add("로빈");
		
		// 새로 입력할 이름
		List<String> newNames = new ArrayList<>();
		newNames.add("보람");
		newNames.add("루피");
		newNames.add("쵸파");
		newNames.add("로빈");
		newNames.add("루피");
		
		int count = 1;
		for (int i = 0; i < newNames.size(); i++) {
			if (names.contains(newNames.get(i))) { // 동명이인이 있는 경우
				String name = newNames.get(i) + count; // 동명이인인 경우 숫자를 붙인다.
				// 숫자를 붙인 이름도 이미 있는지 확인
				if (names.contains(name)) {
					count++;
					i--; // 이름+번호로 다시 검사하기 위해 같은 이름으로 반복문을 다시 돌린다.
					continue;
				}
				
				names.add(name);
				count = 1; // 저장 후 count를 1로 초기화
			} else {
				// 동명이인이 없는 경우 바로 저장
				names.add(newNames.get(i));
			}
		}
		
		System.out.println(names);
	}

}
