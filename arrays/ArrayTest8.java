import static java.lang.System.*;
import java.util.*;


class ArrayTest8
{
	public static void main(String[] args)
	{
		int a[][] = new int[3][4];

		int[][] b = new int[4][5];

		int[] c[] = new int[3][5];

		int[][] arr = {{2,3,4,5,6},{3,4,5,6,7},{4,5,6,7,8},{6,5,4,3,2}};

		int i,j;

		for(i=0;i<4;i++)
		{
			for(j=0;j<5;j++)
			{
				out.print(arr[i][j]+" ");
			}
			out.println();
		}
	}
}
