import java.util.Scanner;

public class problem4 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the first number:");

		int a = input.nextInt();

		System.out.println("Enter the second number:");

		int b = input.nextInt();

		boolean result= lastDigitChecker(a, b);
		
		if(result==true)
			System.out.println("the numbers have the same last digit");
		else
			System.out.println("the numbers do not have the same last digit");
	}

	public static boolean lastDigitChecker(int a, int b) {
                if(a%10==b%10) return true;
                else return false;
	}

}
