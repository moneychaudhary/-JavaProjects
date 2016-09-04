import sun.security.util.Password;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

/**
 * Created by #money on 7/9/2016.
 */
public class Demo implements ActionListener {
    private static Login login;
    private Connection connection;
    private Statement statement;

    public static void main(String[] args) {

        JFrame frame = new JFrame("Login Form");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        login = new Login();

        frame.setContentPane(login.panel1);
        login.submitButton.addActionListener(new Demo());

        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == login.submitButton) {
            try {
                Class.forName("org.sqlite.JDBC");
            } catch (ClassNotFoundException e1) {
                System.out.println("JDBC doesnt exsist");
            }


            String data = login.userNameField.getText();
            try {
                connection = DriverManager.getConnection("jdbc:sqlite:src/database.sqlite");
                statement = connection.createStatement();


                String name = login.userNameField.getText();
                String password = login.passwordField.getText();
                String sql = "INSERT INTO LOGIN (USERNAME,PASSWORD) VALUES (" + name + ',' + password + ')';


                statement.execute(sql);

            } catch (SQLException e1) {
                e1.printStackTrace();
            }


        }

    }
}
