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

        Graphics graphics = panel.getGraphics();
        graphics.setColor(Color.blue);
        graphics.fillArc(0, 0, 50, 50, -30, 330);
        graphics.fillArc(0, 550, 50, 50, 60, 330);
        graphics.fillArc(550, 0, 50, 50, -120, 330);
        graphics.fillArc(550, 550, 50, 50, 150, 330);

        int x = 0;
        int y = 0;
        int xVel = 1;
        int yVel = 1;
        while (true)
        {

            x = x + xVel;
            y = y + yVel;

            if (x > 250) {
                int x1 = 0;
                int y1 = 0;
                int xVel1 = 1;
                int yVel1 = 1;

                while (x1 <= 250) {
                    x1 = x1 + xVel1;
                    y1 = y1 + yVel1;
                    Thread.sleep(10);
                        graphics.clearRect(0, 0, 600, 600);
                        graphics.fillArc(300 + x1, 300 + y1, 50, 50, -30, 330);
                        graphics.fillArc(300 + x1, 250 - y1, 50, 50, 60, 330);
                        graphics.fillArc(250 - x1, 300 + y1, 50, 50, -120, 330);
                        graphics.fillArc(250 - x1, 250 - y1, 50, 50, 150, 330);


                }

                    x = 0;
                    y = 0;
                    xVel = 1;
                    yVel = 1;
                }


                Thread.sleep(5);
                graphics.clearRect(0, 0, 600, 600);
                graphics.fillArc(x, y, 50, 50, -30, 330);
                graphics.fillArc(x, 550 - y, 50, 50, 60, 330);
                graphics.fillArc(550 - x, y, 50, 50, -120, 330);
                graphics.fillArc(550 - x, 550 - y, 50, 50, 150, 330);


            }
        }
    }
