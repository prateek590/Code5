
public class demo9 {

	private int count = 0;
	public synchronized void increment(){
		count++;
	}
	public static void main(String[] args) throws InterruptedException {
		demo9 d9 = new demo9();
		d9.doWork();
	}

	public void doWork() throws InterruptedException {
Thread t1 = new Thread(new Runnable(){
	public void run() {
		for(int i=0;i<10000;i++)
		increment();
	}
	
});

Thread t2 = new Thread(new Runnable(){
	public void run() {
		for(int i=0;i<10000;i++)
		increment();
	}
	
});
t1.start();
t2.start();
t1.join();
t2.join();
System.out.println("Count is "+count);
	}
}
