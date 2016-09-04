import javax.swing.*;

/**
 * Created by #money on 7/10/2016.
 */
public class Demo {

    public static void main(String[] args) {
        JFrame frame = new JFrame("MILK ORDERING SYSTEM");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        OrderingSystems os = new OrderingSystems();
        frame.setContentPane(os.panel);
        frame.pack();
        frame.setVisible(true);

    }
}
