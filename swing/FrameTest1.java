import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class ExitFrame extends JFrame implements ActionListener
{
	JButton b1;

	public ExitFrame()
	{
		FlowLayout layout = new FlowLayout();
		this.setLayout(layout);

		b1 = new JButton("Close Program");
		this.add(b1);

		Font f = new Font("Serif",Font.PLAIN,18);
		b1.setFont(f);

		b1.addActionListener(this);

		this.setTitle("ExitFrame");
		this.setLocation(200,200);
		this.setSize(600,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//DO_NOTHING, HIDE, EXIT, DISPOSE
	}
	public void actionPerformed(ActionEvent evt)
	{
		System.exit(0);
	}
}


class FrameTest1
{
	public static void main(String args[])
	{
		ExitFrame f = new ExitFrame();
		f.setVisible(true);
	}
}