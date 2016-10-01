import static java.lang.System.*;
import java.util.*;

/*
	Overriding

	Rule 1 : The return type and arguments must be the same.
	 => if we change return type - Error
	 => if we change arguments, then it will be treated as overloading

	Rule 2 : We can not decrease the accessibility of a function

	Rule 3 : can not override a final method
*/

class Alpha
{
	public void show()
	{
		out.println("Alpha -- Show");
	}
	public final void display()
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


	//Over-riding -> redefining a method of parent class in the child class.
	public void display()
	{
		out.println("Beta -- Display");
	}

	/*
	public int display()
	{
		out.println("Beta -- Display");
		return 1;
	}*/
	/*
	public void display(int a)
	{
		out.println("Beta -- Display");
	}*/
	/*
	void display()
	{
		out.println("Beta -- Display");
	}*/
}

class InhTest3
{
	public static void main(String[] args)
	{

		Beta b = new Beta();
		b.print();
		b.show();
		b.display();
	}
}
