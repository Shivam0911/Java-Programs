import static java.lang.System.*;
import java.util.Scanner;

class StringTest4
{
	public static void main(String args[])
	{
		String str = " Unisoft Technologies ";

		//str = str.trim();
		//str = str.concat(", Dehradun");
		//str = str.toUpperCase();

		//Method Chaining,			Method Nesting		x = Math.round(Math.sqrt(Math.cbrt(n)));

		str = str.trim().concat(", Dehradun").toUpperCase();

		out.println(str);
	}
}
