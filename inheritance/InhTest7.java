import static java.lang.System.*;
import java.util.*;

class Alpha
{
	private int x;

	public Alpha(int a)
	{
		x = a;
	}
	public void showData()
	{
		out.println("x = "+x);
	}
}

class Beta extends Alpha
{
	int y;

	public Beta(int a, int b)
	{
		super(a);
		y = b;
	}
	public void showData()
	{
		super.showData();
		out.println("y = "+y);
	}
}

class InhTest7
{
	public static void main(String[] args)
	{
		//Alpha a = new Alpha(4);
		//a.showData();

		Beta b = new Beta(5,6);
		b.showData();
	}
}
