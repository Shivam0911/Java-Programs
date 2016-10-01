import static java.lang.System.*;
import java.util.*;

class InhTest12
{
	public static void main(String[] args)
	{
		int x;
		x = 20;
		//out.println("x = "+x);
		out.println("x = "+new Integer(x).toString());			//Boxing

		Integer i = new Integer(34);
		Integer j = new Integer(44);
		//x = i.intValue()+j.intValue();
		x = i+j;												//Un-Boxing
		out.println("x = "+x);

		String str = "123";

		x = Integer.parseInt(str);

		out.println(Long.MAX_VALUE);
		out.println(Double.MAX_VALUE);
	}
}

/*
Primitives	Wrapper Classes

boolean		Boolean
char		Character
byte		Byte
short		Short
int			Integer			parseInt(String -> primitive), toString (primitive -> String)
long		Long
float		Float
double		Double			MIN_VALUE, MAX_VALUE
*/
