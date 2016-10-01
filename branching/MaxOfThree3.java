import java.lang.*;
import java.util.Scanner;

class MaxOfThree2					//2-pass Compiler
{
	public static void main(String args[])
	{
		int x,y,z,max;
		Scanner s = new Scanner(System.in);

		System.out.print("Enter 3 Numbers  : ");
		x = s.nextInt();
		y = s.nextInt();
		z = s.nextInt();

		//max = getMaximum(x,y,z);

		System.out.println(getMaximum(x,y,z)+" is Largest");
	}

	public static int getMaximum(int a, int b, int c)
	{
		if(a>b && a>c)
		{
			return a;
		}
		else if(b>c)
		{
			return b;
		}
		else
		{
			return c;
		}
	}
}

