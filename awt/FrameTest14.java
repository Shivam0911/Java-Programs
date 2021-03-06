import java.awt.*;
import java.awt.event.*;

class SimpleCalculator extends Frame implements ActionListener
{
	Button b1,b2,b3,b4,b5,b6;
	Label l1,l2,l3,title;
	TextField t1,t2,t3;
	Panel p1,p2,p3;

	public SimpleCalculator()
	{
		Font f = new Font("Serif",Font.PLAIN,18);

		b1 = new Button("  +  ");b1.setFont(f);
		b2 = new Button("  -  ");b2.setFont(f);
		b3 = new Button("  *  ");b3.setFont(f);
		b4 = new Button("  /  ");b4.setFont(f);
		b5 = new Button("Clear");b5.setFont(f);
		b6 = new Button("Close");b6.setFont(f);

		l1 = new Label("First Number : ");l1.setFont(f);
		l2 = new Label("Second Number : ");l2.setFont(f);
		l3 = new Label("Result : ");l3.setFont(f);
		title = new Label("Simple Calculator");title.setFont(new Font("Serif",Font.BOLD,30));

		t1 = new TextField(15);t1.setFont(f);
		t2 = new TextField(15);t2.setFont(f);
		t3 = new TextField(15);t3.setEditable(false);t3.setFont(f);

		p1 = new Panel();
		p1.add(title);

		p2 = new Panel();
		p2.setLayout(new GridLayout(3,2));
		p2.add(l1);p2.add(t1);
		p2.add(l2);p2.add(t2);
		p2.add(l3);p2.add(t3);

		p3 = new Panel();
		p3.add(b1);p3.add(b2);p3.add(b3);p3.add(b4);p3.add(b5);p3.add(b6);

		this.add(p1,BorderLayout.NORTH);
		this.add(p2,BorderLayout.CENTER);
		this.add(p3,BorderLayout.SOUTH);


		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);

		this.pack();
	}
	public void actionPerformed(ActionEvent evt)
	{
		if(evt.getSource()==b5)
		{
			t1.setText("");
			t2.setText("");
			t3.setText("");
			t1.requestFocus();
		}
		else if(evt.getSource()==b6)
		{
			System.exit(0);
		}
		else
		{
			double x = Double.parseDouble(t1.getText());
			double y = Double.parseDouble(t2.getText());
			if(evt.getSource()==b1)
			{
				t3.setText("Sum = "+String.format("%.3f",(x+y)));
			}
			else if(evt.getSource()==b2)
			{
				t3.setText("Sub = "+String.format("%.3f",(x-y)));
			}
			else if(evt.getSource()==b3)
			{
				t3.setText("Mul = "+String.format("%.3f",(x*y)));
			}
			else if(evt.getSource()==b4)
			{
				t3.setText("Div = "+String.format("%.3f",(x/y)));
			}
		}
	}
}


class FrameTest14
{
	public static void main(String args[])
	{
		SimpleCalculator f = new SimpleCalculator();
		f.setTitle("SimpleCalculator");
		f.setLocation(200,200);
		f.setResizable(false);
		f.setVisible(true);
	}
}