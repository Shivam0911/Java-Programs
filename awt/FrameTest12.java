import java.awt.*;
import java.awt.event.*;

class MessageFrame extends Frame implements ActionListener
{
	Button b1,b2;
	Label l1;
	TextField t1;

	public MessageFrame()
	{
		FlowLayout layout = new FlowLayout();
		this.setLayout(layout);
		Font f = new Font("Serif",Font.PLAIN,18);

		b1 = new Button("Show");b1.setFont(f);
		b2 = new Button("Close");b2.setFont(f);
		l1 = new Label("Message : ");l1.setFont(f);
		t1 = new TextField(25);t1.setEditable(false);t1.setFont(f);

		this.add(l1);this.add(t1);this.add(b1);this.add(b2);


		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent evt)
	{
		if(evt.getSource()==b1)
		{
			String str = b1.getLabel();
			if(str.equals("Show"))
			{
				t1.setText("Welcome to GUI Programming");
				b1.setLabel("Clear");
				repaint();
			}
			else
			{
				t1.setText("");
				b1.setLabel("Show");
			}
		}
		else if(evt.getSource()==b2)
		{
			System.exit(0);
		}
	}
}


class FrameTest12
{
	public static void main(String args[])
	{
		MessageFrame f = new MessageFrame();
		f.setTitle("MessageFrame");
		f.setLocation(200,200);
		f.setSize(600,400);
		f.setVisible(true);
	}
}