import java.awt.*;
class First extends Frame
{
	First()
	{
		Button b = new Button ("Click me");
		b.setBounds (30, 100, 80, 30); // Setting button Position
		add (b); // adding button into Frame
		setSize(300, 300); // Frame Size 300 width and 300 height
		setLayout(null); // no layout manager
		setVisible(true); // now frame will be visible, bu default not visible
	}
	public static void main (String args[])
	{
		First f = new First();
	}
}