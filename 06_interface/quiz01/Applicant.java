package interface_quiz01;

public class Applicant implements Sing, Act {

	@Override
	public void action() {
		System.out.println("연기하기");
	}

	@Override
	public void song() {
		System.out.println("노래하기");
	}
	
}
