package puzzle;

public class test15 {

	public static void main(String[] args) {

		Integer a =1;
		long t2=0;
		int count=1;
		System.out.println(Integer.MAX_VALUE);
		long t1=System.currentTimeMillis();
		for(int i=0;i<2147483647;i++)
		{
			count++;
		/*	if(i==Integer.MAX_VALUE){
				 t2=System.currentTimeMillis();
			break;
			}*/
		}
		System.out.println(count);
		 t2=System.currentTimeMillis();
		System.out.println("Time taken: "+(t2-t1));
	}

}
