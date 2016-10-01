import java.lang.*;
import java.util.Scanner;

class PrimeNumber
{
	public static void main(String args[])
	{
		int n,c=0;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		n = s.nextInt();

		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				c++;
			}
		}

		if(c==0)
		{
			System.out.println(n+" is Prime");
		}
		else
		{
			System.out.println(n+" is NOT Prime");
		}
	}
}

