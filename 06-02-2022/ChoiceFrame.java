import java.awt.*;
import java.awt.event.*;
public class ChoiceFrame extends Frame implements ItemListener{
	private Choice food;
	public static void main(String[] args)
	{
		ChoiceFrame f=new ChoiceFrame();
		Toolkit tk=f.getToolkit();
		Dimension dm=tk.getScreenSize();
		int width=(int)dm.getWidth();
		int height=(int)dm.getHeight();
		f.setSize(width,height);
		f.setTitle("a choice frame:");
        f.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
		    f.setFont(new Font("Aries",Font.BOLD,30));
                f.setLayout(new FlowLayout());
                f.setVisible(true);
 
	}
	public void  itemStateChanged(ItemEvent ie)
	{
		repaint();
	}
	public void paint(Graphics g)
	{
		String message="You have selected:";
		message+=food.getSelectedItem();
		g.drawString(message,600,400);
	}
	public ChoiceFrame()
	{
		food=new Choice();
		food.add("Cheese");
		food.add("Butter");
		food.add("Chocolate");
		food.add("Ice-Cream");
		food.add("SandWich");
		this.add(new Label("Food Items: ",Label.RIGHT));
		this.add(food);
		food.addItemListener(this);
 
	}
}