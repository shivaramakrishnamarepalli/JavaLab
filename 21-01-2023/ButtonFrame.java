import java.awt.*;
import java.awt.event.*;

public class ButtonFrame extends Frame implements ActionListener{

    private Button green,yellow;

    public ButtonFrame()
    {
        green = new Button("Green");
        yellow = new Button("Yellow");
        this.add(green);
        this.add(yellow);
        green.addActionListener(this);
        yellow.addActionListener(this);
    }

    public static void main(String[] args)
    {
        ButtonFrame f = new ButtonFrame();
        f.setTitle("A Button Frame");
        Toolkit tk = f.getToolkit();
        Dimension dm = tk.getScreenSize();
        int width = (int)dm.getWidth();
        int height = (int)dm.getHeight();
        f.setSize(width,height);

        f.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });

        f.setLayout(new FlowLayout());
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        String s = e.getActionCommand();
        if(s.equals("Green")){
            this.setBackground(Color.green);
        }

        if(s.equals("Yellow")){
            this.setBackground(Color.yellow);
        }
        
    }
}