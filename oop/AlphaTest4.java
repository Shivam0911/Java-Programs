import java.util.Scanner;

class Alpha
{
	private int x,y,z;
	private static int count;

	static			//class initializer
	{
		System.out.println("Alpha class loaded...");
	}

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

class AlphaTest4
{
	static
	{
		System.out.println("Before main...");
	}
	public static void main(String args[])
	{

		double r,d,p,a;
		Scanner s = new Scanner(System.in);

		System.out.print("Enter radius  : ");
		r = s.nextDouble();

		d = 2*r;
		p = 2*Math.PI*r;
		a = Math.PI*r*r;

		System.out.println("------------------------");			//DRY
		System.out.printf("Diameter   = %.2f\n",d);
		System.out.println("------------------------");
		System.out.printf("Perimeter  = %.2f\n",p);
		System.out.println("------------------------");
		System.out.printf("Area       = %.2f\n",a);
		System.out.println("------------------------");

		s.nextLine();
		s.nextLine();

		Alpha a1 = new Alpha(3,5,8);
		a1.showData();
		Alpha.showCount();
	}
}
