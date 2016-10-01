class Utility
{
	public static int getFactorial(int x)
	{
		int f = 1;
		while(x>0)
		{
			f = f * x--;
		}
		return f;
	}
}