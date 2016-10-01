import static java.lang.System.*;
import java.util.*;


class ArrayTest7
{
	public static void main(String[] args)
	{
		String[] courses = {"Java","PHP","Android"};

		Circle[] arr = {new Circle(2.3), new Circle(2.4)};

		String[] names = new String[5];
		Scanner s = new Scanner(in);
		for(int i=0;i<names.length;i++)
		{
			out.printf("Enter name %d : ",i+1);
			names[i] = s.nextLine();
		}

		for(String name : names)
		{
			out.println(name+" : "+name.length());
		}
	}
}
