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
		System.out.printf("x = %d, y = %d, z = %d, count = %d\n",this.x,this.y,this.z,Alpha.count);
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
	}
}

class AlphaTest2
{
	public static void main(String args[])
	{
		Alpha.showCount();

		Alpha a1 = new Alpha(3,5,8);
		Alpha a2 = new Alpha(2,3,6);
		Alpha a3 = new Alpha(8,4,9);
		Alpha a4 = new Alpha(4,5,7);

		a1.showData();
		a2.showData();
		a3.showData();
		a4.showData();

		Alpha.showCount();

	}
}
