package Demo;

import javax.swing.*;
import javax.swing.event.ListDataListener;
import java.awt.*;

/**
 * Created by #money on 7/8/2016.
 */
public class Demo implements ListModel {

    public static void main(String[] args) {

        Abcd.read();
        JFrame frame = new JFrame("Login");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        SignUpForm signUpForm = new SignUpForm();
        frame.setContentPane(signUpForm.mainPanel);


        frame.pack();
        frame.setVisible(true);

        signUpForm.list1.setModel(new Demo());

        }

    @Override
    public int getSize() {
        return 5;
    }

    @Override
    public String getElementAt(int index) {
        String[] items = { "item1","item2","item3","item4","item5"};;
        return items[index];
    }

    @Override
    public void addListDataListener(ListDataListener l) {

    }

    @Override
    public void removeListDataListener(ListDataListener l) {

    }
}
