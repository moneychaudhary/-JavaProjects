package Game;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;

public class Demo implements KeyListener {

    private static Image pakia ;
    private static Image background ;
    private static int pakiaYCord=200;
    private static int pakiaYVel=0;
    private static int pakiaAcc=0;
    private static int backgroundXCord=0;
    public static JFrame frame1;




    public static void main(String[] args) throws IOException, InterruptedException {

        frame1 = new JFrame("Bhag D.K Bose");
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

        Demo.pakia = ImageIO.read(Demo.class.getResource("Images/happy_pakia.png"));
        Demo.background=ImageIO.read(Demo.class.getResource("Images/bg_combined.png"));



        while (true)
        {
            if(Demo.backgroundXCord>=-200)
                    Demo.backgroundXCord--;
            else
            Demo.backgroundXCord=-20;

            Demo.pakiaYVel=Demo.pakiaYVel+Demo.pakiaAcc;
            Demo.pakiaYCord=Demo.pakiaYCord+Demo.pakiaYVel;
            Thread.sleep(40);
            graphics.clearRect(0,0,800,500);
            graphics.drawImage(Demo.background,Demo.backgroundXCord,0,null);
            graphics.drawImage(Demo.pakia,0,Demo.pakiaYCord,null);

        }

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_SPACE)
        if(Demo.pakiaYCord<=0||Demo.pakiaYCord>=500) {
//            JOptionPane.showMessageDialog(frame1, "Game Over");
        }
        else {
                Demo.pakiaYVel = -15;
                Demo.pakiaAcc = 1;
            }




    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
