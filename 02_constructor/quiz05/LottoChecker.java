package constructor_quiz01;

import java.util.Random;

public class LottoChecker {
	// 필드
	private int[] winningNumbers = new int[6];
	
	// 메소드
	
	// 생성자
	public LottoChecker() {
		Random rand = new Random();
		
		for (int i = 0; i < winningNumbers.length; i++) { // 당첨번호를 채워넣기 위한 반복문
			int randNum = rand.nextInt(45) + 1;  // 1 ~ 45 수 중에 랜덤으로 뽑는다.
			
			// 중복확인
			boolean isDuplicate = false;
			
			for (int j = 0; j < winningNumbers.length; j++) { // 지금 들어있는 당첨번호 중에 중복이 있는지 확인
				if (this.winningNumbers[j] == randNum) {
					isDuplicate = true;
					break;
				}
			}
			
			if (isDuplicate) {
				i--;
				continue;
			} 
			this.winningNumbers[i] = randNum;
		}
	}
	
	public String check(Lotto lotto) {
		int[] numbers = lotto.getLottoNumbers();
		
		int count = 0; // 몇 개가 일치하는지
		for (int i = 0; i < this.winningNumbers.length; i++) {
			for (int j = 0; j < numbers.length; j++) {
				if (this.winningNumbers[i] == numbers[j]) {
					count++;
					continue; // 맞았다면 뒤에서는 맞을 숫자가 나오지 않기 때문에 skip
				}
			}
		}
		
		// 6개: 1등, 5개: 2등, 4개: 3등, 3개: 4등, 나머지: 꽝
		if (count == 6) {
			return "1등";
		} else if (count == 5) {
			return "2등";
		} else if (count == 4) {
			return "3등";
		} else if (count == 3) {
			return "4등";
		} else {
			return "꽝";
		}
	}
	
	public void printWinningNumbers() {
		System.out.print(winningNumbers[0] + " ");
		System.out.print(winningNumbers[1] + " ");
		System.out.print(winningNumbers[2] + " ");
		System.out.print(winningNumbers[3] + " ");
		System.out.print(winningNumbers[4] + " ");
		System.out.print(winningNumbers[5] + " ");
		System.out.println();
	}
}
