import java.lang.*;
import java.util.Scanner;

class Factorial
{
	public static void main(String args[])
	{
		int n,f = 1;
		Scanner s = new Scanner(System.in);

		System.out.print("Enter a number : ");
		n = s.nextInt();					//5 = 5*4*3*2*1

		while(n>0)
		{
			//f = f * n;
			//n--;
			f = f * n--;
		}

		System.out.println("Factorial = "+f);
	}
}

