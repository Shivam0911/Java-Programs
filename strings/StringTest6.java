import static java.lang.System.*;
import java.util.Scanner;

class StringTest6
{
	public static void main(String args[])
	{
		String str = "Tarun Kumar Sharma";

		out.println(str.startsWith("Am"));
		out.println(str.endsWith("ta"));
		out.println(str.contains("ar"));

		out.println("====================");

		//Forward Searching

		int i = str.indexOf("a");
		while(i != -1)
		{
			out.println(i);
			i = str.indexOf("a",i+1);
		}

		out.println("====================");

		//Backward Searching

		i = str.lastIndexOf("a");
		while(i != -1)
		{
			out.println(i);
			i = str.lastIndexOf("a",i-1);
		}

		out.println("====================");

		String s1 = str.substring(6);
		out.println(s1);
		s1 = str.substring(6,11);		//does not include 11
		out.println(s1);
	}
}
