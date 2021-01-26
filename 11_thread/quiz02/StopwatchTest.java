package thread_quiz02;

import java.util.Scanner;

public class StopwatchTest extends Thread {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Stopwatch stopwatch = new Stopwatch();
		System.out.println("시작을 쓰면 스톱워치가 수행되고, 그만을 쓰면 스톱워치가 중단됩니다.");
		
		while (true) {
			String command = scan.nextLine();
			if (command.equals("시작")) {
				stopwatch.start();
			} else if (command.equals("그만")) {
				stopwatch.setStop(true);
				break;
			}
		}
		System.out.println("걸린 시간:" + stopwatch.getSeconds() + "초");
	}

}
