import javax.swing.JFrame;

class MyFrame extends JFrame
{
	public MyFrame()
	{
		setTitle("WordPad");
		setSize(500,500);

		setVisible(true);
	}

	public static void main(String args[])
	{
		new MyFrame(); // anonymous obj
	}
}