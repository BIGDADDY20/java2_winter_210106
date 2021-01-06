package abstract_class_quiz01;

public class CmToInch extends Converter {
	public CmToInch() {
		this.ratio = 0.393701; // cm->inch 변환 비율은 변함 없기 때문에 내부에서 세팅한다.
	}
	
	@Override
	protected void printConverted() {
		System.out.println(this.result + "inch");
	}
}
