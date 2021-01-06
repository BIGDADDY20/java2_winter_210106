package interface_ex01;

public class JobApplicantTest {

	public static void main(String[] args) {
		JobApplicant boram = new JobApplicant();
		System.out.println("자소서:" + boram.writeLetter());
		
		Naver naver = new Naver();
		naver.recruitJavaProgrammer(boram);
	}

}
