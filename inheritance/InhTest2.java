import static java.lang.System.*;
import java.util.*;

//Universal Parent	-	Object

class Alpha
{
	public void show()
	{
		out.println("Alpha -- Show");
	}
}

class Beta extends Alpha
{
	public void print()
	{
		out.println("Beta -- Print");
	}
}

class InhTest2
{
	public static void main(String[] args)
	{
		Alpha a = new Alpha();
		a.show();
		a.toString();


		out.println("-----------------------");

		Beta b = new Beta();
		b.print();
		b.show();
		b.toString();
	}
}
