import java.awt.*;

class FlowLayoutFrame extends Frame
{
	Button b1,b2,b3,b4,b5;

	public FlowLayoutFrame()
	{
		//FlowLayout layout = new FlowLayout();
		//FlowLayout layout = new FlowLayout(FlowLayout.LEFT);
		FlowLayout layout = new FlowLayout(FlowLayout.LEFT,50,20);
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

class FrameTest5
{
	public static void main(String args[])
	{
		FlowLayoutFrame f = new FlowLayoutFrame();
		f.setTitle("FlowLayoutFrame");
		f.setLocation(200,200);
		f.setSize(600,400);
		f.setVisible(true);
	}
}