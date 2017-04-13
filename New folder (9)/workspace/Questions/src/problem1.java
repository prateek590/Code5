
public class problem1 {

	public static void main(String[] args) {

		char[] randomColors = {'b','r','r','r','b','y','y','y','b','r','y','r','b','r','y'};
		//sortedColors(randomColors);
		//sortCol(randomColors);
		fastSort(randomColors);
		System.out.println(randomColors);
	}
	
	public static void sortedColors(char[] arr){
		int red=0;
		int blue=0;
		int yellow=0;
		for(int i=0;i<arr.length;i++){
			
			if(arr[i]=='b')
	blue++;		
			else if(arr[i]=='y')
				yellow++;
			else
				red++;
			
		}
		for(int i=0;i<blue;i++)
			arr[i]='b';

		for(int i=blue;i<red+blue;i++)
			arr[i]='r';

		for(int i=red+blue;i<yellow+red+blue;i++)
			arr[i]='y';
		//System.out.println(arr);
	}
	
	public static void sortCol(char[] arr){
		int blue=-1;
		int red=-1;
		int yellow=-1;
		char temp;
		System.out.println(arr);
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]=='b')
			{
				blue++;
				temp=arr[blue];
				arr[blue]=arr[i];
				arr[i]=temp;
				
			}
			
			
		}
		System.out.println(arr);
		red = blue;
		for(int i=blue+1;i<arr.length;i++)
		{
			
			if(arr[i]=='r')
			{
				red++;
				temp=arr[red];
				arr[red]=arr[i];
				arr[i]=temp;
				
			}
			
			
		}
		System.out.println(arr);
		yellow = red;
		for(int i=red+1;i<arr.length;i++)
		{
		
			if(arr[i]=='y')
			{
				yellow++;
				temp=arr[yellow];
				arr[yellow]=arr[i];
				arr[i]=temp;
				
			}
			
			
		}
		
		
	}
	 static void fastSort(char a[])
	    {
	        int lo = 0;
	        int hi = a.length - 1;
	        int mid = 0;
	        	char temp;
	        while (mid <= hi)
	        {
	            switch (a[mid])
	            {
	            case 'b':
	            {
	                temp   =  a[lo];
	                a[lo]  = a[mid];
	                a[mid] = temp;
	                lo++;
	                mid++;
	                break;
	            }
	            case 'r':
	                mid++;
	                break;
	            case 'y':
	            {
	                temp = a[mid];
	                a[mid] = a[hi];
	                a[hi] = temp;
	                hi--;
	                break;
	            }
	            }
	        }
	    }

}
