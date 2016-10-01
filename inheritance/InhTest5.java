import static java.lang.System.*;
import java.util.*;

class Alpha
{
	public Alpha()
	{
		out.println("Alpha Object Created");
	}
}

class Beta extends Alpha
{
	public Beta()
	{
		out.println("Beta Object Created");
	}
}

class InhTest5
{
	public static void main(String[] args)
	{
		//Alpha a = new Alpha();

		Beta b = new Beta();
	}
}
