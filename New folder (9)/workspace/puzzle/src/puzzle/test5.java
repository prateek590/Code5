package puzzle;

import java.util.Random;

public class test5 {

	public static void main(String[] args) {
		int numberOfIterations = 5;
		int[] array=new int[numberOfIterations];
		int[] array2=new int[numberOfIterations];
		
		Random r = new Random();
		int diceShowSameNumber=0;
		int neitherDiceHasTheNumber=0;
		int eitherDiceHasTheNumber=0;
		int game = 0;
		int numberOfPersons=10;
		int [] array3 = new int[numberOfPersons];
		int person=0;
	while(person<numberOfPersons)
	{
		diceShowSameNumber=0;
		neitherDiceHasTheNumber=0;
		eitherDiceHasTheNumber=0;
		for(int i=0;i<numberOfIterations;i++){
		int a = r.nextInt(6);
		int userChoice = r.nextInt(6);
		int c = r.nextInt(6);
		int ta = 0 ;
		if(a==userChoice && userChoice==c)
		{
			diceShowSameNumber++;
			array[i]=+1;
			array2[i]=5;
		}
		
		if(a!=userChoice && userChoice!=c){
			neitherDiceHasTheNumber++;
			array[i]=-1;
			array2[i]=-1;
		}
		
		if((a==userChoice || userChoice==c) && (a!=c))
			{
				eitherDiceHasTheNumber++;
				array[i]=+1;
				array2[i]=+2;
			}
		//array[i]=diceShowSameNumber*5-neitherDiceHasTheNumber+2*eitherDiceHasTheNumber;
		}
		
		System.out.println("both dice show same number: "+diceShowSameNumber+" \nneither dice show the number: "+neitherDiceHasTheNumber+ " \neither dice show the number: "+eitherDiceHasTheNumber);
		
		int c=0;
		int c1=0;
		int c2=0;
		int d=0;
		for(int i=0;i<numberOfIterations;i++){
			if(array[i]>0)
				c++;
			if(array[i]<0)
				d++;
			if(array2[i]==5)
				c1++;
			if(array2[i]==2)
				c2++;
		}
	System.out.println("The number of times profit was made: "+c);
	System.out.println("The number of times you won 5 dollars: "+c1);
	System.out.println("The number of times you won 2 dollars: "+c2);
	System.out.println("The number of times you lose 1 dollar: "+d);
	System.out.println("Total Amount won(+)/lost(-): "+(diceShowSameNumber*5-neitherDiceHasTheNumber+2*eitherDiceHasTheNumber));
	array3[person]=diceShowSameNumber*5-neitherDiceHasTheNumber+2*eitherDiceHasTheNumber;
	person++;	
	System.out.println();
	}
int counter4=0;
	for(int i=0;i<numberOfPersons;i++){
		if(array3[i]>0)
			counter4++;
	}
		System.out.println("The number of persons won(each person playing 20 times) is: "+counter4);
	

	}

}

