import java.lang.*;
import java.util.Scanner;

class GCD2
{
	public static void main(String args[])
	{
		int x,y,r;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter 2 Numbers : ");
		x = s.nextInt();
		y = s.nextInt();

		if(x<y)
		{
			int t = x;
			x = y;
			y = t;
		}

		r = x%y;
		while(r != 0)
		{
			x = y;
			y = r;
			r = x%y;
		}

		System.out.println("GCD : "+y);
	}
}

