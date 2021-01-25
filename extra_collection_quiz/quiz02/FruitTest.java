package ex02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class FruitTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<String> fruit = new ArrayList<>();
		
		while (true) {
			System.out.println("1:입력 2:출력 3:삭제 4:종료");
			int num = scan.nextInt();
			scan.nextLine(); // 숫자를 입력하고 누른 \n를 소비 시킨다.
			
			if (num == 1) {
				// 입력
				System.out.print("과일 이름을 입력하세요: ");
				boolean isInsert = fruit.add(scan.nextLine());
				System.out.println(isInsert ? "입력 성공" : "입력 실패");
			} else if (num == 2) {
				// 출력
				if (fruit.isEmpty()) {
					System.out.println("비어있습니다.");
					continue;
				}
				
				Iterator<String> iter = fruit.iterator();
				while (iter.hasNext()) {
					System.out.println(iter.next());
				}
			} else if (num == 3) {
				// 삭제
				System.out.print("삭제할 과일 이름을 입력하세요: ");
				String deleteFruit = scan.nextLine();
				System.out.println(fruit.remove(deleteFruit) ? "삭제 성공" : "삭제 실패");
			} else if (num == 4) {
				// 종료
				System.out.println("종료합니다.");
				break;
			} else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}
	}

}
