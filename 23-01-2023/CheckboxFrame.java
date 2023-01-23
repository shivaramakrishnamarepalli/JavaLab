import java.awt.*;
import java.awt.event.*;

public class CheckboxFrame extends Frame implements ItemListener
{
    private Checkbox cake,chocolate,icecream;
    public CheckboxFrame()
    {
        cake = new Checkbox("Butter");
        chocolate = new Checkbox("Chocolate");
        icecream = new Checkbox("IceCream");
        this.add(cake);
        this.add(chocolate);
        this.add(icecream);
        icecream.addItemListener(this);
        chocolate.addItemListener(this);
        cake.addItemListener(this);
    }

    public static void main(String[] args)
    {
        CheckboxFrame f = new CheckboxFrame();
        f.setTitle("Checkbox Frame");
        Toolkit tk = f.getToolkit();
        Dimension dim = tk.getScreenSize();
        int height = (int)dim.getHeight();
        int width = (int)dim.getWidth();
        f.setSize(width,height);
        f.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });
        f.setLayout(new FlowLayout());
        f.setVisible(true);
    }
    public void itemStateChanged(ItemEvent ie)
    {
        repaint();
    }
    public void paint(Graphics g)
    {
        String message = "You have chosen : ";
        if(cake.getState()) message+=" cake ";
        if(chocolate.getState()) message+=" chocolate ";
        if(icecream.getState()) message+=" IceCream ";
        g.drawString(message, 600,400);
    }
}