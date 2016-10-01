import java.util.Scanner;

class Alpha
{
	private int x,y,z;

	public Alpha(int x, int y, int z)
	{
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public void showData()
	{
		System.out.printf("x = %d, y = %d, z = %d\n",this.x,this.y,this.z);
		this.sum();
	}

	public void sum()
	{
		int x;
		x = this.x+y+z;
		System.out.println("Sum = "+x);
	}
}

class AlphaTest1
{
	public static void main(String args[])
	{
		Alpha a1 = new Alpha(3,5,8);
		a1.showData();
		//a1.sum();				//implicit parameter passing

		Alpha a2 = new Alpha(2,3,6);
		a2.showData();
		//a2.sum();
	}
}
