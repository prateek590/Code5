import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class demo13 {

	public static void main(String[] args) {
	
		
		ExecutorService exec = Executors.newFixedThreadPool(2);

		exec.execute(new Runnable() {
		  public void run() {
		    System.out.println("Hello world");
		  }
		});

		exec.shutdown();
		

	}

}
