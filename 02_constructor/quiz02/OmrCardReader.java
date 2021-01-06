package constructor_quiz02;

public class OmrCardReader {
	private int[] correctAnswer = new int[5];
	
	public void setCorrectAnswer(int a1, int a2, int a3, int a4, int a5) {
		this.correctAnswer[0] = a1;
		this.correctAnswer[1] = a2;
		this.correctAnswer[2] = a3;
		this.correctAnswer[3] = a4;
		this.correctAnswer[4] = a5;
	}
	
	public void printScore(OmrCard omrCard) {
		int score = 0;
		for (int i = 0; i < correctAnswer.length; i++) {
			if (correctAnswer[i] == omrCard.getAnswer()[i]) {
				score += 100 / correctAnswer.length;
			}
		}
		System.out.println("이름:" + omrCard.getName());
		System.out.println("학번:" + omrCard.getStudentId());
		System.out.println("점수:" + score);
	}
}
