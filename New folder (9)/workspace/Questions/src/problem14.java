import java.util.Random;

public class problem14 {
	static int sum=0,sum1=0,sum2=0,sum3=0;
	static int size = 4; 
	public static void main(String[] args) {
int k=0;

		
	    int count=0;
		int[] oneDim = new int[size];
		Random r = new Random();
		int[][] a = new int[size][size];
/*		for(int i=1;i<=9;i++){
			
		for(int j=1;j<i;j++)	
		
		System.out.println(j+"/"+i+" ="+(double)j/i);
		
		}*/
		
	do{	
		for(int i=0;i<size;i++){
			k=0;
			for( k=0;k<size;k++)
				oneDim[k]=k+1;
			for(int j=0;j<size;j++)
			{
				
			while(true)	{
				int v=r.nextInt(size);
				if(oneDim[v]!=0){
				a[i][j]=oneDim[v];
				oneDim[v]=0;
				break;
				}
			}
			}
		
		}
		sum=0;sum1=0;sum2=0;sum3=0;
		
		for(int i=0;i<1;i++)
			for(int j=0;j<size;j++)
				sum+=a[j][i];			
			
		
		for(int i=1;i<2;i++)
			for(int j=0;j<size;j++)
				sum1+=a[j][i];
		
		
		for(int i=2;i<3;i++)
			for(int j=0;j<size;j++)
				sum2+=a[j][i];
		
		for(int i=3;i<4;i++)
			for(int j=0;j<size;j++)
				sum3+=a[j][i];
		
		System.out.println(sum+" "+sum1+" "+sum2+" "+sum3);
		/*
		for(int i=3;i<4;i++)
			for(int j=0;j<size;j++)
				sum3+=a[j][i];*/
	}
		while(sum!=10 || sum1!=10 || sum2!=10 || sum3!=10);
		
		
		for(int i=0;i<size;i++){
			for(int j=0;j<size;j++)
				System.out.print(a[i][j]+"       ");
			System.out.println("\n");
			
		}
		
		
		
		
		
		
	}

}
