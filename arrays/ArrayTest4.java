import static java.lang.System.*;
import java.util.*;

class ArrayTest4
{
	public static void main(String[] args)
	{
		int arr[] = new int[20];
		Random r = new Random();

		for(int i=0;i<arr.length;i++)
		{
			arr[i] = r.nextInt(10);
		}

		for(int x : arr)
		{
			out.println(x);
		}
	}
}
