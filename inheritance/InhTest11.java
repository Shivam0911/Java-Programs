import static java.lang.System.*;
import java.util.*;

class Circle
{
	private double radius;

	public Circle(double r)
	{
		radius = r;
	}

	public void getArea()
	{
		System.out.printf("Area      : %.2f\n",Math.PI*radius*radius);
	}

	public String toString()
	{
		return("Circle of Radius : "+radius);
	}
}

class InhTest11
{
	public static void main(String[] args)
	{
		Date d = new Date();
		String s = new String("Hello");
		Circle c = new Circle(2.3);

		out.println(d);
		out.println(s+" : "+c);
		out.println(c);

		//String + Anything.toString() = String
	}
}
