package constructor_quiz03;

import java.util.Random;

public class Lotto {
	int[] lottoNumbers = new int[6];
	
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
			int randNum = rand.nextInt(45) + 1;  // 1부터 45까지의 수를 랜덤으로 뽑는다.
			// 중복 확인
			for (int j = 0; j < lottoNumbers.length; j++) {
				if (this.lottoNumbers[j] == randNum) {
					i--;  // i를 한 번 더 돌리게 하기 위해 
					continue;
				}
			}
			
			this.lottoNumbers[i] = randNum;
		}
	}
	
	public void printLotto() {
		for (int i = 0; i < this.lottoNumbers.length; i++) {
			System.out.print(this.lottoNumbers[i] + " ");
		}
	}
	
	public int[] getLottoNumbers() {
		return this.lottoNumbers;
	}
}
