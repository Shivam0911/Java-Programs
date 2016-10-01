import static java.lang.System.*;
import java.util.*;

//abstract class Alpha
//final class Alpha
class Alpha 		//extends Beta - not possible (Cyclic Inheritance)
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

class InhTest1
{
	public static void main(String[] args)
	{
		Alpha a = new Alpha();
		a.show();


		out.println("-----------------------");

		Beta b = new Beta();
		b.print();
		b.show();
	}
}
