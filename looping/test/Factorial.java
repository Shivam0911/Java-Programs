import java.lang.*;			//By default java imports classes from 2 places - java.lang, current dir(default package)
import java.util.Scanner;

class Factorial
{
	public static void main(String args[])
	{
		int n,f;
		Scanner s = new Scanner(System.in);

		System.out.print("Enter a number : ");
		n = s.nextInt();

		f = Utility.getFactorial(n);

		System.out.println("Factorial = "+f);
	}
}



