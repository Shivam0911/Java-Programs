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

class CPU
{
	public void add(int a, int b)
	{
		int s = a+b;
		out.println("Sum = "+s);
	}
}

class HardDisk
{
	public void saveData()
	{
		out.println("Data Saved..");
	}
}

class Computer extends ElectronicDevice
{
	CPU cpu;
	HardDisk disk;

	public Computer()
	{
		cpu = new CPU();
		disk = new HardDisk();
	}
}

class InhTest9
{
	public static void main(String[] args)
	{
		Computer c = new Computer();
		c.switchOn();
		c.cpu.add(3,4);				//System.out.println()
		c.disk.saveData();
		c.switchOff();
	}
}
