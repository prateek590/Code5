import java.util.Scanner;

class processor1 extends Thread {
	private volatile boolean running = true;

	public void run() {
		while (running) {
			System.out.println("Hello");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void shutDown() {		
		running = false;
	}
}

public class demo8 {

	public static void main(String[] args) {

		processor1 proc1 = new processor1();
		proc1.start();
		System.out.println("Press return to stop...");
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();
		proc1.shutDown();

	}

}
