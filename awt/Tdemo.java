import java.awt.*;
import java.awt.event.*;
class Test extends Thread //implements ActionListener
	{
		String s;
		int a,i;

 public Test(String s)
{
	this.s=s;
	}

public void  run()
	{
         if(s.equals("odd"))
		{
			for(i=1;i<21;i++)
		{if(i%2!=0)
			 System.out.println(s+"="+i);
try{
	Thread.sleep(100);
	}
catch(Exception e)
{}

}
}

         if(s.equals("even"))
		{
			for(i=1;i<21;i++)
		{
			if(i%2==0)
			 System.out.println(s+"="+i);
			 try{
			 	Thread.sleep(100);
			 	}
			 catch(Exception e)
{}
}

}
}
}
public class Tdemo
{

public static void main(String[] args)
	{

		Test a= new Test("even");
		Test d= new Test("odd");
	Thread b = new Thread(a);
	Thread c = new Thread(d);
	b.start();
    c.start();
	}
/*
	public void itemStateChanged(ItemEvent e)
	{
if(e.getSource()=="India")
{

	}

}
*/
}
