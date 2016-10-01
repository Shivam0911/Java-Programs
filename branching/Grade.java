import java.lang.*;
import java.util.Scanner;

class Grade
{
	public static void main(String args[])
	{
		int n;
		Scanner s = new Scanner(System.in);

		System.out.print("Enter your score  : ");
		n = s.nextInt();

		if(n>=85)
		{
			System.out.println("Grade : A");
		}
		else if(n>=70)
		{
			System.out.println("Grade : B");
		}
		else if(n>=55)
		{
			System.out.println("Grade : C");
		}
		else if(n>=45)
		{
			System.out.println("Grade : D");
		}
		else
		{
			System.out.println("Grade : F");
		}
	}
}

