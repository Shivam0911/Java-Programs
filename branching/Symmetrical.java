import java.lang.*;
import java.util.Scanner;

class Symmetrical
{
	public static void main(String args[])
	{
		int x;
		Scanner s = new Scanner(System.in);

		System.out.print("Enter a Number  : ");
		x = s.nextInt();

		if(x/100 == x%100)			//23	23
		{
			System.out.println(x+" is Symmetrical");
		}
		else
		{
			System.out.println(x+" is NOT Symmetrical");
		}
	}
}

