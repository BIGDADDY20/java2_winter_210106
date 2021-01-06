package interface_ex01;

// 취준생
public class JobApplicant implements CProgramming, JavaProgramming {
	// 스펙
	private int toeic;
	private double gradePoint; // 학점
	private String[] licenses; // 자격증
	
	// 자소서
	public String writeLetter() {
		String letter = "저는 서울에서 태어나 인자하신 부모님...";
		return letter;
	}
	
	@Override
	public void objectOriented() {
		System.out.println("java는 객체지향이고 어쩌구 저쩌구");
	}

	@Override
	public void procedure() {
		System.out.println("C언어는 절차지향이며 변수가 있고 함수가 있고,반복문...");
	}
	
	// getter, setter...
}
