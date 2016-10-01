import java.lang.*;
import java.util.Scanner;

class GCD
{
	public static void main(String args[])
	{
		int x,y,i;
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

		for(i=y;i>=1;i--)
		{
			if(y%i==0 && x%i==0)
			{
				break;
			}
		}

		System.out.println("GCD : "+i);
	}
}

