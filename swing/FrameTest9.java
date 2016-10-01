import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.border.*;

class ListFrame extends JFrame implements ActionListener, ListSelectionListener
{
	JList list;
	JButton show;
	JTextField t1;
	String[] courses = {"C","C++","Java","PHP","Android","Python","C#.Net","Ruby","Oracle DBA","Computer Architecture","Operating System","Data Structures"};

	ListFrame()
	{
		this.setTitle("ListFrame");
		FlowLayout layout = new FlowLayout();
		this.setLayout(layout);

		list = new JList(courses);
		list.setVisibleRowCount(6);
		//list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

		t1 = new JTextField(50);
		show = new JButton("Show");

		JScrollPane jsp = new JScrollPane(list);
		this.add(jsp);
		this.add(show);
		this.add(t1);

		Font f = new Font("Serif",Font.BOLD,16);
		list.setFont(f);t1.setFont(f);show.setFont(f);


		show.addActionListener(this);
		list.addListSelectionListener(this);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(800,600);
		this.setLocationRelativeTo(null);
	}

	public void actionPerformed(ActionEvent evt)
	{
		if(evt.getSource()==show)
		{
			//int i = list.getSelectedIndex();
			//Object o = list.getSelectedValue();
			//int arr[] = list.getSelectedIndices();
			Object[] items = list.getSelectedValues();
			String str = "";
			for(Object o : items)
			{
				str += o+",";
			}

			JOptionPane.showMessageDialog(this,str);
		}
	}

	public void valueChanged(ListSelectionEvent evt)
	{
			Object[] items = list.getSelectedValues();
			String str = "";
			for(Object o : items)
			{
				str += o+",";
			}
			t1.setText(str);
	}

}


class FrameTest9
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
		ListFrame f = new ListFrame();
		f.setVisible(true);
	}
}