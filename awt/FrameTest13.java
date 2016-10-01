import java.awt.*;
import java.awt.event.*;

class FactorialCalculator extends Frame implements ActionListener
{
	Button b1,b2,b3;
	Label l1,l2;
	TextField t1,t2;
	Panel p1,p2;

	public FactorialCalculator()
	{
		Font f = new Font("Serif",Font.PLAIN,18);

		b1 = new Button("Factorial");b1.setFont(f);
		b2 = new Button("Reset");b2.setFont(f);
		b3 = new Button("Close");b3.setFont(f);

		l1 = new Label("Number : ");l1.setFont(f);
		l2 = new Label("Factorial : ");l2.setFont(f);

		t1 = new TextField(15);t1.setFont(f);
		t2 = new TextField(15);t2.setEditable(false);t2.setFont(f);

		p1 = new Panel();
		p1.setLayout(new GridLayout(2,2));
		p1.add(l1);p1.add(t1);
		p1.add(l2);p1.add(t2);

		p2 = new Panel();
		p2.add(b1);p2.add(b2);p2.add(b3);

		this.add(p1,BorderLayout.CENTER);
		this.add(p2,BorderLayout.SOUTH);


		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);

		this.pack();
	}
	public void actionPerformed(ActionEvent evt)
	{
		if(evt.getSource()==b1)
		{
			int n = Integer.parseInt(t1.getText());
			int f = 1;
			while(n>0)
			{
				f = f * n--;
			}
			//t2.setText(String.valueOf(f));
			t2.setText(""+f);
		}
		else if(evt.getSource()==b2)
		{
			t1.setText("");
			t2.setText("");
		}
		else if(evt.getSource()==b3)
		{
			System.exit(0);
		}
	}
}


class FrameTest13
{
	public static void main(String args[])
	{
		FactorialCalculator f = new FactorialCalculator();
		f.setTitle("FactorialCalculator");
		f.setLocation(200,200);
		f.setResizable(false);
		f.setVisible(true);
	}
}