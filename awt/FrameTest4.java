import java.awt.*;

class BorderLayoutFrame extends Frame
{
	Button b1,b2,b3,b4,b5;

	public BorderLayoutFrame()
	{
		b1 = new Button("Button : 1");
		b2 = new Button("Button : 2");
		b3 = new Button("Button : 3");
		b4 = new Button("Button : 4");
		b5 = new Button("Button : 5");

		this.add(b1,BorderLayout.NORTH);
		this.add(b2,BorderLayout.SOUTH);
		this.add(b3,BorderLayout.EAST);
		this.add(b4,BorderLayout.WEST);
		this.add(b5);
	}
}

class FrameTest4
{
	public static void main(String args[])
	{
		BorderLayoutFrame f = new BorderLayoutFrame();
		f.setTitle("BorderLayoutFrame");
		f.setLocation(200,200);
		f.setSize(600,400);
		f.setVisible(true);
	}
}