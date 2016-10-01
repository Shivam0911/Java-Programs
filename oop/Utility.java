//Function Overloading - Function with the same name but different arguments


class Utility
{
	private Utility()
	{
	}

	public static void printLine()
	{
		for(int i=1;i<=30;i++)
		{
			System.out.print("-");
		}
		System.out.println();
	}
	public static void printLine(char ch)
	{
		for(int i=1;i<=30;i++)
		{
			System.out.print(ch);
		}
		System.out.println();
	}

	public static void printLine(char ch, int n)
	{
		for(int i=1;i<=n;i++)
		{
			System.out.print(ch);
		}
		System.out.println();
	}
}