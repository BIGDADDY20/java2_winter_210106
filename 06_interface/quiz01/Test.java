package interface_quiz01;

public class Test {

	public static void main(String[] args) {
		// 지원자
		Applicant boram = new Applicant();
			
		// 지원할 곳 (JYP)
		JypEntertainment jyp = new JypEntertainment();
		jyp.actorAudition(boram);
		jyp.idolAudition(boram);
	}

}
