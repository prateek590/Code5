package puzzle;

public class test16 {

	public static void main(String[] args) {

		double eSum = 1;
		for(double i=1;i<5000;i++)
		
			
		
			eSum+=  1/(fact(i));
			
		
				System.out.println("The value of e is: "+eSum);
	}

	public static double fact(double i){
		if(i==1)
		return 1;
		else
			return i*(fact(i-1));
	}
	
}
