import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class NewJFrame extends JFrame implements ActionListener {

    public static int count=0;

    private    JButton changeColorButton;
    private    JButton duplicateButton;
    private    JLabel textLabel;
    private List<NewJFrame> childWindows;
    private int number;


    public void changeColor (Color color)
    {

        for(int i = 0; i< this.childWindows.size();i++)
        {
            this.childWindows.get(i).changeColor(color);
        }
        this.textLabel.setForeground(color);
        System.out.println("Color of window number "+this.number+  "changed");
    }


    public NewJFrame()
    {
        super();

        NewJFrame.count++;
        this.number=NewJFrame.count;
        this.setTitle("Window"+this.number);

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JPanel panel1= new JPanel();
        this.setContentPane(panel1);
        this.textLabel=new JLabel("Hello World");

        this.changeColorButton= new JButton("Change Color");
        this.changeColorButton.addActionListener(this);
        this.textLabel.setForeground(Color.red);

        this.duplicateButton = new JButton("Duplicate Window");
        this.duplicateButton.addActionListener(this);
        panel1.add(textLabel);
        panel1.add(duplicateButton);
        panel1.add(changeColorButton);

        this.childWindows=new ArrayList<>();

        this.setSize(200,200);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==this.changeColorButton)
        {
            if(this.textLabel.getForeground()==Color.RED)
                    this.changeColor(Color.yellow);
            else
                this.changeColor(Color.RED);
        }
        else
        {
            NewJFrame frame1 =  new NewJFrame();
            this.childWindows.add(frame1);
            frame1.setVisible(true);
        }
    }

}
