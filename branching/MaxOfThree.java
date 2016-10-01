import java.lang.*;
import java.util.Scanner;

class MaxOfThree
{
	public static void main(String args[])
	{
		int x,y,z;
		Scanner s = new Scanner(System.in);

		System.out.print("Enter 3 Numbers  : ");
		x = s.nextInt();
		y = s.nextInt();
		z = s.nextInt();

		if(x>y)
		{
			if(x>z)
				System.out.println(x+" is Largest");
			else
				System.out.println(z+" is Largest");
		}
		else
		{
			if(y>z)
				System.out.println(y+" is Largest");
			else
				System.out.println(z+" is Largest");
		}
	}
}

