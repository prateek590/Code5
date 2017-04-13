import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Processor2 implements Runnable{
static int set1=0;
static int set2=0;
static int set3=0;
static int set4=0;
static int set5=0;
	private int id;
	
	public Processor2(int id){
		this.id=id;
	}
	
	public void run() {
		
		//System.out.println("Starting: "+id);
		int count=0;
		switch(id){
		case 0: {
			for(int i=2;i<50000;i++)
			{
				count=0;
				for(int j=1;j<=i;j++){
				if(i%j==0)
					count++;
				}
			if(count<3)
				set1++;
			}
			break;
		}
		case 1:{
			for(int i=50000;i<100000;i++)
			{
				count=0;
				for(int j=1;j<=i;j++){
				if(i%j==0)
					count++;
				}
			if(count<3)
				set2++;
			}
			break;
		}
		case 2:{
			for(int i=100000;i<150000;i++)
			{
				count=0;
				for(int j=1;j<=i;j++){
				if(i%j==0)
					count++;
				}
			if(count<3)
				set3++;
			}
			break;
		}
		case 3:{
			for(int i=150000;i<200000;i++)
			{
				count=0;
				for(int j=1;j<=i;j++){
				if(i%j==0)
					count++;
				}
			if(count<3)
				set4++;
			}
			break;
		}
		case 4:{
			for(int i=200000;i<250000;i++)
			{
				count=0;
				for(int j=1;j<=i;j++){
				if(i%j==0)
					count++;
				}
			if(count<3)
				set5++;
			}
			break;
		}
		}
		
		//System.out.println("Completed: "+id);
		System.out.println("Total number of primes in the given range: "+(set1+set2+set3+set4+set5));
		
	}
	
}

public class demo14 {

	public static void main(String[] args) {

		ExecutorService executor = Executors.newFixedThreadPool(3);
		for(int i=0;i<5;i++){
			executor.submit(new Processor2(i));	
		}
		executor.shutdown();
		long start = System.currentTimeMillis();
		//System.out.println("All tasks submitted");
		try {
			executor.awaitTermination(1, TimeUnit.DAYS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		long end = System.currentTimeMillis();
		System.out.println("Total time taken: "+(end-start));
	//	System.out.println("All tasks completed");
	}

}
