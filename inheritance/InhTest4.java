import static java.lang.System.*;
import java.util.*;

class Alpha
{
	public void show()
	{
		out.println("Alpha -- Show");
	}
	public void display()
	{
		out.println("Alpha -- Display");
	}
}

class Beta extends Alpha
{
	public void print()
	{
		out.println("Beta -- Print");
	}

	public void display()
	{
		//print();
		//show();
		super.display();								//Stack - Overflow Error
		out.println("Beta -- Display");
	}
}

class InhTest4
{
	public static void main(String[] args)
	{

		Beta b = new Beta();
		b.display();
	}
}
