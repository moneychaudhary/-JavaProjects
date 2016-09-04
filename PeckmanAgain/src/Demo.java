import javax.swing.*;
import java.awt.*;

/**
 * Created by money on 27/6/16.
 */
public class Demo {


    public static void main(String[] args) throws InterruptedException {
        JFrame frame = new JFrame("PECKMAN ");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setResizable(false);

        JPanel panel = new JPanel();
        frame.setPreferredSize(new Dimension(600, 600));
        frame.setContentPane(panel);
        frame.pack();
        frame.setVisible(true);

        Thread.sleep(200);

        Graphics graphics1 = panel.getGraphics();
        Peckman.createPeckman(graphics1);

        while (true)
        {
            Peckman.Forward(graphics1);
            Peckman.Return(graphics1);
        }
    }
}


