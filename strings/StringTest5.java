import static java.lang.System.*;
import java.util.Scanner;

class StringTest5
{
	public static void main(String args[])
	{
		/*
		String s1 = new String("Alpha");
		String s2 = new String("Alpha");

		out.println(s1==s2);		//Compare the references
		out.println(s1.equals(s2));
		*/

		String s1 = "Alpha";		//Delhi, DELHI, Delhi, dElHi
		String s2 = "alpha";

		//s1 = s1+"Beta";			//will create a new object in the pool

		out.println(s1==s2);		//Compare the references
		out.println(s1.equals(s2));
		out.println(s1.equalsIgnoreCase(s2));

		s1 = s1.concat("Beta");

		s1 = s1 + "Gamma";			//Concatenation	-	Operator Overloading - java does not support

			//String + Anything = String

		s1 = "alpha";
		s2 = "Beta";

		int x = s1.compareTo(s2);		//s1.compareToIgnoreCase(s2);
		if(x==0)
			out.println("Equal");
		else if(x>0)
			out.println("s1 is greater");
		else
			out.println("s2 is greater");
	}
}
