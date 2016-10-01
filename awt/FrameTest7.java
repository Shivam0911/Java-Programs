import java.awt.*;

class NullLayoutFrame extends Frame
{
	Button b1,b2,b3,b4,b5;

	public NullLayoutFrame()
	{
		this.setLayout(null);

		b1 = new Button("Button : 1");
		b2 = new Button("Button : 2");
		b3 = new Button("Button : 3");
		b4 = new Button("Button : 4");
		b5 = new Button("Button : 5");

		//b1.setLocation(100,100);
		//b1.setSize(80,30);
		b1.setBounds(100,100,180,30);
		b2.setBounds(150,150,80,30);
		b3.setBounds(200,200,80,30);
		b4.setBounds(250,250,80,30);
		b5.setBounds(300,300,80,30);

		this.add(b1);
		this.add(b2);
		this.add(b3);
		this.add(b4);
		this.add(b5);
	}
}

class FrameTest7
{
	public static void main(String args[])
	{
		NullLayoutFrame f = new NullLayoutFrame();
		f.setTitle("NullLayoutFrame");
		f.setLocation(200,200);
		f.setSize(600,400);
		f.setVisible(true);
	}
}