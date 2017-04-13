import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ThreadStart4 implements Runnable{
	static int c=0;
	List list = new ArrayList();
	//List list = Collections.synchronizedList(new ArrayList());
	@Override
	public void run() {
		int counter=0;
		for(int i=2;i<=5000;i++)
		{
			int j=1;
			counter=0;
			while(j<=i/2){
				int c = i%j;
				if(c==0)
					counter++;
				j++;
				
			}
			if(counter==1)
		//		System.out.println(i);
			addList(i);
			
			
		}
		
		
	}
	
	public void addList(int i){
		synchronized(this){
		list.add(i);
		c++;
		}
	}
	
	public void printList(){
		Collections.sort(list);
		System.out.println(list);
		System.out.println(c);
	}
	
}


public class ThreadFun4 {

	public static void main(String[] args) {

				ThreadStart4 t = new ThreadStart4();
		
				Thread t1 = new Thread(t);
				t1.start();
				int counter=0;
				for(int i=5001;i<10000;i++)
				{
					int j=1;
					counter=0;
					while(j<=i/2){
						int c = i%j;
						if(c==0)
							counter++;
						j++;
						
					}
					if(counter==1)
						//System.out.println(i);
					t.addList(i);
					
					
				}
				try {
					t1.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				t.printList();
	}

}
