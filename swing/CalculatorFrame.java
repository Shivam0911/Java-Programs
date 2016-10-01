import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class CalculatorFrame extends JFrame implements ActionListener
{
	JButton b1,b2,b3,b4,b5,b6;
	JLabel l1,l2,l3,title;
	JTextField t1,t2,t3;
	JPanel p1,p2,p3;

	CalculatorFrame()
	{
		this.setTitle("CalculatorFrame");
		Font f = new Font("Serif",Font.PLAIN,18);

		b1 = new JButton("  +  ");b1.setFont(f);
		b2 = new JButton("  -  ");b2.setFont(f);
		b3 = new JButton("  *  ");b3.setFont(f);
		b4 = new JButton("  /  ");b4.setFont(f);
		b5 = new JButton("Reset");b5.setFont(f);
		b6 = new JButton("Close");b6.setFont(f);

		l1 = new JLabel("First Number : ");l1.setFont(f);
		l2 = new JLabel("Second Number : ");l2.setFont(f);
		l3 = new JLabel("Result : ");l3.setFont(f);
		title = new JLabel("Simple Calculator");title.setFont(new Font("Serif",Font.ITALIC,30));

		t1 = new JTextField(15);t1.setFont(f);
		t2 = new JTextField(15);t2.setFont(f);
		t3 = new JTextField(15);t3.setEditable(false);t3.setFont(f);


		p1 = new JPanel();
		p1.add(title);

		p2 = new JPanel();
		p2.setLayout(new GridLayout(3,2));
		p2.add(l1);p2.add(t1);
		p2.add(l2);p2.add(t2);
		p2.add(l3);p2.add(t3);

		p3 = new JPanel();
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
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		//this.setLocation(200,200);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
	}

	public void actionPerformed(ActionEvent evt)
	{
		if(evt.getSource()==b6)
		{
			dispose();
		}
		else if(evt.getSource()==b5)
		{
			t1.setText("");
			t2.setText("");
			t3.setText("");
			t1.requestFocus();
		}
		else
		{
			double x = Double.parseDouble(t1.getText());
			double y = Double.parseDouble(t2.getText());
			double r;
			if(evt.getSource()==b1)
			{
				r = x+y;
				String result = String.format("%.3f",r);
				t3.setText("Sum : "+result);
			}
			else if(evt.getSource()==b2)
			{
				r = x-y;
				t3.setText("Sub : "+String.format("%.3f",r));
			}
			else if(evt.getSource()==b3)
			{
				r = x*y;
				t3.setText("Mul : "+String.format("%.3f",r));
			}
			else if(evt.getSource()==b4)
			{
				r = x/y;
				t3.setText("Div : "+String.format("%.3f",r));
			}
		}
	}
}
