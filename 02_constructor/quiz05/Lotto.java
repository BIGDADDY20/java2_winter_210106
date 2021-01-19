package constructor_quiz01;

import java.util.Random;

public class Lotto {
	// 속성(필드)
	private int[] lottoNumbers = new int[6];
	
	// 행위(메소드)
	public void manual(int n1, int n2, int n3, int n4, int n5, int n6) {
		this.lottoNumbers[0] = n1;
		this.lottoNumbers[1] = n2;
		this.lottoNumbers[2] = n3;
		this.lottoNumbers[3] = n4;
		this.lottoNumbers[4] = n5;
		this.lottoNumbers[5] = n6;
	}
	
	public void auto() {
		Random rand = new Random();
		
		for (int i = 0; i < lottoNumbers.length; i++) {
			int randNumber = rand.nextInt(45) + 1; // 1~45까지의 수를 랜덤으로 뽑는다.
			boolean isDuplicate = false;
			
			for (int j = 0; j < lottoNumbers.length; j++) { // 지금 들어있는 당첨번호 중에 중복이 있는지 확인
				if (this.lottoNumbers[j] == randNumber) {
					isDuplicate = true;
					break;
				}
			}
			
			if (isDuplicate) {
				i--;
				continue;
			} 
			this.lottoNumbers[i] = randNumber;
		}
	}
	
	public int[] getLottoNumbers() {
		return this.lottoNumbers;
	}
	
	public void printLottoNumbers() {
		System.out.print(lottoNumbers[0] + " ");
		System.out.print(lottoNumbers[1] + " ");
		System.out.print(lottoNumbers[2] + " ");
		System.out.print(lottoNumbers[3] + " ");
		System.out.print(lottoNumbers[4] + " ");
		System.out.print(lottoNumbers[5] + " ");
		System.out.println();
	}
	
}
