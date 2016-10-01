import java.lang.*;
import java.util.Scanner;

class SwapTest
{
	public static void main(String args[])
	{
		int x,y;

		x = 10;
		y = 20;

		System.out.printf("x = %d, y = %d\n",x,y);

		swap(x,y);		//Call by Value

		//swap(&x,&y);		//Call By Reference

		System.out.printf("x = %d, y = %d\n",x,y);
	}

	public static void swap(int x, int y)
	{
		int t = x;
		x = y;
		y = t;
	}
/*
	public static void swap(int *p, int *q)
	{
		int t = *p;
		*p = *q;
		*q = t;
	}
*/
}
