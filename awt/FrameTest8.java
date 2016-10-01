import java.awt.*;
import java.awt.event.*;

class ExitFrame extends Frame
{
	Button b1;

	public ExitFrame()
	{
		FlowLayout layout = new FlowLayout();
		this.setLayout(layout);

		b1 = new Button("Close Program");
		this.add(b1);

		Alpha a = new Alpha();
		b1.addActionListener(a);
	}
}

class Alpha implements ActionListener
{
	public void actionPerformed(ActionEvent evt)
	{
		System.exit(0);
	}
}

class FrameTest8
{
	public static void main(String args[])
	{
		ExitFrame f = new ExitFrame();
		f.setTitle("ExitFrame");
		f.setLocation(200,200);
		f.setSize(600,400);
		f.setVisible(true);
	}
}