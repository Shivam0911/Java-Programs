import java.util.Scanner;

class Circle
{
	private double radius;

	public Circle(double r)
	{
		radius = r;
	}

	public double getRadius()
	{
		return radius;
	}
	public void setRadius(double r)
	{
		radius = r;
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

class CircleTest2
{
	public static void main(String args[])
	{
		Circle c1 = new Circle(2.0);
		//Circle c2 = new Circle(3.0);
		Circle c2 = c1;

		Utility.printLine();
		c1.getArea();
		c2.getArea();
		Utility.printLine();

		c2.setRadius(3.0);
		c1.getArea();
		c2.getArea();
		Utility.printLine();

		c1.setRadius(4.0);
		c1.getArea();
		c2.getArea();
		Utility.printLine();
	}
}
