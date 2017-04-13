import java.util.Random;

public class problem13 {
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
		
	while(true){	
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
		
	//	System.out.println(sum+" "+sum1+" "+sum2+" "+sum3);
		/*
		for(int i=3;i<4;i++)
			for(int j=0;j<size;j++)
				sum3+=a[j][i];*/
int count1=0;
int num=1;


		for(int i=0;i<size;i++){
			if((a[i][0])==1)
		count1++;
		}
	
		
		
	int	count2=0;
		
		for(int i=0;i<size;i++){
			if((a[i][0])==2)
		count2++;
		}
	
		
		
	int	count3=0;
		
		for(int i=0;i<size;i++){
			if((a[i][0])==3)
		count3++;
		}
	
		
		
	int	count4=0;
		
		for(int i=0;i<size;i++){
			if((a[i][0])==4)
		count4++;
		}
	
		
		int count1a=0;
		 num=1;


				for(int i=0;i<size;i++){
					if((a[i][1])==1)
				count1a++;
				}
			
				
				
			int	count2a=0;
				
				for(int i=0;i<size;i++){
					if((a[i][1])==2)
				count2a++;
				}
			
				
				
			int	count3a=0;
				
				for(int i=0;i<size;i++){
					if((a[i][1])==3)
				count3a++;
				}
			
				
				
			int	count4a=0;
				
				for(int i=0;i<size;i++){
					if((a[i][0])==4)
				count4a++;
				}
			
				
				int count1b=0;
				 num=1;


						for(int i=0;i<size;i++){
							if((a[i][2])==1)
						count1b++;
						}
					
						
						
					int	count2b=0;
						
						for(int i=0;i<size;i++){
							if((a[i][2])==2)
						count2b++;
						}
					
						
						
					int	count3b=0;
						
						for(int i=0;i<size;i++){
							if((a[i][2])==3)
						count3b++;
						}
					
						
						
					int	count4b=0;
						
						for(int i=0;i<size;i++){
							if((a[i][2])==4)
						count4b++;
						}
					
		int count2c=0;
				for(int i=0;i<=1;i++)
					for(int j=0;j<=1;j++)
						if(a[i][j]==1)
								count2c++;
				
				
				int count3c=0;
				for(int i=0;i<=1;i++)
					for(int j=0;j<=1;j++)
						if(a[i][j]==2)
								count3c++;
				
				int count4c=0;
				for(int i=0;i<=1;i++)
					for(int j=0;j<=1;j++)
						if(a[i][j]==3)
								count4c++;
				
				int count1c=0;
				for(int i=0;i<=1;i++)
					for(int j=0;j<=1;j++)
						if(a[i][j]==4)
								count1c++;
	
		
		if(count1==count2 && count2==count3 && count3==count4 && count4==1 && count1a==count2a && count2a==count3a && count3a==count4a && count4a==1 && count1b==count2b && count2b==count3b && count3b==count4b && count4b==1 && count1c==count2c && count2c==count3c && count3c==count4c && count4c==1)
			break;
		
	}
	//	while(sum!=10 || sum1!=10 || sum2!=10 || sum3!=10);
		
		
		for(int i=0;i<size;i++){
			for(int j=0;j<size;j++)
				System.out.print(a[i][j]+"       ");
			System.out.println("\n");
			
		}
		
		
		
		
		
		
	}

}
