package constructor_quiz02;

public class OmrCardTest {

	public static void main(String[] args) {
		// OMR 카드 입력
		OmrCard omrCard = new OmrCard();
		omrCard.setStudentId(20200302);
		omrCard.setName("신보람");
		omrCard.setAnswer(3, 3, 4, 5, 1);

		// OMR 카드 읽기
		OmrCardReader reader = new OmrCardReader();
		// 정답 입력
		reader.setCorrectAnswer(3, 3, 4, 4, 1);
		// OMR 카드 입력 후 결과 확인
		reader.printScore(omrCard);
	}

}
