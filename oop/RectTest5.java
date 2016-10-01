import java.lang.*;
import java.util.Scanner;

class Rectangle
{
	double height;
	double width;

	void setHeight(double h)
	{
		if(h<=0)
		{
			System.out.println("Invalid Height");
			System.exit(0);
		}
		else
		{
			height = h;
		}
	}
	void setWidth(double w)
	{
		if(w<=0)
		{
			System.out.println("Invalid Width");
			System.exit(0);
		}
		else
		{
			width = w;
		}
	}

	double getArea()
	{
		return height*width;
	}
	double getPerimeter()
	{
		return 2*(height+width);
	}
}

class RectTest5
{
	public static void main(String args[])
	{
		double area, peri, x;
		Rectangle r1;

		Scanner s = new Scanner(System.in);
		r1 = new Rectangle();

		System.out.print("Enter Height : ");
		x = s.nextDouble();
		r1.setHeight(x);

		System.out.print("Enter Width  : ");
		x = s.nextDouble();
		r1.setWidth(x);

		peri = r1.getPerimeter();
		area = r1.getArea();

		System.out.printf("Perimeter : %.2f\n",peri);
		System.out.printf("Area      : %.2f\n",area);
	}
}
