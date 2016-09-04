import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Arc2D;

/**
 * Created by #money on 7/11/2016.
 */
public class Calculator {
    private JTextField results;
    private JButton divideButton;
    private JButton btn7;
    private JButton btn8;
    private JButton btn9;
    private JButton multiplicationButton;
    private JButton btn4;
    private JButton btn5;
    private JButton btn6;
    private JButton minusButton;
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JButton addButton;
    private JButton btn0;
    private JButton dotButton;
    private JButton equalButton;
    public JPanel calculatorView;
    private JButton clearButton;
    private JButton backButton;
    private JButton percentButton;
    private JButton signButton;

    private  double firstNum;
    private  double secondNum;
    private  double result;
    private String operations;


    public Calculator() {
        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String element = results.getText() + btn7.getText();
                results.setText(element);

            }
        });
        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String element = results.getText() + btn8.getText();
                results.setText(element);

            }
        });
        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String element = results.getText() + btn9.getText();
                results.setText(element);
            }
        });
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String element = results.getText() + btn4.getText();
                results.setText(element);
            }
        });
        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String element = results.getText() + btn5.getText();
                results.setText(element);
            }
        });
        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String element = results.getText() + btn6.getText();
                results.setText(element);
            }
        });
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String element = results.getText() + btn1.getText();
                results.setText(element);
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String element = results.getText() + btn2.getText();
                results.setText(element);
            }
        });
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String element = results.getText() + btn3.getText();
                results.setText(element);
            }
        });
        btn0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String element = results.getText() + btn0.getText();
                results.setText(element);
            }
        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                results.setText(null);
            }
        });
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstNum = Double.parseDouble(results.getText());
                results.setText("");
                operations="+";
            }
        });
        minusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstNum = Double.parseDouble(results.getText());
                results.setText("");
                operations="-";
            }
        });
        multiplicationButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstNum = Double.parseDouble(results.getText());
                results.setText("");
                operations="*";
            }
        });
        divideButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstNum = Double.parseDouble(results.getText());
                results.setText("");
                operations="/";
            }
        });
        dotButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String element = results.getText() + dotButton.getText();
                results.setText(element);
            }
        });
        percentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstNum = Double.parseDouble(results.getText());
                results.setText("");
                operations="%";

            }
        });
        signButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double value = Double.parseDouble(String.valueOf(results.getText()));
                value=(-1)*value;
                results.setText(String.valueOf(value));
            }
        });
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String backspace=null;
                if(results.getText().length()>0)
                {
                    StringBuilder sb = new StringBuilder(results.getText());
                    sb.deleteCharAt(sb.length()-1);
                    backspace=sb.toString();
                    results.setText(backspace);
                }

            }
        });
        equalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ans;

                if (operations=="+") {
                    secondNum = Double.parseDouble(results.getText());
                    result = firstNum + secondNum;
                    ans=String.format("%.2f",result);
                    results.setText(ans);
                }
                else if (operations=="-") {
                    secondNum = Double.parseDouble(results.getText());
                    result = firstNum - secondNum;
                    ans=String.format("%.2f",result);
                    results.setText(ans);
                }
                else if (operations=="*") {
                    secondNum = Double.parseDouble(results.getText());
                    result = firstNum * secondNum;
                    ans=String.format("%.2f",result);
                    results.setText(ans);

                }
                else if (operations=="/") {
                    secondNum = Double.parseDouble(results.getText());
                    result = firstNum / secondNum;
                    ans=String.format("%.2f",result);
                    results.setText(ans);
                }
                else if (operations=="%") {
                    secondNum = Double.parseDouble(results.getText());
                    result = firstNum % secondNum;
                    ans=String.format("%.2f",result);
                    results.setText(ans);
                }


            }
        });
    }
}
