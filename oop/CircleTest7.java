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

	public void finalize()
	{
		System.out.println("Circle Deleted : "+radius);
	}
}

class CircleTest7
{
	public static void main(String args[])
	{
		//Circle c = new Circle(3.5);
		//c = new Circle(4.5);


		Circle c1 = new Circle(1.0);
		Utility.printLine();
		c1.getArea();
		Utility.printLine();

		c1 = new Circle(2.0);
		c1.getArea();
		Utility.printLine();


		c1 = new Circle(3.0);
		c1.getArea();
		Utility.printLine();


		c1 = new Circle(4.0);
		c1.getArea();
		Utility.printLine();
		c1 = null;

		System.gc();		//To trigger the GC Manually
		Scanner s = new Scanner(System.in);
		s.nextLine();
	}
}
