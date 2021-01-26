package thread_quiz01;

public class ThreadTest {

	public static void main(String[] args) throws InterruptedException {
		ThreadImplements animal1 = new ThreadImplements("어흥");
		ThreadImplements animal2 = new ThreadImplements("음메~");
		ThreadImplements animal3 = new ThreadImplements("히잉");
		
		Thread tiger = new Thread(animal1); 
		Thread cow = new Thread(animal2); 
		Thread horse = new Thread(animal3);
		tiger.start();
		cow.start();
		// block 또는 lock
		tiger.join();
		cow.join();
		
		horse.start();
	}

}
