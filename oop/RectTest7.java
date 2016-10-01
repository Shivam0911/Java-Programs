import java.util.Scanner;

class RectTest7
{
	public static void main(String args[])		//Java Syntax
	{
		double area, peri, x;

		Scanner s = new Scanner(System.in);
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle();
		//Utility util = new Utility();

		System.out.print("Enter Height : ");
		x = s.nextDouble();
		r1.setHeight(x);

		System.out.print("Enter Width  : ");
		x = s.nextDouble();
		r1.setWidth(x);

		peri = r1.getPerimeter();
		area = r1.getArea();

		//Math.sqrt(10);		//javac, java, javap

		Utility.printLine();
		System.out.printf("Height    : %.2f\n",r1.getHeight());
		Utility.printLine('*');
		System.out.printf("Width     : %.2f\n",r1.getWidth());
		Utility.printLine('=',40);
		System.out.printf("Perimeter : %.2f\n",peri);
		Utility.printLine();
		System.out.printf("Area      : %.2f\n",area);
		Utility.printLine();
		main();


		//Rectangle.getArea();
	}
	public static void main()
	{
		System.out.println("Main with 0 args..");
	}
	public static void main(int n)
	{
	}
}
