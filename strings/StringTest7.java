import static java.lang.System.*;
import java.util.Scanner;

class StringTest7
{
	public static void main(String args[])
	{
		StringBuffer sb = new StringBuffer("Unisoft Technologies");		//Mutable
		out.println(sb);

		//sb.append(", Dehradun");
		//sb.insert(7,"ware");
		//sb.delete(3,7);
		//sb.replace(3,7,"hardware");
		sb.reverse();

		out.println(sb);

		String str = sb.toString();
	}
}
