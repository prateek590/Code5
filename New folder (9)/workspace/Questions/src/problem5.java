import java.util.Scanner;

public class problem5 {

	public static void main(String[] args) {


		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the String:");
		
		String s=input.nextLine();
		
	System.out.println(lastThreeCapsLetters(s));
		
		
		
	}

	public static String lastThreeCapsLetters(String g){
		String result="";
		char ch ='a';
		if(g.length()<=3){
		
			for(int i=0;i<g.length();i++)
			{
			ch = g.charAt(i);
			if(ch>=97&&ch<=122){
			ch=(char)(ch-('a'-'A'));
			result+=ch;
			}
			else
				result+=ch;
			}
				
			return result;
				
		}
		else
		{
			//int length = g.length()-3;
			for(int i=0;i<g.length();i++){
				
				{
					ch = g.charAt(i);
					if(ch>=97&&ch<=122 && i>=g.length()-3){
					ch=(char)(ch-('a'-'A'));
					result+=ch;
					}
					else
						result+=ch;
					}
				
				
			}
			return result;

		}
		
		
	}
	
}
