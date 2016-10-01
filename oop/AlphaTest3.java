import java.util.Scanner;

class Alpha
{
	private int x,y,z;
	private static int count;

	public Alpha(int a, int b, int c)
	{
		x = a;
		y = b;
		z = c;
		count++;
	}

	public void showData()
	{
		System.out.printf("x = %d, y = %d, z = %d, count = %d\n",x,y,z,count);
		sum();
		showCount();
	}

	public void sum()
	{
		int s;
		s = x+y+z;
		System.out.println("Sum = "+s);
	}

	public static void showCount()
	{
		System.out.println("Total Objects : "+count);
		//System.out.printf("x = %d\n",x);
		//sum();
		hello();
	}
	public static void hello()
	{
	}
}

class AlphaTest3
{
	public static void main(String args[])
	{
		Alpha a1 = new Alpha(3,5,8);
		a1.showData();

		//Alpha.showCount();

		Alpha.showCount();
	}
}
