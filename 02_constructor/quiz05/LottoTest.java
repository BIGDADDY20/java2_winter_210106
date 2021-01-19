package constructor_quiz01;

public class LottoTest {

	public static void main(String[] args) {
		// LottoChecker 객체 생성 시 당첨번호가 생성된다.
		LottoChecker lottoChecker = new LottoChecker();

		Lotto lotto1 = new Lotto();

		// 수동
		lotto1.manual(6, 10, 21, 23, 29, 44);
		String lottoResult1 = lottoChecker.check(lotto1); // 등수, 꽝
		// 출력
		System.out.println(lottoResult1);
		lotto1.printLottoNumbers();
		lottoChecker.printWinningNumbers();

		Lotto lotto2 = new Lotto();
		// 자동
		lotto2.auto();
		String lottoResult2 = lottoChecker.check(lotto2);
		// 출력
		System.out.println(lottoResult2);
		lotto2.printLottoNumbers();
		lottoChecker.printWinningNumbers();
	}

}
