import static java.lang.System.*;
import java.util.*;

class ElectronicDevice
{
	public void switchOn()
	{
		out.println("Switched On...");
	}
	public void switchOff()
	{
		out.println("Switched Off...");
	}
}

class CPU extends ElectronicDevice
{
	public void add(int a, int b)
	{
		int s = a+b;
		out.println("Sum = "+s);
	}
}

class HardDisk extends CPU
{
	public void saveData()
	{
		out.println("Data Saved..");
	}
}

class Computer extends HardDisk
{
}

class InhTest8
{
	public static void main(String[] args)
	{
		Computer c = new Computer();
		c.switchOn();
		c.add(3,4);
		c.saveData();
		c.switchOff();
	}
}
