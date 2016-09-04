import javax.swing.*;

/**
 * Created by #money on 7/13/2016.
 */
public class Demo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("APP");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        App app = new App();
//        app.createUIComponents();

        frame.setContentPane(app.panel);

        frame.pack();
        frame.setVisible(true);
    }
}
