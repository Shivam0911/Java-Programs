import java.lang.*;
import java.util.Scanner;

class PrimeNumber2
{
	public static void main(String args[])
	{
		int n;
		boolean flag = true;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		n = s.nextInt();

		int x = (int)Math.sqrt(n);

		for(int i=2;i<=x;i++)					//1000000000
		{
			if(n%i==0)
			{
				flag = false;
				break;
			}
		}

		//if(flag==true)
		if(flag)			//only when the var is boolean
		{
			System.out.println(n+" is Prime");
		}
		else
		{
			System.out.println(n+" is NOT Prime");
		}
	}
}

