import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

class RadioButtonFrame extends JFrame implements ActionListener
{
	JRadioButton b1,b2,b3,b4,b5;	//setSelected, isSelected
	ButtonGroup g1,g2;				//Logical
	JButton show;
	JPanel p1,p2;

	RadioButtonFrame()
	{
		this.setTitle("RadioButtonFrame");
		FlowLayout layout = new FlowLayout();
		this.setLayout(layout);

		b1 = new JRadioButton("Male",true);
		b2 = new JRadioButton("Female");
		b3 = new JRadioButton("Under-Graduate");
		b4 = new JRadioButton("Graduate",true);
		b5 = new JRadioButton("Post-Graduate");

		g1 = new ButtonGroup();g1.add(b1);g1.add(b2);
		g2 = new ButtonGroup();g2.add(b3);g2.add(b4);g2.add(b5);

		show = new JButton("Show");
		p1 = new JPanel();
		p2 = new JPanel();

		//p1.setBorder(BorderFactory.createLineBorder(Color.BLUE,2));
		//p1.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		p1.setBorder(BorderFactory.createTitledBorder("Select Gender : "));
		p2.setBorder(BorderFactory.createTitledBorder("Select Qualification : "));


		p1.add(b1);p1.add(b2);
		p2.add(b3);p2.add(b4);p2.add(b5);
		this.add(p1);this.add(p2); this.add(show);

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
			String gender, qual;
			if(b1.isSelected())
				gender = b1.getText();
			else
				gender = b2.getText();

			if(b3.isSelected())
				qual = b3.getText();
			else if(b4.isSelected())
				qual = b4.getText();
			else
				qual = b5.getText();
			JOptionPane.showMessageDialog(this,gender+"\n"+qual);
		}
		if(evt.getSource()==b5)
		{
			JOptionPane.showMessageDialog(this,"Hello");
		}
	}
}


class FrameTest6
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
		RadioButtonFrame f = new RadioButtonFrame();
		f.setVisible(true);
	}
}