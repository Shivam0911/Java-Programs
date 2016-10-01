import java.lang.*;
import java.util.Scanner;

class NestedLoop1
{
	public static void main(String args[])
	{
		int i,j,k;				//Labelled Break

		alpha:
		for(i=1;i<=3;i++)
		{
			beta:
			for(j=1;j<=3;j++)
			{
				for(k=1;k<=3;k++)
				{
					if(i==j && i==k)
					{
						//break alpha;
						continue alpha;
					}
					System.out.printf("%d,%d,%d\n",i,j,k);
				}
			}
		}
	}
}

