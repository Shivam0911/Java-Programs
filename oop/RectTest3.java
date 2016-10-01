import java.lang.*;
import java.util.Scanner;

class Rectangle			//Custom Data Type / Derived/ User Defined
{
	double height;
	double width;
}

class RectTest3
{
	public static void main(String args[])
	{
		double area, peri;
		Rectangle r1;			//It is just a reference

		Scanner s = new Scanner(System.in);
		r1 = new Rectangle();

		System.out.print("Enter Height : ");
		r1.height = s.nextDouble();

		if(r1.height<=0)
		{
			System.out.println("Invalid Height");
			System.exit(0);
		}

		System.out.print("Enter Width  : ");
		r1.width = s.nextDouble();

		if(r1.width<=0)
		{
			System.out.println("Invalid Width");
			System.exit(0);
		}

		peri = getPerimeter(r1.height,r1.width);
		area = getArea(r1.height,r1.width);

		System.out.printf("Perimeter : %.2f\n",peri);
		System.out.printf("Area      : %.2f\n",area);
	}

	public static double getArea(double h, double w)
	{
		return h*w;
	}
	public static double getPerimeter(double h, double w)
	{
		return 2*(h+w);
	}
}
