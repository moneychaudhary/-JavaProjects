import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by money on 22/6/16.
 */
public class Jlabel  implements ActionListener{
    public   JButton changeColor;
    public   JButton duplicate;
    public   JLabel label1;

    public static void main(String[] args) {

       createWindow();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

            if (e.getSource() == this.changeColor){
                if ( this.label1.getForeground() == Color.RED)
                this.label1.setForeground(Color.YELLOW);
                else
                this.label1.setForeground(Color.RED);

            }

            else if (e.getSource() == this.duplicate) {
                createWindow();
            }
    }



    public static void createWindow()
    {

        Jlabel obj = new Jlabel();
        JFrame frame1 = new JFrame();
        frame1.setSize(400,600);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel  panel1 = new JPanel();
        frame1.setContentPane(panel1);

        obj.changeColor= new JButton("Change Color");
        obj.duplicate = new JButton("Duplicate");

        obj.label1 = new JLabel("Click");
        obj.label1.setForeground(Color.YELLOW);



            obj.changeColor.addActionListener( obj);
            obj.duplicate.addActionListener(obj);
            panel1.add(obj.label1);
            panel1.add(obj.duplicate);
            panel1.add(obj.changeColor);
            frame1.setVisible(true);

    }
}
