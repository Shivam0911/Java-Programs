import static java.lang.System.*;
import java.util.*;

class CPU
{
	public void add(int a, int b)
	{
		int s = a+b;
		out.println("Sum = "+s);
	}
}

class Computer
{
	public final static CPU cpu;

	static
	{
		cpu = new CPU();
	}
}
class InhTest10
{
	public static void main(String[] args)
	{
		Computer.cpu.add(12,34);			//System.out.println()

		//Computer.cpu = new CPU();
	}
}
