package thread_quiz01;

public class ThreadImplements implements Runnable {
	
	private String cry;
	
	public ThreadImplements(String cry) {
		this.cry = cry;
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(this.cry);
		}
	}
	
}
