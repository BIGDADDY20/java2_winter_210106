package abstract_class_quiz01;

public class DollerToWon extends Converter {
	public DollerToWon(double won) { // 환율은 매번 변경되기 때문에 외부에서 받아온다.
		this.ratio = won;
	}

	@Override
	protected void printConverted() {
		System.out.println((int) this.result + "원");
	}

}
