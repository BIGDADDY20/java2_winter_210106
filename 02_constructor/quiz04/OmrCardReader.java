package contructor_quiz02;

public class OmrCardReader {
	private int[] realAnswer = new int[5];
	
	public OmrCardReader(int a1, int a2, int a3, int a4, int a5) {
		this.realAnswer[0] = a1; 
		this.realAnswer[1] = a2; 
		this.realAnswer[2] = a3; 
		this.realAnswer[3] = a4; 
		this.realAnswer[4] = a5; 
	}
	
	// 점수 구하는 메소드
	public void printScore(OmrCard omrCard) {
		int score = 0;
		for (int i = 0; i < realAnswer.length; i++) {
			if (realAnswer[i] == omrCard.getAnswer()[i]) {
				score += 100 / realAnswer.length;
			}
		}
		System.out.println("이름:" + omrCard.getName());
		System.out.println("학번:" + omrCard.getStudentNo());
		System.out.println("점수:" + score);
	}
	
}
