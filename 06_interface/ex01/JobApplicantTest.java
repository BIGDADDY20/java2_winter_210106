package interface_ex01;

public class JobApplicantTest {

	public static void main(String[] args) {
		JobApplicant boram = new JobApplicant();
		boram.writeLetter();
		
		Naver naver = new Naver();
		naver.recruitJavaProgrammer(boram); // 구현이 된 사람만 지원할 수 있는 자격이 주어진다.
		naver.recruitCProgrammer(boram);
	}

}
