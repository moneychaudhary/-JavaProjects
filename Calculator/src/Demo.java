import javax.swing.*;

/**
 * Created by #money on 7/11/2016.
 */
public class Demo {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Calculator calculator = new Calculator();

        frame.setContentPane(calculator.calculatorView);

        frame.pack();
        frame.setVisible(true);
    }
}
