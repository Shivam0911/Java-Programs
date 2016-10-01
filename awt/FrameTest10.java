import java.awt.*;
import java.awt.event.*;

class ColorFrame extends Frame implements ActionListener
{
	Button b1,b2,b3,b4,b5;

	public ColorFrame()
	{
		FlowLayout layout = new FlowLayout();
		this.setLayout(layout);

		b1 = new Button("Red Color");
		b2 = new Button("Green Color");
		b3 = new Button("Blue Color");
		b4 = new Button("Random Color");
		b5 = new Button("Close Program");

		this.add(b1);this.add(b2);this.add(b3);this.add(b4);this.add(b5);
		Font f = new Font("Serif",Font.PLAIN,18);
		b1.setFont(f);b2.setFont(f);b3.setFont(f);b4.setFont(f);b5.setFont(f);


		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
	}
	public void actionPerformed(ActionEvent evt)
	{
		if(evt.getSource()==b1)
			this.setBackground(Color.RED);
		else if(evt.getSource()==b2)
			this.setBackground(Color.GREEN);
		else if(evt.getSource()==b3)
			this.setBackground(Color.BLUE);
		else if(evt.getSource()==b4)
			this.setBackground(Color.WHITE);
		else if(evt.getSource()==b5)
			System.exit(0);
	}
}


class FrameTest10
{
	public static void main(String args[])
	{
		ColorFrame f = new ColorFrame();
		f.setTitle("ColorFrame");
		f.setLocation(200,200);
		f.setSize(600,400);
		f.setVisible(true);
	}
}