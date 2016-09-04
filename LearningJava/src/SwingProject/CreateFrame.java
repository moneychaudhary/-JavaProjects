package SwingProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.jar.JarEntry;

/**
 * Created by money on 23/6/16.
 */
public class CreateFrame  extends JFrame implements ActionListener{
//    private    JButton one;
//    private    JButton two;
//    private    JButton three;
//    private    JButton four;
    private  JButton submit;
    private  JTextField text;
    private  JLabel label;
    private  JPanel panel1;
//    public int val1;
//    public int val2;
//    public int val3;



    public CreateFrame()
    {

        super();
        this.setSize(400,400);
        this.setBackground(Color.cyan);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        panel1 = new JPanel();
        this.setContentPane(panel1);

//        this.one  = new JButton("1");
//        this.two  = new JButton("2");
//        this.three  = new JButton("3");
//        this.four  = new JButton("4");
        this.label = new JLabel("Enter number ");
        this.text = new JTextField(15);


        this.submit = new JButton("Submit");



//        this.one.addActionListener(this);
//        this.two.addActionListener(this);
//        this.three.addActionListener(this);
//        this.four.addActionListener(this);
        this.submit.addActionListener(this);



//
//        panel1.add(one);
//        panel1.add(two);
//        panel1.add(three);
//        panel1.add(four);
        panel1.add(label);
            panel1.add(text);

        panel1.add(submit);



    }


    @Override
    public void actionPerformed(ActionEvent e) {
       String s= this.text.getText();
        if (s.isEmpty())
        {
            System.out.println("Enter Some value");
        }
        else {
            int num = Integer.parseInt(s);
            for (int i = 0; i < num; i++) {
                CreateFrame frame = new CreateFrame();
                frame.setVisible(true);
            }
        }


    }
}
