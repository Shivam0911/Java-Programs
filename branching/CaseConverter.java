import java.lang.*;
import java.util.Scanner;

class CaseConverter
{
	public static void main(String args[])
	{
		char ch;
		Scanner s = new Scanner(System.in);

		System.out.print("Enter an Alphabet  : ");
		ch = s.next().charAt(0);

		//if(ch>=97 && ch<=122)

		if(ch>='a' && ch<='z')
		{
			ch = (char)(ch-32);
			System.out.println("Uppercase : "+ch);
		}
		else if(ch>='A' && ch<='Z')
		{
			ch = (char)(ch+32);
			System.out.println("Lowercase : "+ch);
		}
		else
		{
			System.out.println("Not an Alphabet");
		}
	}
}

