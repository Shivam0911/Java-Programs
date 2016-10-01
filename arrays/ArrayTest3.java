import static java.lang.System.*;
import java.util.Scanner;

class ArrayTest3
{
	public static void main(String[] args)
	{
		int arr[] = {34,21,56,54,78,9,98,63,47,18};
		int i;

		for(i=0;i<arr.length;i++)				//str.length()
		{
			out.printf("%d -> %d\n",i,arr[i]);			//ArrayIndexOutOfBoundsException
		}

		out.println("======================");

		//int x;			//Error

		for(int x : arr)
		{
			out.println(x);
		}
	}
}
