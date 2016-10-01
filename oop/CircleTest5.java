import java.util.Scanner;

class Circle
{
	private double radius;		//Getter(Read Only), Getter/Setter(Read-Write), Setter(Write Only)

	public Circle(double r)
	{
		radius = r;
	}

	public double getRadius()
	{
		return radius;
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

class CircleTest5
{
	public static void main(String args[])
	{
		Circle c1 = new Circle(1.0);		//Immutability - once defined can not be changed
		Utility.printLine();
		c1.getArea();
		Utility.printLine();		//Java does not have free() or delete function
		c1 = null;

		Circle c2 = new Circle(2.0);
		c2.getArea();
		Utility.printLine();
		c2 = null;

		Circle c3 = new Circle(3.0);
		c3.getArea();
		Utility.printLine();
		c3 = null;

		Circle c4 = new Circle(4.0);
		c4.getArea();
		Utility.printLine();
		c4 = null;


	}
}
