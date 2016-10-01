import java.lang.*;
import java.util.Scanner;

class MaxOfThree2
{
	public static void main(String args[])
	{
		int x,y,z;
		Scanner s = new Scanner(System.in);

		System.out.print("Enter 3 Numbers  : ");
		x = s.nextInt();
		y = s.nextInt();
		z = s.nextInt();

		if(x>y && x>z)
		{
			System.out.println(x+" is Largest");
		}
		else if(y>z)
		{
			System.out.println(y+" is Largest");
		}
		else
		{
			System.out.println(z+" is Largest");
		}
	}
}

