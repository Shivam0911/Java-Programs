import java.lang.*;
import java.util.Scanner;

class LoopSyntax2
{
	public static void main(String args[])
	{
		int i;						//goto, const(final) - keyword but its use is prohibited


		for(i=1;i<=10;i++)
		{
			if(i==7)
			{
				//break;
				//continue;
				//goto end;
				System.exit(0);		//Exit Status - 0(Success) 1(Failure)
			}
			System.out.println(i);
		}

		System.out.println("i = "+i);
	}
}

