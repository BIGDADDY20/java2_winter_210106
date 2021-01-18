package contructor_quiz02;

public class OmrCardTest {

	public static void main(String[] args) {
		// OmrCard 작성
		OmrCard card1 = new OmrCard();
		card1.setName("신보람");  // 필드 name에 값 저장
		System.out.println(card1.getName()); // 필드 name의 값 출력
		card1.setStudentNo("20202675");
		System.out.println(card1.getStudentNo());
		card1.setAnswer(3, 3, 4, 5, 1);
		int[] answer = card1.getAnswer();
		
		for (int i = 0; i < answer.length; i++) {
			System.out.println(answer[i]);
		}
		
		// OmrCard 읽기
		OmrCardReader reader = new OmrCardReader(3, 3, 5, 1, 2);
		// 정답 입력
		reader.printScore(card1);
	}

}
