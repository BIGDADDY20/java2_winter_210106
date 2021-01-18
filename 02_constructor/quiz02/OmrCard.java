package contructor_quiz02;

// 설계도
public class OmrCard {
	// 속성: 필드
	private String name;
	private String studentNo;
	private int[] anwser = new int[5];
	
	// 생성자 : 리턴타입 없음, 클래스 명과 같다. 객체가 생성될 때 불려진다.
	public OmrCard() {
		System.out.println("생성자 호출됐음");
	}
	
	// 행위: 메소드
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}
	
	public String getStudentNo() {
		return this.studentNo;
	}
	
	public void setAnswer(int a1, int a2, int a3, int a4, int a5) {
		this.anwser[0] = a1;
		this.anwser[1] = a2;
		this.anwser[2] = a3;
		this.anwser[3] = a4;
		this.anwser[4] = a5;
	}
	
	public int[] getAnswer() {
		return this.anwser;
	}
}
