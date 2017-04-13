package puzzle;

import java.util.Random;
import java.util.Scanner;

public class test9 {

	public static void main(String[] args) {

		int count=0;
		boolean result=true;
		
		Scanner input =  new Scanner(System.in);
		Random r = new Random();
		
		System.out.println("Enter the number of questions");
		int num = input.nextInt();
		
		System.out.println("Enter the number of options per question");
		int options=input.nextInt();
		
		int[] actualAnswers = new int[num];
		for(int a=0; a<actualAnswers.length;a++)
			actualAnswers[a]=1+r.nextInt(options);
		
		System.out.println("Enter number of students");
		int students = input.nextInt();
		count=students;
		int counter=students;
		int[] studentAnswers = new int[num];
		int runs=0;
		
		while(true){
			count=students;
			counter=students;
		while(counter!=0){
			result=true;
			for(int i=0;i<studentAnswers.length;i++)
			studentAnswers[i]=1+r.nextInt(options);
			
			for(int i=0;i<num;i++)
			if(studentAnswers[i]!=actualAnswers[i])
			{
				result=false;
				count--;
				break;
				
			}
			
			counter--;
		}
		
		System.out.println("Number of students passed with 100% is: "+count);
		if(count!=0)
			break;
		runs++;
		}
		String str ="%";
		System.out.printf("\n\nAfter %d tests %d student(s) out of %d students guessed 100%s correctly",runs,count,students,str);
		//System.out.println("\n4 raised to 10 is: "+Math.pow(4, 10));
		
		
		}
	

}
