import java.util.Scanner;

class Circle
{
	private double radius;

	/*
	Constructor
	1. It is a function that is called at the time Object Creation.
	2. It has the name of the class.
	3. It can take arguments but can never return a Value.
	4. If we do not write a Constructor in a class, A constructor
			is written by the Compiler - Default Constructor(0 arguments)
	5. It can be overloaded.
	*/

	public Circle(double r)
	{
		if(r<=0)
		{
			System.out.println("Invalid Radius");
			System.exit(0);
		}
		else
		{
			radius = r;
		}
	}

	public Circle()
	{
		radius = 1.0;
	}

	public double getRadius()
	{
		return radius;
	}
	public void setRadius(double r)
	{
		if(r<=0)
		{
			System.out.println("Invalid Radius");
			System.exit(0);
		}
		else
		{
			radius = r;
		}
	}
	public void getDiameter()
	{
		System.out.printf("Diameter  : %.2f\n",2*radius);
	}
	public void getPerimeter()
	{
		System.out.printf("Perimeter : %.2f\n",2*Math.PI*radius);
	}
	public void getArea()
	{
		System.out.printf("Area      : %.2f\n",Math.PI*radius*radius);
	}
}

class CircleTest1
{
	public static void main(String args[])
	{
		Circle c1 = new Circle(2.0);
		Circle c2 = new Circle();

		Scanner s = new Scanner(System.in);

		//int x;
		//System.out.println(x);

		//All the variables that are created in HEAP are automatically initailized by Java.

		//c1.setRadius(2.5);

		Utility.printLine();
		c1.getDiameter();
		Utility.printLine();
		c1.getPerimeter();
		Utility.printLine();
		c1.getArea();
		Utility.printLine();
	}
}
