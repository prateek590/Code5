package puzzles2;

import java.util.Random;

public class test4 {

	public static void main(String[] args) {

		String option1 = "hhh";
		String option2 = "thh";
		String s = "";
		Random r = new Random();
		int arr[] = new int[100];
		int ran;
		for(int i=0;i<100;i++){
		s="";
			while(!s.contains(option1)  && !s.contains(option2)){
		ran=r.nextInt(2);
		if(ran==0)
			s+="h";
		else if(ran==1)
			s+="t";
		
		}
		if(s.contains(option1))
			arr[i]=10;
		if(s.contains(option2))
			arr[i]=20;
		}
		int count1 =0;
		int count2 = 0;
			for(int i=0;i<100;i++)
				if(arr[i]==10)
					count1++;
				else
					count2++;
			System.out.printf("The number of times %s won is %d",option1,count1);
			System.out.printf("\nThe number of times %s won is %d",option2,count2);
	}


}
