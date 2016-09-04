import sun.plugin.dom.core.Text;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

/**
 * Created by #money on 7/7/2016.
 */
public class Abcd implements ActionListener {
    private static JButton submitbutton;
    private static JButton updateButton;
    private static JTextField taskField;
    private static JTextField done;
    private static String task;
    private static String completition;

    public static void main(String[] args) {


        Abcd abcd = new Abcd();
        JFrame frame = new JFrame("To Do List");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(300, 300);

        JPanel panel = new JPanel();
        panel.setSize(300, 300);
        panel.setLayout(new FlowLayout(FlowLayout.LEFT));

        frame.setContentPane(panel);

        taskField = new JTextField("Task", 20);

        panel.add(taskField);

        done = new JTextField("Done");
        panel.add(done);

        submitbutton = new JButton("SUBMIT");
        panel.add(submitbutton);

        submitbutton.addActionListener(abcd);

        updateButton = new JButton("UPDATE");
        panel.add(updateButton);

        updateButton.addActionListener(abcd);

        task = taskField.getText();

        completition = done.getText();


        frame.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.submitbutton) {
            try {
                Class.forName("org.sqlite.JDBC");
            } catch (ClassNotFoundException x) {
                System.out.println("JDBC doesnt exit");
            }

            try {
                Connection connection = DriverManager.getConnection("jdbc:sqlite:src/database.sqlite");
                Statement statement = connection.createStatement();
                statement.execute("INSERT INTO toDOList (TASK,DONE) VALUES (task,completion)");

            } catch (SQLException x) {
                x.printStackTrace();
            }
//        } else if (e.getSource() == this.updateButton) {
//            try {
//                Class.forName("org.sqlite.JDBC");
//            } catch (ClassNotFoundException x) {
//                System.out.println("JDBC doesnt exit");
//            }
//
//            try {
//                Connection connection = DriverManager.getConnection("jdbc:sqlite:src/database.sqlite");
//                Statement statement = connection.createStatement();
//                statement.executeQuery("UPD INTO toDOList " +
//                        "(TASK,DONE) " +
//                        "VALUES ()");
//
//            } catch (SQLException x) {
//                x.printStackTrace();
//            }

        }
    }
}
