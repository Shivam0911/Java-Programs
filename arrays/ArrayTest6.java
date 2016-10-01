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
}

class ArrayTest6
{
	public static void main(String[] args)
	{
		Circle[] arr = new Circle[5];		//will only create references

		//arr[0].getArea();					//Null Pointer Exception

		Scanner s = new Scanner(in);
		for(int i=0;i<arr.length;i++)
		{
			out.printf("Enter radius for Circle %d : ",i+1);
			double r = s.nextDouble();
			arr[i] = new Circle(r);
		}

		for(Circle c : arr)
		{
			c.getArea();
		}

		arr = null;

		//....


	}
}
