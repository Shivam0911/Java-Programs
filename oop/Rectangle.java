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