
class Runner extends Thread{
		
		public void run(){
			
			for(int i=0;i<10;i++){
				System.out.println("Hello "+i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		}
		
		
	}

public class demo5 {

	public static void main(String[] args) {

		Runner runner1 = new Runner();
		runner1.start();
		
		Runner runner2 = new Runner();
		runner2.start();
		
		
		Runner runner3 = new Runner();
		runner3.start();
	
	}

}
