package constructor_quiz01;

public class Rectangle {
	// 속성: 필드, 멤버변수
	private int width;
	private int height;
	
	// 생성자
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
		System.out.println("가로 " + this.width + "cm, 세로 " + this.height + "cm 사각형이 만들어졌습니다");
	}
	
	// 행위: 메소드
	public int getArea() {
		return this.width * this.height;
	}
	
	public int getRound() {
		return (this.width * 2) + (this.height * 2);
	}
}
