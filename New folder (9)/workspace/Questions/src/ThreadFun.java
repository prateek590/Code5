
public class ThreadFun {

	static int c = 0;

	public static void main(String[] args) {

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				method1();
			}
		});

		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				method2();
			}
		});

		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(c);
	}

	public static void method1() {
		
		for (int i = 0; i < 10000; i++)
			c++;   
	}
	

	public static void method2() {
		for (int i = 0; i < 10000; i++)
			c++; 
	}
}
