import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Date;
import java.text.SimpleDateFormat;

class ClockDialog extends JDialog implements ActionListener
{
	JLabel l1;
	JButton b1;
	SimpleDateFormat fmt;
	Timer tr;

	ClockDialog(JFrame f)			//Modal(must be closed first) / Modeless(allow us to talk to parent window)
	{
		//super(f);
		super(f,true);				//true - makes it modal
		setTitle("Digital Clock");
		FlowLayout layout = new FlowLayout();
		this.setLayout(layout);

		fmt = new SimpleDateFormat("hh:mm:ss a");

		l1 = new JLabel(""); l1.setFont(new Font("Serif",Font.BOLD,24));
		b1 = new JButton("Close Dialog");
		tr = new Timer(1000,this);
		tr.start();

		this.add(l1);
		this.add(b1);
		b1.addActionListener(this);

		updateTime();

		this.setSize(200,130);
		this.setLocationRelativeTo(f);
	}

	public void updateTime()
	{
		Date d = new Date();
		String str = fmt.format(d);
		l1.setText(str);
	}

	public void actionPerformed(ActionEvent evt)
	{
		if(evt.getSource()==tr)
		{
			updateTime();
		}
		if(evt.getSource()==b1)
		{
			//System.exit(0);
			dispose();
		}
	}
}
