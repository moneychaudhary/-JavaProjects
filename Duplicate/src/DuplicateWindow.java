import com.sun.org.apache.xpath.internal.SourceTree;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by money on 21/6/16.
 */
public class DuplicateWindow implements ActionListener {
    public static final int WINDOW_HEIGHT = 600;
    public static final int WINDOW_WITDH = 600;
    public static  JButton duplicateButton;



    public static void main( String[] args) {
        DuplicateWindow.createWindow();
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == DuplicateWindow.duplicateButton)
        {
            for (int i =0 ; i<100; i++)
            {
                DuplicateWindow.createWindow();
            }
        }
    }

    public static void createWindow()
    {
        JFrame frame1 = new JFrame("Application");
        frame1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame1.setSize(DuplicateWindow.WINDOW_HEIGHT, DuplicateWindow.WINDOW_WITDH);


        JPanel panel1 = new JPanel();
        frame1.setContentPane(panel1);

        DuplicateWindow.duplicateButton = new JButton();
        duplicateButton.setText("Duplicate");
        DuplicateWindow.duplicateButton.addActionListener(new DuplicateWindow());
        panel1.add(DuplicateWindow.duplicateButton);


        panel1.setBackground(Color.LIGHT_GRAY);
        frame1.setVisible(true);
    }
}