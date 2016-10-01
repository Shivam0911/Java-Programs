import java.awt.*;

class ButtonFrame extends Frame
{
	Button b1;

	public ButtonFrame()
	{
		b1 = new Button("Click Me");
		this.add(b1);
	}
}

class FrameTest3
{
	public static void main(String args[])
	{
		ButtonFrame f = new ButtonFrame();
		f.setTitle("ButtonFrame");
		f.setLocation(200,200);
		f.setSize(600,400);
		f.setVisible(true);
	}
}