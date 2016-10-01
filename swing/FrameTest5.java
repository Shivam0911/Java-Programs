import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Date;
import java.text.SimpleDateFormat;

class ClockFrame extends JFrame implements ActionListener
{
	JLabel l1;
	SimpleDateFormat fmt;
	Timer tr;							//start, stop

	ClockFrame()
	{
		FlowLayout layout = new FlowLayout();
		this.setLayout(layout);

		//fmt = new SimpleDateFormat("dd-MMMM-yyyy hh:mm:ss a");			//Specify a format
		fmt = new SimpleDateFormat("hh:mm:ss a");

		l1 = new JLabel("");
		Font f = new Font("Serif",Font.BOLD,24);
		l1.setFont(f);

		tr = new Timer(1000,this);				//Non-Visual Component - No Look
		tr.start();

		this.add(l1);

		updateTime();

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void updateTime()
	{
		Date d = new Date();				//Current Date & Time
		//String str = d.toString();
		String str = fmt.format(d);
		l1.setText(str);
	}

	public void actionPerformed(ActionEvent evt)
	{
		if(evt.getSource()==tr)
		{
			updateTime();
		}
	}
}


class FrameTest5
{
	public static void main(String args[])
	{
		ClockFrame f = new ClockFrame();
		f.setTitle("ClockFrame");
		f.setSize(600,400);
		f.setLocationRelativeTo(null);
		f.setVisible(true);
	}
}