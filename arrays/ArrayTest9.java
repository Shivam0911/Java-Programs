import static java.lang.System.*;
import java.util.*;


class ArrayTest9
{
	public static void main(String[] args)
	{
		int arr[][] = new int[5][];

		arr[0] = new int[10];
		arr[1] = new int[20];
		arr[2] = new int[30];
		arr[3] = new int[15];
		arr[4] = new int[5];

		int i,j;

		for(i=0;i<arr.length;i++)
		{
			for(j=0;j<arr[i].length;j++)
			{
				out.print(arr[i][j]+" ");
			}
			out.println();
		}

	}
}
