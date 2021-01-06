import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		String[] names = new String[5];
		Scanner scan = new Scanner(System.in);
		int index = 0;
		while (true) {
			String name = scan.nextLine();
			
			try {
				names[index] = name;
				index++;
			} catch (ArrayIndexOutOfBoundsException e) {
				break; // 배열이 가득차면 예외 발생 => 반복문 종료
			}
		}
		
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
	}

}
