import java.awt.*;

class GridLayoutFrame extends Frame
{
	Button b1,b2,b3,b4,b5;

	public GridLayoutFrame()
	{
		//GridLayout layout = new GridLayout(3,2);
		GridLayout layout = new GridLayout(3,2,20,10);
		this.setLayout(layout);

		b1 = new Button("Button : 1");
		b2 = new Button("Button : 2");
		b3 = new Button("Button : 3");
		b4 = new Button("Button : 4");
		b5 = new Button("Button : 5");

		this.add(b1);
		this.add(b2);
		this.add(b3);
		this.add(b4);
		this.add(b5);
	}
}

class FrameTest6
{
	public static void main(String args[])
	{
		GridLayoutFrame f = new GridLayoutFrame();
		f.setTitle("GridLayoutFrame");
		f.setLocation(200,200);
		f.setSize(600,400);
		f.setVisible(true);
	}
}