import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class DialogFrame extends JFrame implements ActionListener
{
	JButton b1,b2,b3,b4,b5,b6,b7;
	Runtime r;

	DialogFrame()
	{
		this.setTitle("DialogFrame");
		FlowLayout layout = new FlowLayout();
		this.setLayout(layout);

		r  = Runtime.getRuntime();

		b1 = new JButton("Message Dialog");
		b2 = new JButton("Confirm Dialog");
		b3 = new JButton("Input Dialog");
		b4 = new JButton("Color Dialog");
		b5 = new JButton("Custom Dialog");			//Digital Clock
		b6 = new JButton("Basic Calculator");
		b7 = new JButton("OS Command");

		this.add(b1);this.add(b2);this.add(b3);this.add(b4);this.add(b5);
		this.add(b6);this.add(b7);

		Font f = new Font("Serif",Font.BOLD,16);
		b1.setFont(f);b2.setFont(f);b3.setFont(f);b4.setFont(f);b5.setFont(f);b6.setFont(f);b7.setFont(f);


		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(800,600);
		this.setLocationRelativeTo(null);
	}

	public void actionPerformed(ActionEvent evt)
	{
		if(evt.getSource()==b1)
		{
			//JOptionPane.showMessageDialog(this,"Hello Friends!\nWelcome to SWING Dialogs.");
			//JOptionPane.showMessageDialog(null,"Hello Friends!\nWelcome to SWING Dialogs.");
			//JOptionPane.showMessageDialog(this,"Battery Low.\nPlease Connect to the Charger.","Warning",JOptionPane.PLAIN_MESSAGE);
			ImageIcon icon = new ImageIcon("cut.gif");
			JOptionPane.showMessageDialog(this,"Battery Low.\nPlease Connect to the Charger.","Warning",JOptionPane.PLAIN_MESSAGE,icon);
		}
		else if(evt.getSource()==b2)
		{
			//JOptionPane.showConfirmDialog(this,"Do you wish to close the Program?");
			int x = JOptionPane.showConfirmDialog(this,"Do you wish to close the Program?","Confirm",JOptionPane.YES_NO_OPTION);
			if(x == JOptionPane.YES_OPTION)
			{
				//System.exit(0);
				dispose();
			}
		}
		else if(evt.getSource()==b3)
		{
			String str = JOptionPane.showInputDialog(this,"Enter your name : ");
			if(str != null)
			{
				this.setTitle(str);
			}
		}
		else if(evt.getSource()==b4)
		{
			JColorChooser jc = new JColorChooser();
			Color c = jc.showDialog(this,"Pick a Color",Color.WHITE);
			if(c != null)
			{
				this.getContentPane().setBackground(c);
			}
		}
		else if(evt.getSource()==b5)
		{
			ClockDialog d = new ClockDialog(this);
			d.setVisible(true);
		}
		else if(evt.getSource()==b6)
		{
			CalculatorFrame f = new CalculatorFrame();
			f.setLocationRelativeTo(this);
			f.setVisible(true);
		}
		else if(evt.getSource()==b7)
		{
			try
			{
				String str = JOptionPane.showInputDialog(this,"Enter a command : ");
				if(str != null){
					r.exec(str);
				}
			}
			catch(Exception ex){
				JOptionPane.showMessageDialog(this,"Not a Valid Command.","Error",JOptionPane.ERROR_MESSAGE);
			}
		}
	}
}


class FrameTest4
{
	public static void main(String args[])
	{
       try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {

        }
		DialogFrame f = new DialogFrame();
		f.setVisible(true);
	}
}