import java.lang.*;
import java.util.Scanner;

class PerfectSquare
{
	public static void main(String args[])
	{
		int x,y;
		Scanner s = new Scanner(System.in);

		System.out.print("Enter a Number  : ");
		x = s.nextInt();

		y = (int)Math.sqrt(x);

		if(y*y==x)
		{
			System.out.println(x+" is Perfect Square");
		}
		else
		{
			System.out.println(x+" is NOT a Perfect Square");
		}
	}
}

