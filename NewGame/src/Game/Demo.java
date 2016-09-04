package Game;

import javax.imageio.ImageIO;
import javax.swing.*;
    import java.awt.*;
    import java.awt.event.KeyEvent;
    import java.awt.event.KeyListener;
import java.io.IOException;

public class Demo implements KeyListener
    {

        private static Image grassImage;
        private static Image playerImage1;
        private static Image playerImage2;
        private static Image playerImage3;
        private static Image playerImage4;
        private static Image playerImage5;
        private static int playerYCord = 315;
        private static int playerYVel = 315;



        public static void main(String[] args) throws InterruptedException, IOException {
            JFrame frame1 =  new JFrame("Game");
            frame1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            frame1.setResizable(false);

            JPanel panel1= new JPanel();
            frame1.setContentPane(panel1);
            panel1.setPreferredSize(new Dimension(800,450));
            panel1.setFocusable(true);
            panel1.addKeyListener(new Demo());


            frame1.pack();
            frame1.setVisible(true);

            Thread.sleep(200);

            Graphics graphics1 = panel1.getGraphics();
            panel1.requestFocus();

            graphics1.setColor(Color.cyan);
            graphics1.fillRect(0,0,800,450);
            Demo.grassImage= ImageIO.read(Demo.class.getResource("image source"));
            Demo.playerImage1=ImageIO.read(Demo.class.getResource());
            Demo.playerImage2=ImageIO.read(Demo.class.getResource());
            Demo.playerImage3=ImageIO.read(Demo.class.getResource());
            Demo.playerImage4=ImageIO.read(Demo.class.getResource());
            Demo.playerImage5=ImageIO.read(Demo.class.getResource());

            Image[] playerImages= {
                    Demo.playerImage1,
                    Demo.playerImage2,
                    Demo.playerImage3,
                    Demo.playerImage4,
                    Demo.playerImage5,
                    Demo.playerImage3,
                    Demo.playerImage2};
            int playerImageIndex=0;
            Image currentPlayerImage;

            while (true)
            {

                Thread.sleep(10);

                playerImageIndex++;
                playerImageIndex=playerImageIndex%7;
                currentPlayerImage=playerImages[playerImageIndex];


                graphics1.clearRect(0,0,800,450);
                graphics1.drawImage(Demo.grassImage,0,405,null);
                graphics1.drawImage(currentPlayerImage,400,playerYCord,null);

            }

        }

        @Override
        public void keyTyped(KeyEvent e) {

        }

        @Override
        public void keyPressed(KeyEvent e)
        {
            if(e.getKeyCode()==KeyEvent.VK_SPACE)
                Demo.playerYCord=115;



        }

        @Override
        public void keyReleased(KeyEvent e) {

        }


    }


