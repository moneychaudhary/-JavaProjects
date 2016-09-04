import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.Random;

/**
 * Created by #money on 7/4/2016.
 */
public class Baloon extends Elements {


    Random random = new Random();
    private static int score = 0;

    public Baloon() {
        this.setY();
        this.setX();
        Yvel = 4;
    }

    private void setX() {
        this.x = random.nextInt(750);
    }

    private void setY() {
        this.y = random.nextInt(450) + 500;
    }

    public void update() {
        this.y -= this.Yvel;
        this.reBorn();
    }

    private void reBorn() {
        if (this.y < -10) {
            if (this.hidden == false)
                score++;

            if (score == 10) {
                JOptionPane.showMessageDialog(Demo.frame, "Your Score:" + Demo.count);
                Demo.frame.setVisible(false);
            }
            this.setY();
            this.setX();
            this.hidden = false;
        }
    }


}
