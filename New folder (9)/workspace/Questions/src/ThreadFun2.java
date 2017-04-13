
class ThreadStart implements Runnable  {

	@Override
	public void run() {
		
		for(int i=0;i<13;i++)
			//System.out.println("1");
		System.out.println(Thread.currentThread().getName());
		
	}

	

		
		
		
	}

public class ThreadFun2{
	
	public static void main(String[] args){
		
		Thread.currentThread().setName("myCode");
		ThreadStart x = new ThreadStart();
		Thread t1 = new Thread(x);
		t1.start();
		for(int i=0;i<13;i++){
		//	System.out.println("0");
			System.out.println(Thread.currentThread().getName());
		}
		
	}
	
	
}
