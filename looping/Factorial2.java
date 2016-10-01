import java.lang.*;
import java.util.Scanner;

class Factorial2
{
	public static void main(String args[])
	{
		int n,f;
		char choice;
		Scanner s = new Scanner(System.in);

		do
		{
			f = 1;
			System.out.print("Enter a number : ");
			n = s.nextInt();

			while(n>0)
			{
				f = f * n--;
			}

			System.out.println("Factorial = "+f);
			System.out.print("Repeat (Y/N) : ");
			choice = s.next().charAt(0);

		}while(choice=='y' || choice=='Y');
	}
}

