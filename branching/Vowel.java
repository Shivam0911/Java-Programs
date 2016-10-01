import java.lang.*;
import java.util.Scanner;

class Vowel
{
	public static void main(String args[])
	{
		char ch;
		Scanner s = new Scanner(System.in);

		System.out.print("Enter an Alphabet  : ");
		ch = s.next().charAt(0);

		switch(ch)					//char, byte, short, int, String, enums
		{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				System.out.println("Vowel");
				break;
			default:
				System.out.println("Consonent");
		}

		/*
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
		{
			System.out.println("Vowel");
		}
		else
		{
			System.out.println("Consonent");
		}
		*/
	}
}

