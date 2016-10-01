import java.lang.*;
import java.util.Scanner;

class UnaryOperators
{
	public static void main(String args[])
	{
		/*
		int x;
		x = 10;
		//x++;
		++x;
		System.out.println("x = "+x);
		*/

		/*
		int x,y;
		x = 10;
		//y = x++;			//y=x;	x+1
		y = ++x;			//x+1	y=x
		System.out.println("x = "+x);
		System.out.println("y = "+y);
		*/

		/*
		int x,y;
		x = 10;
		//y = x++ + x++;					//y = 10+11					x = 12
		//y = x++ + ++x;
		y = ++x + ++x + ++x;
		System.out.println("x = "+x);
		System.out.println("y = "+y);
		*/

		int a,b,c,d;
		a = 5;
		b = a--;
		c = --a + b++;
		d = (++a * --b * c++)/4;

		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println("c = "+c);
		System.out.println("d = "+d);

		//	a	b	c	d
		//	4	5	9	40

		//?:	-	Conditional Assignment

		int x,y,z;
		x = 5;
		y = 7;

		z = x>y?x:y;

		System.out.println("Larger : "+(x>y?x:y));

		if(x>y)
		{
			z = x;
		}
		else
		{
			z = y;
		}
	}
}

