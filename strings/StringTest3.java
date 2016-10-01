import static java.lang.System.*;
import java.util.Scanner;

class StringTest3
{
	public static void main(String args[])
	{
		String str = "Unisoft Technologies";		//String Objects are Immutable.
		out.println(str);

		String temp;

		temp = str.toUpperCase();
		out.println(temp);

		temp = str.toLowerCase();
		out.println(temp);

		temp = str.concat(", Dehradun");
		out.println(temp);

		temp = str.replace("o","--");
		out.println(temp);
	}
}
