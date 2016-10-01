import java.awt.*;

class MyFrame extends Frame
{

}

class FrameTest2
{
	public static void main(String args[])
	{
		MyFrame f = new MyFrame();				//Blank Window
		f.setTitle("MyFrame");
		f.setLocation(200,200);
		f.setResizable(false);
		f.setSize(600,400);		//width, height
		f.setVisible(true);		//Last Statement
	}
}