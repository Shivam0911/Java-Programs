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

class CircleTest3
{
	public static void main(String args[])
	{
		Circle c1 = new Circle(2.0);

		Utility.printLine();
		c1.getArea();
		Utility.printLine();

		incrRadius(c1);			//Objects/Arrays are by default passed by reference

		//CircleTest3 ct = new CircleTest3();
		//ct.incrRadius(c1);

		c1.getArea();
		Utility.printLine();
	}

	public static  void incrRadius(Circle c)
	{
		double x = c.getRadius();
		c.setRadius(x+1);
	}
}
