import java.awt.*;
import java.awt.event.*;

class ExitFrame extends Frame implements ActionListener
{
	Button b1;

	public ExitFrame()
	{
		FlowLayout layout = new FlowLayout();
		this.setLayout(layout);
		//this.setBackground(Color.PINK);

		b1 = new Button("Close Program");
		this.add(b1);
		Font f = new Font("Serif",Font.PLAIN,18);
		b1.setFont(f);
		b1.setBackground(Color.YELLOW);
		b1.setForeground(Color.BLUE);

		b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent evt)
	{
		System.exit(0);
	}
}


class FrameTest9
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