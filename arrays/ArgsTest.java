import static java.lang.System.*;
import java.util.Scanner;

class ArgsTest
{
	public static void main(String args[])
	{
		String str;
		Scanner s = new Scanner(in);

		if(args.length>0)
		{
			str = args[0];
		}
		else
		{
			out.print("Enter a String : ");
			str = s.nextLine();
		}

		int i,j,n;
		n = str.length();
		boolean flag = true;

		for(i=0,j=n-1;i<n/2;i++,j--)
		{
			if(str.charAt(i)!=str.charAt(j))
			{
				flag = false;
				break;
			}
		}

		if(flag)
			out.println("Palindrome");
		else
			out.println("Not a Palindrome");
	}
}
