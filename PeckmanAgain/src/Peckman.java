import java.awt.*;

/**
 * Created by money on 27/6/16.
 */
public class Peckman {
    private static int x = 0;
    private static int y = 0;
    public static void Return(Graphics graphics) throws InterruptedException {
        int x1 = 0;
        int y1 = 0;
        int xVel1 = 1;
        int yVel1 = 1;
        while (x1 <= 250) {
            x1 = x1 + xVel1;
            y1 = y1 + yVel1;
            Thread.sleep(5);
            graphics.clearRect(0, 0, 600, 600);
            graphics.fillArc(300 + x1, 300 + y1, 50, 50, -30, 330);
            graphics.fillArc(300 + x1, 250 - y1, 50, 50, 60, 330);
            graphics.fillArc(250 - x1, 300 + y1, 50, 50, -120, 330);
            graphics.fillArc(250 - x1, 250 - y1, 50, 50, 150, 330);
        }
        x = 0;
        y = 0;
    }

    public static int Forward(Graphics graphics) throws InterruptedException {

        int xVel = 1;
        int yVel = 1;
        while (true) {
            x = x + xVel;
            y = y + yVel;

            Thread.sleep(5);
            graphics.clearRect(0, 0, 600, 600);
            graphics.fillArc(x, y, 50, 50, -30, 330);
            graphics.fillArc(x, 550 - y, 50, 50, 60, 330);
            graphics.fillArc(550 - x, y, 50, 50, -120, 330);
            graphics.fillArc(550 - x, 550 - y, 50, 50, 150, 330);

            if (x > 250)
                return 0;
        }
    }

        public static void createPeckman(Graphics graphics)
    {
        graphics.setColor(Color.black);
        graphics.fillArc(0, 0, 50, 50, -30, 330);
        graphics.fillArc(0, 550, 50, 50, 60, 330);
        graphics.fillArc(550, 0, 50, 50, -120, 330);
        graphics.fillArc(550, 550, 50, 50, 150, 330);

    }

    }


