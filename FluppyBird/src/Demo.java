package Game;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;

public class Demo implements KeyListener {

    private static Image plane ;




    public static void main(String[] args) throws IOException, InterruptedException {

        JFrame frame1 = new JFrame("Bhag D.K Bose");
        frame1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame1.setResizable(false);


        JPanel panel= new JPanel();
        panel.setPreferredSize(new Dimension(800,500));
        frame1.setContentPane(panel);
        panel.setFocusable(true);
        panel.addKeyListener(new Demo());
        frame1.pack();
        panel.requestFocus(true);
        frame1.setVisible(true);

        Thread.sleep(200);

        Graphics graphics =frame1.getGraphics();

        Demo.plane = ImageIO.read(Demo.class.getResource("images/happy_pakia.png"));

        while (true)
        {
            Thread.sleep(10);
            graphics.clearRect(0,0,800,500);
            graphics.drawImage(Demo.plane,0,200,null);


        }

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_SPACE)
        {

        }

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
