import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class ColorFrame extends JFrame implements ActionListener
{
	JButton b1,b2,b3,b4,b5;

	public ColorFrame()
	{
		FlowLayout layout = new FlowLayout();
		this.getContentPane().setLayout(layout);

		b1 = new JButton("Red Color");
		b2 = new JButton("Green Color");
		b3 = new JButton("Blue Color");
		b4 = new JButton("White Color");
		b5 = new JButton("Close Program");

		this.getContentPane().add(b1);this.add(b2);this.add(b3);this.add(b4);this.add(b5);
		Font f = new Font("Serif",Font.PLAIN,18);
		b1.setFont(f);b2.setFont(f);b3.setFont(f);b4.setFont(f);b5.setFont(f);


		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);

		this.setTitle("ColorFrame");
		//this.setLocation(200,200);
		this.setSize(600,400);
		this.setLocationRelativeTo(null);
		this.setUndecorated(true);
		this.setOpacity(0.3F);				//0.0	-	1.0	(float) - frame must be undecorated
		//this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		//this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent evt)
	{
		if(evt.getSource()==b1)
			this.getContentPane().setBackground(Color.RED);
		else if(evt.getSource()==b2)
			this.getContentPane().setBackground(Color.GREEN);
		else if(evt.getSource()==b3)
			this.getContentPane().setBackground(Color.BLUE);
		else if(evt.getSource()==b4)
			this.getContentPane().setBackground(Color.WHITE);
		else if(evt.getSource()==b5)
			System.exit(0);
	}
}


class FrameTest2
{
	public static void main(String args[])
	{
		ColorFrame f = new ColorFrame();
		f.setVisible(true);
	}
}