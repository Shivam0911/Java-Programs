import static java.lang.System.*;
import java.util.*;				//Scanner, Date, Random, Arrays

class ArrayTest5
{
	public static void main(String[] args)
	{
		int arr[] = {34,21,56,54,78,9,98,63,47,18};
		int i;

		for(i=0;i<arr.length;i++)
		{
			out.printf("%d -> %d\n",i,arr[i]);
		}

		Arrays.sort(arr);

		out.println("=======================");

		for(i=0;i<arr.length;i++)
		{
			out.printf("%d -> %d\n",i,arr[i]);
		}

		out.println("=======================");

		int n = Arrays.binarySearch(arr,48);
		if(n>=0)
		{
			System.out.println("Element found at index : "+n);
		}
		else
		{
			System.out.println("Element not found");
		}
	}
}
