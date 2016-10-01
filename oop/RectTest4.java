import java.lang.*;
import java.util.Scanner;

class Rectangle			//is a Definition of a real world entity.
{
	//Properties - Data Members
	double height;
	double width;

	//Behaviours - Functions

	double getArea()							//Encapsulation
	{											//Abstraction
		return height*width;
	}
	double getPerimeter()
	{
		return 2*(height+width);
	}
}

//System.in, System.out

class RectTest4
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

		peri = r1.getPerimeter();
		area = r1.getArea();

		System.out.printf("Perimeter : %.2f\n",peri);
		System.out.printf("Area      : %.2f\n",area);
	}
}
