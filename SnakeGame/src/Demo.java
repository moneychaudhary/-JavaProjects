import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.util.Random;

public class Demo implements KeyListener {
    private static int yVel = 0;
    private static int xVel = 0;
    private static int xVelIncrement = 1;
    private static int yVelIncrement = 1;
    private static int pointXCord;
    private static int pointYCord;
    public static Random random = new Random();


    public static void main(String[] args) throws InterruptedException {
        JFrame frame1 = new JFrame("Game");
        frame1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame1.setResizable(false);

        JPanel panel1 = new JPanel();
        frame1.setContentPane(panel1);
        panel1.setPreferredSize(new Dimension(600, 600));
        panel1.setFocusable(true);
        panel1.addKeyListener(new Demo());


        frame1.pack();
        frame1.setVisible(true);
        panel1.requestFocus();


        Thread.sleep(200);

        Graphics graphics2 = panel1.getGraphics();

        Image tempImage = new BufferedImage(600, 600, BufferedImage.TYPE_INT_RGB);
        Graphics graphics1 = tempImage.getGraphics();


        int x = 280;
        int y = 280;
        graphics1.clearRect(0, 0, 600, 600);
        graphics1.setColor(Color.cyan);
        graphics1.fillRect(0, 0, 600, 600);

        graphics1.setColor(Color.BLUE);
        graphics1.fillRect(0, 0, 10, 600);
        graphics1.fillRect(0, 0, 600, 10);
        graphics1.fillRect(0, 590, 600, 10);
        graphics1.fillRect(590, 0, 10, 600);

        Demo.pointXCord = Demo.random.nextInt((570 - 10)) + 11;
        Demo.pointYCord = Demo.random.nextInt((570 - 10)) + 11;

        int count = 0;
        int width = 20;
        int height = 20;

        while (true) {

            x = x + xVel;
            y = y + yVel;


            if ((x <= 590 - width) && x >= 10 && y <= (590 - height) && y >= 10) {
                Thread.sleep(30);
                graphics1.clearRect(10, 10, 580, 580);
                graphics1.setColor(Color.cyan);
                graphics1.fillRect(10, 10, 580, 580);
                graphics1.setColor(Color.black);
                graphics1.fillRect(x, y, width, height);
                graphics1.setColor(Color.red);
                graphics1.fillRect(Demo.pointXCord, Demo.pointYCord, 10, 10);

                boolean one = x <= Demo.pointXCord && Demo.pointXCord <= (x + width) && y <= Demo.pointYCord && Demo.pointYCord <= (y + height);
                boolean two = x <= (Demo.pointXCord + 10) && (Demo.pointXCord + 10) <= (x + width) && y <= Demo.pointYCord && Demo.pointYCord <= (y + height);
                boolean three = x <= (Demo.pointXCord) && (Demo.pointXCord) <= (x + width) && y <= (Demo.pointYCord + 10) && (Demo.pointYCord + 10) <= (y + height);
                boolean four = x <= (Demo.pointXCord + 10) && (Demo.pointXCord + 10) <= (x + width) && y <= (Demo.pointYCord + 10) && (Demo.pointYCord + 10) <= (y + height);

                if (one || two || three || four) {
                    count++;
                    width = width + 5;
                    height = height + 5;
                    Demo.yVelIncrement++;
                    Demo.xVelIncrement++;
                    graphics1.clearRect(x, y, 30, 30);
                    graphics1.fillRect(x, y, width, height);

                    Demo.pointXCord = Demo.random.nextInt((570 - 10)) + 11;
                    Demo.pointYCord = Demo.random.nextInt((570 - 10)) + 11;

                }
            } else {
                JOptionPane.showMessageDialog(frame1, "GAME OVER!!!\n Your Score :" + count);
                frame1.setVisible(false);
                break;

            }

            graphics2.drawImage(tempImage, 0, 0, null);


        }

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            Demo.yVel = 0;
            Demo.xVel = Demo.xVelIncrement;
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            Demo.xVel = -Demo.xVelIncrement;
            Demo.yVel = 0;
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            Demo.xVel = 0;
            Demo.yVel = Demo.yVelIncrement;
        } else if (e.getKeyCode() == KeyEvent.VK_UP) {
            Demo.xVel = 0;
            Demo.yVel = -Demo.yVelIncrement;
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }


}
