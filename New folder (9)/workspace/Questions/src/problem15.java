import java.util.Random;

public class problem15 {
	static int sum = 0, sum1 = 0, sum2 = 0, sum3 = 0;
	static int size = 5;
static int runs=0;
	public static void main(String[] args) {
		int k = 0;

		int count = 0;
		int[] oneDim = new int[size];
		Random r = new Random();
		int[][] a = new int[size][size];
		/*
		 * for(int i=1;i<=9;i++){
		 * 
		 * for(int j=1;j<i;j++)
		 * 
		 * System.out.println(j+"/"+i+" ="+(double)j/i);
		 * 
		 * }
		 */

		while (true) {
			for (int i = 0; i < size; i++) {
				k = 0;
				for (k = 0; k < size; k++)
					oneDim[k] = k + 1;
				for (int j = 0; j < size; j++) {

					while (true) {
						int v = r.nextInt(size);
						if (oneDim[v] != 0) {
							a[i][j] = oneDim[v];
							oneDim[v] = 0;
							break;
						}
					}
				}

			}
			sum = 0;
			sum1 = 0;
			sum2 = 0;
			sum3 = 0;

			for (int i = 0; i < 1; i++)
				for (int j = 0; j < size; j++)
					sum += a[j][i];

			for (int i = 1; i < 2; i++)
				for (int j = 0; j < size; j++)
					sum1 += a[j][i];

			for (int i = 2; i < 3; i++)
				for (int j = 0; j < size; j++)
					sum2 += a[j][i];

			for (int i = 3; i < 4; i++)
				for (int j = 0; j < size; j++)
					sum3 += a[j][i];

			// System.out.println(sum+" "+sum1+" "+sum2+" "+sum3);
			/*
			 * for(int i=3;i<4;i++) for(int j=0;j<size;j++) sum3+=a[j][i];
			 */
			int count1 = 0;
			int num = 1;

			for (int i = 0; i < size; i++) {
				if ((a[i][0]) == 1)
					count1++;
			}

			int count2 = 0;

			for (int i = 0; i < size; i++) {
				if ((a[i][0]) == 2)
					count2++;
			}

			int count3 = 0;

			for (int i = 0; i < size; i++) {
				if ((a[i][0]) == 3)
					count3++;
			}

			int count4 = 0;

			for (int i = 0; i < size; i++) {
				if ((a[i][0]) == 4)
					count4++;
			}

			int count5 = 0;

			for (int i = 0; i < size; i++) {
				if ((a[i][0]) == 5)
					count5++;
			}

			int count6 = 0;

			for (int i = 0; i < size; i++) {
				if ((a[i][0]) == 6)
					count6++;
			}

			int count7 = 0;

			for (int i = 0; i < size; i++) {
				if ((a[i][0]) == 7)
					count7++;
			}

			int count8 = 0;

			for (int i = 0; i < size; i++) {
				if ((a[i][0]) == 8)
					count8++;
			}

			int count9 = 0;

			for (int i = 0; i < size; i++) {
				if ((a[i][0]) == 9)
					count9++;
			}

			int count1a = 0;
			num = 1;

			for (int i = 0; i < size; i++) {
				if ((a[i][1]) == 1)
					count1a++;
			}

			int count2a = 0;

			for (int i = 0; i < size; i++) {
				if ((a[i][1]) == 2)
					count2a++;
			}

			int count3a = 0;

			for (int i = 0; i < size; i++) {
				if ((a[i][1]) == 3)
					count3a++;
			}

			int count4a = 0;

			for (int i = 0; i < size; i++) {
				if ((a[i][1]) == 4)
					count4a++;
			}

			int count5a = 0;

			for (int i = 0; i < size; i++) {
				if ((a[i][1]) == 5)
					count5a++;
			}

			int count6a = 0;

			for (int i = 0; i < size; i++) {
				if ((a[i][1]) == 6)
					count6a++;
			}

			int count7a = 0;

			for (int i = 0; i < size; i++) {
				if ((a[i][1]) == 7)
					count7a++;
			}

			int count8a = 0;

			for (int i = 0; i < size; i++) {
				if ((a[i][1]) == 8)
					count8a++;
			}

			int count9a = 0;

			for (int i = 0; i < size; i++) {
				if ((a[i][1]) == 9)
					count9a++;
			}

			int count1b = 0;
			num = 1;

			for (int i = 0; i < size; i++) {
				if ((a[i][2]) == 1)
					count1b++;
			}

			int count2b = 0;

			for (int i = 0; i < size; i++) {
				if ((a[i][2]) == 2)
					count2b++;
			}

			int count3b = 0;

			for (int i = 0; i < size; i++) {
				if ((a[i][2]) == 3)
					count3b++;
			}

			int count4b = 0;

			for (int i = 0; i < size; i++) {
				if ((a[i][2]) == 4)
					count4b++;
			}

			int count5b = 0;

			for (int i = 0; i < size; i++) {
				if ((a[i][2]) == 5)
					count5b++;
			}

			int count6b = 0;

			for (int i = 0; i < size; i++) {
				if ((a[i][2]) == 6)
					count6b++;
			}

			int count7b = 0;

			for (int i = 0; i < size; i++) {
				if ((a[i][2]) == 7)
					count7b++;
			}

			int count8b = 0;

			for (int i = 0; i < size; i++) {
				if ((a[i][2]) == 8)
					count8b++;
			}

			int count9b = 0;

			for (int i = 0; i < size; i++) {
				if ((a[i][2]) == 9)
					count9b++;
			}

			int count1c = 0;
			num = 1;

			for (int i = 0; i < size; i++) {
				if ((a[i][3]) == 1)
					count1c++;
			}

			int count2c = 0;

			for (int i = 0; i < size; i++) {
				if ((a[i][3]) == 2)
					count2c++;
			}

			int count3c = 0;

			for (int i = 0; i < size; i++) {
				if ((a[i][3]) == 3)
					count3c++;
			}

			int count4c = 0;

			for (int i = 0; i < size; i++) {
				if ((a[i][3]) == 4)
					count4c++;
			}

			int count5c = 0;

			for (int i = 0; i < size; i++) {
				if ((a[i][3]) == 5)
					count5c++;
			}

			int count6c = 0;

			for (int i = 0; i < size; i++) {
				if ((a[i][3]) == 6)
					count6c++;
			}

			int count7c = 0;

			for (int i = 0; i < size; i++) {
				if ((a[i][3]) == 7)
					count7c++;
			}

			int count8c = 0;

			for (int i = 0; i < size; i++) {
				if ((a[i][3]) == 8)
					count8c++;
			}

			int count9c = 0;

			for (int i = 0; i < size; i++) {
				if ((a[i][3]) == 9)
					count9c++;
			}

			int count1d = 0;
			num = 1;

			for (int i = 0; i < size; i++) {
				if ((a[i][4]) == 1)
					count1d++;
			}

			int count2d = 0;

			for (int i = 0; i < size; i++) {
				if ((a[i][4]) == 2)
					count2d++;
			}

			int count3d = 0;

			for (int i = 0; i < size; i++) {
				if ((a[i][4]) == 3)
					count3d++;
			}

			int count4d = 0;

			for (int i = 0; i < size; i++) {
				if ((a[i][4]) == 4)
					count4d++;
			}

			int count5d = 0;

			for (int i = 0; i < size; i++) {
				if ((a[i][4]) == 5)
					count5d++;
			}

			int count6d = 0;

			for (int i = 0; i < size; i++) {
				if ((a[i][4]) == 6)
					count6d++;
			}

			int count7d = 0;

			for (int i = 0; i < size; i++) {
				if ((a[i][4]) == 7)
					count7d++;
			}

			int count8d = 0;

			for (int i = 0; i < size; i++) {
				if ((a[i][4]) == 8)
					count8d++;
			}

			int count9d = 0;

			for (int i = 0; i < size; i++) {
				if ((a[i][4]) == 9)
					count9d++;
			}

		/*	int count1e = 0;
			num = 1;

			for (int i = 0; i < size; i++) {
				if ((a[i][5]) == 1)
					count1e++;
			}

			int count2e = 0;

			for (int i = 0; i < size; i++) {
				if ((a[i][5]) == 2)
					count2e++;
			}

			int count3e = 0;

			for (int i = 0; i < size; i++) {
				if ((a[i][5]) == 3)
					count3e++;
			}

			int count4e = 0;

			for (int i = 0; i < size; i++) {
				if ((a[i][5]) == 4)
					count4e++;
			}

			int count5e = 0;

			for (int i = 0; i < size; i++) {
				if ((a[i][5]) == 5)
					count5e++;
			}

			int count6e = 0;

			for (int i = 0; i < size; i++) {
				if ((a[i][5]) == 6)
					count6e++;
			}

			int count7e = 0;

			for (int i = 0; i < size; i++) {
				if ((a[i][5]) == 7)
					count7e++;
			}

			int count8e = 0;

			for (int i = 0; i < size; i++) {
				if ((a[i][5]) == 8)
					count8e++;
			}

			int count9e = 0;

			for (int i = 0; i < size; i++) {
				if ((a[i][5]) == 9)
					count9e++;
			}*/

			/*int count1f = 0;
			num = 1;

			for (int i = 0; i < size; i++) {
				if ((a[i][6]) == 1)
					count1f++;
			}

			int count2f = 0;

			for (int i = 0; i < size; i++) {
				if ((a[i][6]) == 2)
					count2f++;
			}

			int count3f = 0;

			for (int i = 0; i < size; i++) {
				if ((a[i][6]) == 3)
					count3f++;
			}

			int count4f = 0;

			for (int i = 0; i < size; i++) {
				if ((a[i][6]) == 4)
					count4f++;
			}

			int count5f = 0;

			for (int i = 0; i < size; i++) {
				if ((a[i][6]) == 5)
					count5f++;
			}

			int count6f = 0;

			for (int i = 0; i < size; i++) {
				if ((a[i][6]) == 6)
					count6f++;
			}

			int count7f = 0;

			for (int i = 0; i < size; i++) {
				if ((a[i][6]) == 7)
					count7f++;
			}

			int count8f = 0;

			for (int i = 0; i < size; i++) {
				if ((a[i][6]) == 8)
					count8f++;
			}

			int count9f = 0;

			for (int i = 0; i < size; i++) {
				if ((a[i][6]) == 9)
					count9f++;
			}

			int count1g = 0;
			num = 1;

			for (int i = 0; i < size; i++) {
				if ((a[i][7]) == 1)
					count1g++;
			}

			int count2g = 0;

			for (int i = 0; i < size; i++) {
				if ((a[i][7]) == 2)
					count2g++;
			}

			int count3g = 0;

			for (int i = 0; i < size; i++) {
				if ((a[i][7]) == 3)
					count3g++;
			}

			int count4g = 0;

			for (int i = 0; i < size; i++) {
				if ((a[i][7]) == 4)
					count4g++;
			}

			int count5g = 0;

			for (int i = 0; i < size; i++) {
				if ((a[i][7]) == 5)
					count5g++;
			}

			int count6g = 0;

			for (int i = 0; i < size; i++) {
				if ((a[i][7]) == 6)
					count6g++;
			}

			int count7g = 0;

			for (int i = 0; i < size; i++) {
				if ((a[i][7]) == 7)
					count7g++;
			}

			int count8g = 0;

			for (int i = 0; i < size; i++) {
				if ((a[i][7]) == 8)
					count8g++;
			}

			int count9g = 0;

			for (int i = 0; i < size; i++) {
				if ((a[i][7]) == 9)
					count9g++;
			}

			int count1h = 0;
			num = 1;

			for (int i = 0; i < size; i++) {
				if ((a[i][8]) == 1)
					count1h++;
			}

			int count2h = 0;

			for (int i = 0; i < size; i++) {
				if ((a[i][8]) == 2)
					count2h++;
			}

			int count3h = 0;

			for (int i = 0; i < size; i++) {
				if ((a[i][8]) == 3)
					count3h++;
			}

			int count4h = 0;

			for (int i = 0; i < size; i++) {
				if ((a[i][8]) == 4)
					count4h++;
			}

			int count5h = 0;

			for (int i = 0; i < size; i++) {
				if ((a[i][8]) == 5)
					count5h++;
			}

			int count6h = 0;

			for (int i = 0; i < size; i++) {
				if ((a[i][8]) == 6)
					count6h++;
			}

			int count7h = 0;

			for (int i = 0; i < size; i++) {
				if ((a[i][8]) == 7)
					count7h++;
			}

			int count8h = 0;

			for (int i = 0; i < size; i++) {
				if ((a[i][8]) == 8)
					count8h++;
			}

			int count9h = 0;

			for (int i = 0; i < size; i++) {
				if ((a[i][8]) == 9)
					count9h++;
			}
*/
			/*
			 * int count1c=0; for(int i=0;i<=1;i++) for(int j=0;j<=1;j++)
			 * if(a[i][j]==1) count1c++;
			 * 
			 * 
			 * int count2c=0; for(int i=0;i<=1;i++) for(int j=0;j<=1;j++)
			 * if(a[i][j]==2) count2c++;
			 * 
			 * int count3c=0; for(int i=0;i<=1;i++) for(int j=0;j<=1;j++)
			 * if(a[i][j]==3) count3c++;
			 * 
			 * int count4c=0; for(int i=0;i<=1;i++) for(int j=0;j<=1;j++)
			 * if(a[i][j]==4) count4c++;
			 */
			
			System.out.println(count1+ " "+ count2+" "+count3+ " "+ count4+" "+count5+ " "+ count6+" "+count7+ " "+ count8+" "
					+count9+ " "+ count1a+" "+count2a+ " "+ count3a+" "+count4a+ " "+ count5a+" "+count6a+ " "+ count7a+" "+count8a+ " "+ count9a);
			runs++;
			/*	count+ " "+ count1a+" "+
					count+ " "+ count1a+" "+
					count+ " "+ count1a+" "+
					count+ " "+ count1a+" "+
					count+ " "+ count1a+" "+
					count+ " "+ count1a+" "+
					count+ " "+ count1a+" "+
					count+ " "+ count1a+" "+
					count+ " "+ count1a+" "+
					count+ " "+ count1a+" "+
					count+ " "+ count1a+" "+*/
					

		/*	if (count1 == count2 && count2 == count3 && count3 == count4 && count4 == count5  && count5 == count6 && 
					count6 == count7 && count7 == count8 && count8 == count9 && count9 == 1 && count1a == count2a && count2a == count3a && 
					count3a == count4a && count4a == count5a  && count5a == count6a && 
					count6a == count7a && count7a == count8a && count8a == count9a && count9a == 1 && 
					count1b == count2b && count2b == count3b && count3b == count4b && count4b == count5b  && count5b == count6b && 
					count6b == count7b && count7b == count8b && count8b == count9b && count9b == 1) && count1c == count2c && 
					count2c == count3c && count3c == count4c && count4c == count5c  && count5c == count6c && 
					count6c == count7c && count7c == count8c && count8c == count9c && count9c == 1 && 
					count1d == count2d && count2d == count3d && count3d == count4d && count4d == count5d  && count5d == count6d && 
					count6d == count7d && count7d == count8d && count8d == count9d && count9d == 1 && count1e == count2e && count2e == count3e 
					&& count3e == count4e && count4e == count5e  && count5e == count6e && 
					count6e == count7e && count7e == count8e && count8e == count9e && count9e == 1 && count1f == count2f && 
					count2f == count3f && count3f == count4f && count4f == count5f  && count5f == count6f && 
					count6f == count7f && count7f == count8f && count8f == count9f && count9f == 1 && count1g == count2g && count2g == count3g 
					&& count3g == count4g && count4g == count5g  && count5g == count6g && 
					count6g == count7g && count7g == count8g && count8g == count9g && count9g == 1*/
if(count1==1 && count2==1 && count3==1 && count4==1 && count1a==1 && count2a==1 && count3a==1 && count4a==1 
&& count1b==1 && count2b==1 && count3b==1 && count4b==1 && count1c==1 && count2c==1 && count3c==1 && count4c==1)
			break;

		}
		// while(sum!=10 || sum1!=10 || sum2!=10 || sum3!=10);
System.out.println("\n"+runs+"\n\n");
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++)
				System.out.print(a[i][j] + "       ");
			System.out.println("\n");

		}

	}

}
