import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

class CheckBoxFrame extends JFrame implements ActionListener
{
	JCheckBox b1,b2,b3,b4,b5;
	JButton show;
	JPanel p1;

	CheckBoxFrame()
	{
		this.setTitle("CheckBoxFrame");
		FlowLayout layout = new FlowLayout();
		this.setLayout(layout);

		b1 = new JCheckBox("C");
		b2 = new JCheckBox("C++");
		b3 = new JCheckBox("Java");
		b4 = new JCheckBox("Python");
		b5 = new JCheckBox("PHP");

		show = new JButton("Show");
		p1 = new JPanel();
		p1.setBorder(BorderFactory.createTitledBorder("Select Languages : "));


		p1.add(b1);p1.add(b2);
		p1.add(b3);p1.add(b4);p1.add(b5);
		this.add(p1);this.add(show);

		Font f = new Font("Serif",Font.BOLD,16);
		b1.setFont(f);b2.setFont(f);b3.setFont(f);b4.setFont(f);b5.setFont(f);show.setFont(f);


		show.addActionListener(this);
		b5.addActionListener(this);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(800,600);
		this.setLocationRelativeTo(null);
	}

	public void actionPerformed(ActionEvent evt)
	{
		if(evt.getSource()==show)
		{
			String str = "";
			if(b1.isSelected())	str += b1.getText()+"\n";
			if(b2.isSelected())	str += b2.getText()+"\n";
			if(b3.isSelected())	str += b3.getText()+"\n";
			if(b4.isSelected())	str += b4.getText()+"\n";
			if(b5.isSelected())	str += b5.getText()+"\n";

			JOptionPane.showMessageDialog(this,str);
		}
		if(evt.getSource()==b5)
		{
			if(b5.isSelected())
				JOptionPane.showMessageDialog(this,"Hello");
			else
				JOptionPane.showMessageDialog(this,"Bye");
		}
	}
}


class FrameTest7
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
		CheckBoxFrame f = new CheckBoxFrame();
		f.setVisible(true);
	}
}