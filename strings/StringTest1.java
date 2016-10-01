import static java.lang.System.*;
import java.util.Scanner;

class StringTest1
{
	public static void main(String args[])
	{
		//String is an Object. Not an array

		String str;

		str = "Alpha";				//Preferred Way
		str = new String("Beta");

		String name;
		Scanner s = new Scanner(in);

		out.print("Enter Name : ");

		//name = s.next();			//Reads 1 Word			//scanf("%s",name);
		name = s.nextLine();		//Reads entire line		//gets(name);

		out.println("Hello "+name+"!");
		out.println("Total Characters : "+name.length());
		out.println("Initial Character : "+name.charAt(0));
	}
}
