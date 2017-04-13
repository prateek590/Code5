package puzzles2;

public class test13 {

	public static void main(String[] args) {
char a ='*';
	int counter=0;
	for(int i=0;i<10;i++)
	{
		counter++;
		if(counter<5)
		for(int y=0;y<=i;y++){
		System.out.print(a);
		}
		else
		for(int y=i+1;y<10;y++){
			System.out.print(a);
		}
		System.out.println();
	}
		
		
	}
}
