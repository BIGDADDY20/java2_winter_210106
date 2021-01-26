package thread_quiz02;

public class Stopwatch extends Thread {
	private boolean stop; // stop flag
	private int seconds;

    @Override
    public void run() {
        while (!stop) {
            // 무한 실행
        	try {
				Thread.sleep(1000);
				this.seconds++;
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
        }
        // 실행 종료
    }

    public void setStop(boolean stop) {
        this.stop = stop;
    }
    
    public int getSeconds() {
    	return this.seconds;
    }
}
