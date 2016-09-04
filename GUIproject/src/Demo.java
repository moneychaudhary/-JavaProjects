import javax.swing.*;
import java.awt.*;


public class Demo {

    public static final int WINDOW_HEIGHT=600;
    public static final int WINDOW_WITDH=600;

    public static void main(String[] args) {
        JFrame frame1= new JFrame("Application");
        frame1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame1.setSize(Demo.WINDOW_HEIGHT,Demo.WINDOW_WITDH);


        JPanel panel1= new JPanel();
        frame1.setContentPane(panel1);

        JTextField textField1=new JTextField();
        textField1.setText("UserName");
        panel1.add(textField1);

        JTextField textField2=new JTextField();
        textField2.setText("Password");
        panel1.add(textField2);

        JButton button1= new JButton();
        button1.setText("Login");
        panel1.add(button1);
        panel1.setBackground(Color.YELLOW);

        frame1.setVisible(true);


    }
}
