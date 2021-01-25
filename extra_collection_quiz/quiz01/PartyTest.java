package extra_collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Quiz01 {

	public static void main(String[] args) {
		Map<String, String> myCharacter = new HashMap<>();
		myCharacter.put("닉네임", "마로비아나");
		myCharacter.put("직업", "마법사");
		myCharacter.put("서버", "B");
		myCharacter.put("레벨", "38");
		
		// [{닉네임=닉네임1, 직업=전사, 레벨=5}, {닉네임=닉네임1, 직업=전사, 레벨=5}...]
		List<Map<String, String>> characters = new ArrayList<>();
		Map<String, String> character1 = new HashMap<>();
		character1.put("닉네임", "사자고양이");
		character1.put("직업", "전사");
		character1.put("서버", "A");
		character1.put("레벨", "11");
		characters.add(character1);
		
		Map<String, String> character2 = new HashMap<>();
		character2.put("닉네임", "하구루");
		character2.put("직업", "마법사");
		character2.put("서버", "B");
		character2.put("레벨", "46");
		characters.add(character2);

		Map<String, String> character3 = new HashMap<>();
		character3.put("닉네임", "바다");
		character3.put("직업", "힐러");
		character3.put("서버", "B");
		character3.put("레벨", "23");
		characters.add(character3);
		
		Map<String, String> character4 = new HashMap<>();
		character4.put("닉네임", "초보");
		character4.put("직업", "힐러");
		character4.put("서버", "A");
		character4.put("레벨", "4");
		characters.add(character4);
		
		Map<String, String> character5 = new HashMap<>();
		character5.put("닉네임", "린다G");
		character5.put("직업", "힐러");
		character5.put("서버", "B");
		character5.put("레벨", "84");
		characters.add(character5);
		
		// TODO: 구현
		Map<String, String> topLevel = null;
		Iterator<Map<String, String>> iter = characters.iterator();
		while (iter.hasNext()) {
			Map<String, String> character = iter.next();
			String job = character.get("직업");
			String server = character.get("서버");
			if (server.equals(myCharacter.get("서버")) && job.equals("힐러")) {
				//System.out.println(character);
				
				// 레벨이 높은 사람 저장
				if (topLevel == null) {
					topLevel = character;
				} else {
					// 레벨 비교  compareTo    -1 0 1
					//   앞에 있는 애가 더 크면 : 1
					//   뒤에 있는 애가 더 크면 : -1
					//   같으면 : 0
					if (topLevel.get("레벨").compareTo(character.get("레벨")) < 0) {
						topLevel = character;
					}
				}
			}
		}
		System.out.println(topLevel);
	}
}
