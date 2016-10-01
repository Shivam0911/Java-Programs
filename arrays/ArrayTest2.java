import static java.lang.System.*;
import java.util.Scanner;

class ArrayTest2
{
	public static void main(String[] args)
	{
		int x;
		Scanner s = new Scanner(in);
		out.print("Enter size : ");
		x = s.nextInt();

		int[] arr = new int[x];

		for(int i=0;i<x;i++)
		{
			out.printf("Enter element %d : ",i+1);
			arr[i] = s.nextInt();
		}

		out.println("======================");

		for(int i=0;i<x;i++)
		{
			out.printf("%d -> %d\n",i,arr[i]);
		}
	}
}
