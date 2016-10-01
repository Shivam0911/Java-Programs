import static java.lang.System.*;
import java.util.*;

class Alpha
{
	int x;

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
		super(a);		//has to be the first statement
		y = b;
	}
	public void showData()
	{
		out.println("x = "+x);
		out.println("y = "+y);
	}
}

class InhTest6
{
	public static void main(String[] args)
	{
		//Alpha a = new Alpha(4);
		//a.showData();

		Beta b = new Beta(5,6);
		b.showData();
	}
}
