import static java.lang.System.*;
import java.util.Scanner;

//Arrays are reference type variables.

class ArrayTest1
{
	public static void main(String[] args)
	{
		int[] a,b;

		a = new int[10];
		a = new int[20];

		b = a;

		a = null;

		int c[] = new int[10];

		out.println(c[3]);

		int arr[] = {34,21,56,54,78,9,98,63,47,17};
	}
}
