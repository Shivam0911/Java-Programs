import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

class ComboBoxFrame extends JFrame implements ActionListener, ItemListener
{
	JLabel l1,l2;
	JComboBox cb1,cb2;
	JButton show;
	String[] courses = {"C","C++","Java","PHP","Android","Python","C#.Net","Ruby"};

	ComboBoxFrame()
	{
		this.setTitle("ComboBoxFrame");
		FlowLayout layout = new FlowLayout();
		this.setLayout(layout);

		l1 = new JLabel("Course : ");
		l2 = new JLabel("Topics : ");

		cb1 = new JComboBox(courses);
		cb1.setSelectedIndex(-1);

		cb2 = new JComboBox();
		cb2.addItem("Select a Topic");

		show = new JButton("Show");

		this.add(l1);
		this.add(cb1);
		this.add(l2);
		this.add(cb2);
		this.add(show);

		Font f = new Font("Serif",Font.BOLD,16);
		cb1.setFont(f);cb2.setFont(f);show.setFont(f);


		show.addActionListener(this);
		cb1.addItemListener(this);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(800,600);
		this.setLocationRelativeTo(null);
	}

	public void actionPerformed(ActionEvent evt)
	{
		if(evt.getSource()==show)
		{
			int i = cb1.getSelectedIndex();
			Object o = cb1.getSelectedItem();

			JOptionPane.showMessageDialog(this,o.toString());
		}
	}

	public void itemStateChanged(ItemEvent evt)
	{
		String str = cb1.getSelectedItem().toString();
		cb2.removeAllItems();
		cb2.addItem("Select a Topic");
		if(str.equals("Java"))
		{
			cb2.addItem("Core Java");
			cb2.addItem("Advance Java");
			cb2.addItem("J2EE");
		}
		else if(str.equals("Android"))
		{
			cb2.addItem("Activity");
			cb2.addItem("Fragments");
			cb2.addItem("Services");
		}
	}
}


class FrameTest8
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
		ComboBoxFrame f = new ComboBoxFrame();
		f.setVisible(true);
	}
}