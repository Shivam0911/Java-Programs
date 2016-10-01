import java.lang.*;
import java.util.Scanner;

class RectTest1
{
	public static void main(String args[])
	{
		double height, width, area, peri;

		Scanner s = new Scanner(System.in);

		System.out.print("Enter Height : ");
		height = s.nextDouble();

		if(height<=0)
		{
			System.out.println("Invalid Height");
			System.exit(0);
		}

		System.out.print("Enter Width  : ");
		width = s.nextDouble();

		if(width<=0)
		{
			System.out.println("Invalid Width");
			System.exit(0);
		}

		peri = 2*(height+width);
		area = height*width;

		System.out.printf("Perimeter : %.2f\n",peri);
		System.out.printf("Area      : %.2f\n",area);
	}
}
