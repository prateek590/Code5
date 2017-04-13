
public class problem2 {

	public static void main(String[] args) {

		int arr[][] = { {11, 12, 13, 14, 15, 16},
		                {17, 18, 19, 20, 21, 22},
		                {23, 24, 25, 26, 27, 28}};
		               // {29, 30, 31, 32, 33, 34}};
		
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++)
				System.out.print(" "+arr[i][j]);
			System.out.println();
		}
		
		System.out.println();
		
		spiralPrint(2, 5, arr);
		
		
	
	}
	
	public static void spiralPrint(int endRow, int endCol, int[][] arr){
		
		int startRow = 0;
		int startCol = 0;
		
		while(startRow <= endRow && startCol <= endCol){
			
			for(int i=startCol;i<=endCol;i++)
				System.out.print(" "+arr[startRow][i]);
			startRow++;			
		
			for(int i=startRow;i<=endRow;i++)
				System.out.print(" "+arr[i][endCol]);
			endCol--;
			
			
			if(startRow<=endRow)
			{
			for(int i=endCol;i>=startCol;i--)
				System.out.print(" "+arr[endRow][i]);
			endRow--;
			}
			
			if(startCol<=endCol)
			{
			for(int i=endRow;i>=startRow;i--)
				System.out.print(" "+arr[i][startCol]);
			startCol++;
			}
		}
		
		
	}

}
