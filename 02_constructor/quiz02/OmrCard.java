package constructor_quiz02;

public class OmrCard {
	private int[] answer = new int[5];
	private String name;
	private int studentId;
	private int score;
	
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAnswer(int a1, int a2, int a3, int a4, int a5) {
		this.answer[0] = a1;
		this.answer[1] = a2;
		this.answer[2] = a3;
		this.answer[3] = a4;
		this.answer[4] = a5;
	}

	public int[] getAnswer() {
		return answer;
	}

	public String getName() {
		return name;
	}

	public int getStudentId() {
		return studentId;
	}

	public int getScore() {
		return score;
	}
	
}
