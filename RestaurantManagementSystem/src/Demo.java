import javax.swing.*;

/**
 * Created by #money on 7/11/2016.
 */
public class Demo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Restaurant Management");
        frame.setResizable(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Restaurant restaurant = new Restaurant();
        restaurant.createUIComponents();

        frame.setContentPane(restaurant.panel);
        frame.pack();
        frame.setVisible(true);


    }
}
