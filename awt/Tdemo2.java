import java.awt.*;
import java.awt.event.*;
class Reserve  implements  Runnable//implements ActionListener
	{
		int avail=1;
		int wanted;

 public Reserve(int s)
{
	wanted=s;
	}

synchronized public void  run()
	{
		System.out.println("no of births available"+avail);
if(avail>=wanted)
{
	String name =Thread.currentThread().getName();
	System.out.println(wanted+"alloted to "+name);
	try
	{
		Thread.sleep(2000);
		avail=avail-wanted;
		}
	catch(Exception e)
	{}
}else
System.out.println("no tickets");

}



}
public class Tdemo2
{

  public static void main(String args[]) {
        Reserve obj = new Reserve(1);
        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj);
        t1.setName("First Person");
        t2.setName("Second Person");
        t1.start();
        t2.start();
    }
}
