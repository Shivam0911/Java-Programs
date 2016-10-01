import java.util.Scanner;

class Rectangle
{
	private double height;
	private double width;

	public double getHeight()			//Getters / Accessors
	{
		return height;
	}
	public double getWidth()
	{
		return width;
	}

	public void setHeight(double h)		//Setters / Mutators
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
	public void setWidth(double w)
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

	public double getArea()
	{
		return height*width;
	}
	public double getPerimeter()
	{
		return 2*(height+width);
	}
}

class RectTest6
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
		//r1.height = x;

		System.out.print("Enter Width  : ");
		x = s.nextDouble();
		r1.setWidth(x);

		peri = r1.getPerimeter();
		area = r1.getArea();

		System.out.printf("Height    : %.2f\n",r1.getHeight());
		System.out.printf("Width     : %.2f\n",r1.getWidth());
		System.out.printf("Perimeter : %.2f\n",peri);
		System.out.printf("Area      : %.2f\n",area);
	}
}
