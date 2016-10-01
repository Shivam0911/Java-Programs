import java.lang.*;
import java.util.Scanner;

class BitwiseOperators
{
	public static void main(String args[])
	{
		// ~	Complement

		/*
		int x,y;
		x = 20;							//	00000000 00000000 00000000 00010100
		y = ~x;							//	11111111 11111111 11111111 11101011
		System.out.println("y = "+y);
		*/

		// >>	right shift(half)		<<	left shift(double)

		/*
		int x,y;
		x = 200;								//	00 00000000 00000000 00000000 000101
		y = x>>4;							//
		System.out.println("y = "+y);
		*/

		int x,y,z;
		x = 20;							// 00010100
		y = 15;							// 00001111
		//z = x & y;						// 00000100
		//z = x | y;						// 00011111
		z = x ^ y;						// 00011011
		System.out.println("z = "+z);
	}
}

