
public class problem7 {

	public static void main(String[] args) {

		String[] arr = new String[101];
		
		for(int a=1;a<=100;a++)
		{
			
			if(a%15==0){
				System.out.println("FizzBuzz");
				arr[a]="FizzBuzz";
			}
			else if(a%5==0){
				System.out.println("Buzz");
				arr[a]="Buzz";
			}
			else if(a%3==0){
				System.out.println("Fizz");
				arr[a]="Fizz";
			}
			else{
				arr[a]=""+a;
			}
			}	
		for(int i=1;i<=100;i++)
		System.out.print(" "+"\""+arr[i]+"\"");
	}

}
