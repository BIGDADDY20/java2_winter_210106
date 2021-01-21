package interface_ex01;

public class JobApplicant implements CProgramming, JavaProgramming {
	// 필드
	private int toeic;
	private double gradePoint; 
	private String[] licenses;
	
	// TODO getters, setters
	
	// 자소서
	public void writeLetter() {
		System.out.println("저는 서울에서 태어나 인자신 부모님 밑에....");
	}

	@Override
	public void procedure() {
		System.out.println("C언어는 절차지향이고 변수가 있고 함수가 있고, 반복문....");
	}

	@Override
	public void objectOriented() {
		System.out.println("JAVA는 객체지향 언어고 JVM 기반에서 돌아가고 .....");
	}
}
