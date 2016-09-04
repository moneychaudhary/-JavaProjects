import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Arc2D;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

/**
 * Created by #money on 7/11/2016.
 */
public class OrderingSystems {
    public JPanel panel;
    private JLabel heading;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JLabel customerName;
    private JTextField nameField;
    private JTextField mobileField;
    private JTextField dateField;
    private JTextField timeField;
    private JLabel date;
    private JLabel time;
    private JLabel mobile;
    private JLabel itemTypeLabel;
    private JLabel quantityLabel;
    private JLabel unitPriceLabel;
    private JLabel subTotalLabel;
    private JTextField qtyField1;
    private JTextField qtyField2;
    private JTextField qtyField3;
    private JTextField qtyField4;
    private JTextField qtyField5;
    private JTextField qtyField6;
    private JTextField price1;
    private JTextField price2;
    private JTextField price3;
    private JTextField price4;
    private JTextField price5;
    private JTextField price6;
    private JTextField total1;
    private JTextField total2;
    private JTextField total3;
    private JTextField total4;
    private JTextField total5;
    private JTextField total6;
    private JTextField totalField;
    private JTextField taxPaidField;
    private JTextField netPriceField;
    private JLabel amulFullCreamLabel1;
    private JLabel amulTodLabel1;
    private JLabel amulDoubleTodLabel1;
    private JLabel amulFullCreamLabel2;
    private JLabel amulTodLabel2;
    private JLabel amulDoubleTodLabel2;
    private JLabel netPriceLabel;
    private JLabel taxPaidLabel;
    private JLabel totalLabel;
    private JButton calculateButton;
    private JButton resetButton;
    private JButton printButton;
    private JButton exitButton;


    public OrderingSystems() {
        calculateButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

            }
        });
        resetButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

            }
        });

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Connection connection = null;
                Statement statement = null;
                ResultSet rs = null;
                double fullCreamHalfPrice = 0;
                double fullCreamFullPrice = 0;
                double todHalfPrice = 0;
                double todFullPrice = 0;
                double doubleTodHalfPrice = 0;
                double doubleTodFullPrice = 0;
                double tax = 0;

                try {
                    Class.forName("org.sqlite.JDBC");
                } catch (ClassNotFoundException e1) {
                    JOptionPane.showMessageDialog(panel, "JDBC not Found");
                }

                try {
                    connection = DriverManager.getConnection("jdbc:sqlite:src/milkorderingsystemdb.sqlite");
                    statement = connection.createStatement();
                    rs = statement.executeQuery("SELECT * FROM rates WHERE rowid=1");
                    fullCreamHalfPrice = rs.getInt("price");
                    rs = statement.executeQuery("SELECT * FROM rates WHERE rowid=2");
                    fullCreamFullPrice = rs.getInt("price");
                    rs = statement.executeQuery("SELECT * FROM rates WHERE rowid=3");
                    todFullPrice = rs.getInt("price");
                    rs = statement.executeQuery("SELECT * FROM rates WHERE rowid=4");
                    todHalfPrice = rs.getInt("price");
                    rs = statement.executeQuery("SELECT * FROM rates WHERE rowid=5");
                    doubleTodFullPrice = rs.getInt("price");
                    rs = statement.executeQuery("SELECT * FROM rates WHERE rowid=6");
                    doubleTodHalfPrice = rs.getInt("price");
                    rs = statement.executeQuery("SELECT * FROM rates ");
                    tax = rs.getInt("tax");

                } catch (SQLException e1) {

                }


                double quantity1, quantity2, quantity3, quantity4, quantity5, quantity6;

                if (qtyField1.getText().isEmpty()) {
                    quantity1 = 0;
                    qtyField1.setText("0");
                } else
                    quantity1 = Double.parseDouble(qtyField1.getText());


                if (qtyField2.getText().isEmpty()) {
                    quantity2 = 0;
                    qtyField2.setText("0");
                } else
                    quantity2 = Double.parseDouble(qtyField2.getText());

                if (qtyField3.getText().isEmpty()) {
                    quantity3 = 0;
                    qtyField3.setText("0");
                } else
                    quantity3 = Double.parseDouble(qtyField3.getText());

                if (qtyField4.getText().isEmpty()) {
                    quantity4 = 0;
                    qtyField4.setText("0");
                } else
                    quantity4 = Double.parseDouble(qtyField4.getText());

                if (qtyField5.getText().isEmpty()) {
                    quantity5 = 0;
                    qtyField5.setText("0");
                } else
                    quantity5 = Double.parseDouble(qtyField5.getText());

                if (qtyField6.getText().isEmpty()) {
                    quantity6 = 0;
                    qtyField6.setText("0");
                } else
                    quantity6 = Double.parseDouble(qtyField6.getText());

                price1.setText(String.format("$%.2f", fullCreamHalfPrice));
                price2.setText(String.format("$%.2f", todHalfPrice));
                price3.setText(String.format("$%.2f", doubleTodHalfPrice));
                price4.setText(String.format("$%.2f", fullCreamFullPrice));
                price5.setText(String.format("$%.2f", todFullPrice));
                price6.setText(String.format("$%.2f", doubleTodFullPrice));

                double subTotal1 = quantity1 * fullCreamHalfPrice;
                double subTotal2 = quantity2 * todHalfPrice;
                double subTotal3 = quantity3 * doubleTodHalfPrice;
                double subTotal4 = quantity4 * fullCreamFullPrice;
                double subTotal5 = quantity5 * todFullPrice;
                double subTotal6 = quantity6 * doubleTodFullPrice;

                total1.setText(String.format("$%.2f", subTotal1));
                total2.setText(String.format("$%.2f", subTotal2));
                total3.setText(String.format("$%.2f", subTotal3));
                total4.setText(String.format("$%.2f", subTotal4));
                total5.setText(String.format("$%.2f", subTotal5));
                total6.setText(String.format("$%.2f", subTotal6));

                double totalPrice = subTotal1 + subTotal2 + subTotal3 + subTotal4 + subTotal5 + subTotal6;
                double taxPaid = (totalPrice * tax) / 100;
                double totalAmount = totalPrice + taxPaid;

                totalField.setText(String.format("$%.2f", totalPrice));
                taxPaidField.setText(String.format("$%.2f", taxPaid));
                netPriceField.setText(String.format("$%.2f", totalAmount));

                Calendar timer = Calendar.getInstance();
                SimpleDateFormat tTime = new SimpleDateFormat("HH:mm:ss");
                timeField.setText(tTime.format(timer.getTime()));

                SimpleDateFormat tDate = new SimpleDateFormat("dd-MM-YYYY");
                dateField.setText(tDate.format(timer.getTime()));


            }
        });
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                timeField.setText(null);
                dateField.setText(null);
                nameField.setText(null);
                mobileField.setText(null);


                qtyField1.setText(null);
                qtyField2.setText(null);
                qtyField3.setText(null);
                qtyField4.setText(null);
                qtyField5.setText(null);
                qtyField6.setText(null);

                price1.setText(null);
                price2.setText(null);
                price3.setText(null);
                price4.setText(null);
                price5.setText(null);
                price6.setText(null);

                total1.setText(null);
                total2.setText(null);
                total3.setText(null);
                total4.setText(null);
                total5.setText(null);
                total6.setText(null);

                totalField.setText(null);
                taxPaidField.setText(null);
                netPriceField.setText(null);
            }
        });
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
}
