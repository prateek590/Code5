import java.util.Scanner;

public class problem6 {

	public static void main(String[] args) {

		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the String:");
		
		String in = input.nextLine();
		
		everyNth(in, 2);
	}

	
	public static void everyNth(String n, int x){
		char ch='1';
		String result="";
		for(int i=0;i<n.length();i++)
		{
			ch=n.charAt(i);
			if(i%x==0){
				result+=ch;
			}
		}
		System.out.println(result);
	}
	
}
