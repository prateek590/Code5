import java.util.Random;

public class problem12 {

	public static void main(String[] args) {

		int[] array = new int[10];
		int count=0;
		int y=0;
		Random r = new Random();
		for(int i=0;i<array.length;i++)
			array[i] = r.nextInt(20);
		for(int a: array)
		System.out.print(a+" ");
		System.out.println();
		for(int i=0;i<array.length;i++){
			
			if(i==array.length-1){
				System.out.println(-1+" ");
			break;
			}
			for(int j=i+1;j<array.length;j++)
			{
				y=j;
				count=0;

				if(array[j]>array[i]){
					System.out.print(array[j]+" ");
					count++;
					break;
				}
				
			}
			if(y==array.length-1 && count==0)
				System.out.print(-1+" ");
			
		}
		
		
	}

}
