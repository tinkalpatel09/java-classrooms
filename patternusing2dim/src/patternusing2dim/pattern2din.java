package patternusing2dim;
import java.util.Scanner;
public class pattern2din {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	 int[][] a = { {1}, {1, 2}, {1, 2, 3} , {1, 2, 3, 4} , {1, 2, 3, 4, 5},{1, 2, 3, 4, 5, 6} ,{1, 2, 3, 4, 5, 6, 7} ,{1, 2, 3, 4, 5, 6, 7, 8} ,{1, 2, 3, 4, 5, 6, 7, 8, 9} ,{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}  };
		int[][] a =new int[10][10];
		
		for(int i=0;i<10;i++)
		{
			for(int j=0;j<i+1;j++)
			{
				a[i][j]=j+1;
			}
		}
		 for (int i = 0; i < 10; i++)
		 {	 
	       for (int j = 0; j < i+1; j++)
	            {
	                System.out.print(a[i][j] +" ");
	            }
	               System.out.println("\n");		
		 }

	}
}
