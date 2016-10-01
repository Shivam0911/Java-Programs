import java.lang.*;
import java.util.Scanner;

class LoopSyntax3
{
	public static void main(String args[])
	{
		//int i;

		for(int i=1;i<=10;i++)			//Block Scope
		{
			System.out.println(i);
		}

		System.out.println("i = "+i);
	}
}

