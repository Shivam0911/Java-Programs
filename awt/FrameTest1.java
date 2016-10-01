import java.awt.*;

class FrameTest1
{
	public static void main(String args[])
	{
		Frame f = new Frame();
		f.setTitle("My First Window");
		f.setLocation(200,200);
		f.setResizable(false);
		f.setSize(600,400);		//width, height
		f.setVisible(true);		//Last Statement
	}
}