import java.awt.*;
import java.awt.event.*;

class MessageFrame extends Frame implements ActionListener
{
	Button b1,b2,b3;
	Label l1;
	TextField t1;

	public MessageFrame()
	{
		FlowLayout layout = new FlowLayout();
		this.setLayout(layout);
		Font f = new Font("Serif",Font.PLAIN,18);

		b1 = new Button("Show");b1.setFont(f);
		b2 = new Button("Clear");b2.setFont(f);b2.setEnabled(false);
		b3 = new Button("Close");b3.setFont(f);
		l1 = new Label("Message : ");l1.setFont(f);
		t1 = new TextField(25);t1.setEditable(false);t1.setFont(f);

		this.add(l1);this.add(t1);this.add(b1);this.add(b2);this.add(b3);


		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
	}
	public void actionPerformed(ActionEvent evt)
	{
		if(evt.getSource()==b1)
		{
			t1.setText("Welcome to GUI Programming");
			b1.setEnabled(false);
			b2.setEnabled(true);
		}
		else if(evt.getSource()==b2)
		{
			t1.setText("");
			b2.setEnabled(false);
			b1.setEnabled(true);
		}
		else if(evt.getSource()==b3)
		{
			System.exit(0);
		}
	}
}


class FrameTest11
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