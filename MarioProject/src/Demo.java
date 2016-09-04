import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.util.Random;

public class Demo implements KeyListener, MouseListener {
    private static JFrame frame;
    private static Image grass;
    private static Image playerPos1;
    private static Image playerPos2;
    private static Image playerPos3;
    private static Image playerPos4;
    private static Image playerPos5;
    private static Image block;
    private static int imageIndex=0;
    private static int playerX=350;
    private static int playerY=358;
    private static int playerYVel=0;
    private static int playerYAcc=0;
    private static int block1X=1000;
    private static int block2X=1200;
    private static int block3X=1400;
    private static int block5X=1800;
    private static int block6X=2000;
    private static int block4X=1600;
    private static int block2Y=405;
    private static int block1Y=345;
    private static int block3Y=405;
    private static int block4Y=345;
    private static int block5Y=345;
    private static int block6Y=405;
    private static int blockVel=4;
    private static int count=0;
    private static Random random=new Random();
    private static Rectangle r1;
    private static Rectangle r2;
    private static boolean gamePaused = false;


    public static void main(String[] args) throws InterruptedException, IOException {
        frame = new JFrame("Bhag DK BOSE");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setResizable(false);

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(800, 500));
        frame.setContentPane(panel);
        panel.setFocusable(true);
        Demo demo1 =  new Demo();
        panel.addKeyListener(demo1);
        panel.addMouseListener(demo1);
        frame.pack();
        Thread.sleep(100);
        Graphics graphics = frame.getGraphics();
        panel.requestFocus(true);
        frame.setVisible(true);

        Demo.grass = ImageIO.read(Demo.class.getResource("Image/grass.png"));
        Demo.playerPos1 = ImageIO.read(Demo.class.getResource("Image/run_anim1.png"));
        Demo.playerPos2 = ImageIO.read(Demo.class.getResource("Image/run_anim2.png"));
        Demo.playerPos3 = ImageIO.read(Demo.class.getResource("Image/run_anim3.png"));
        Demo.playerPos4 = ImageIO.read(Demo.class.getResource("Image/run_anim4.png"));
        Demo.playerPos5 = ImageIO.read(Demo.class.getResource("Image/run_anim5.png"));
        Demo.block = ImageIO.read(Demo.class.getResource("Image/block.png"));
        graphics.setColor(Color.cyan);
        graphics.fillRect(0, 0, 800, 500);
        graphics.drawImage(Demo.grass, 0, 455, null);
        graphics.drawImage(Demo.playerPos1, Demo.playerX, Demo.playerY, null);

        Image[] playerPos = {
                Demo.playerPos1,
                Demo.playerPos2,
                Demo.playerPos3,
                Demo.playerPos4,
                Demo.playerPos5,
                Demo.playerPos4,
                Demo.playerPos3,
                Demo.playerPos2,
        };

        int[] blocksXCords = {
                Demo.block1X,
                Demo.block2X,
                Demo.block3X,
                Demo.block4X,
                Demo.block5X,
                Demo.block6X,
        };
        int[] blocksYCords = {
                Demo.block1Y,
                Demo.block2Y,
                Demo.block3Y,
                Demo.block4Y,
                Demo.block5Y,
                Demo.block6Y,
        };


        int randomInt;
        while (true)
        {


            Thread.sleep(20);
            if (Demo.gamePaused)
                continue;

            if(Demo.playerX<0) {
                JOptionPane.showMessageDialog(frame, "GAME OVER !!\n Your Score :" + (count));
                frame.setVisible(false);
                break;
            }



            for (int i = 0; i < 6; i++)
                blocksXCords[i] = blocksXCords[i] - Demo.blockVel;


            for (int i = 0; i < 6; i++)
            {
                if (blocksXCords[i] <= -200)
                {
                    Demo.count++;
                    
                    if(Demo.count%10==0)
                        Demo. blockVel++;

                    randomInt = Demo.random.nextInt(2);

                    if (randomInt == 0)
                    {
                        blocksXCords[i] = 1000;
                        blocksYCords[i] = 345;

                    } else
                    {
                        blocksXCords[i] = 1000;
                        blocksYCords[i] = 405;
                    }
                }
            }

            Demo.playerYVel = Demo.playerYVel + Demo.playerYAcc;
            Demo.playerY = Demo.playerY + Demo.playerYVel;
            if (Demo.playerY >= 358) {
                Demo.playerYVel = 0;
                Demo.playerYAcc = 0;
            }
            Demo.imageIndex++;
            Demo.imageIndex = Demo.imageIndex % 8;
            graphics.clearRect(0, 0, 800, 500);
            graphics.setColor(Color.cyan);
            graphics.fillRect(0, 0, 800, 500);
            graphics.drawImage(Demo.grass, 0, 455, null);
            graphics.drawImage(playerPos[Demo.imageIndex], Demo.playerX, Demo.playerY, null);
            r1=new Rectangle(Demo.playerX,Demo.playerY,72,97);

            for (int i = 0; i < 6; i++) {
                graphics.drawImage(Demo.block, blocksXCords[i], blocksYCords[i], null);
                r2 = new Rectangle(blocksXCords[i], blocksYCords[i], 20, 50);
                if (r1.intersects(r2)) {
                    Demo.playerX = Demo.playerX - 10;
                }


            }
            if(Demo.playerX<350)
                Demo.playerX++;

            graphics.setColor(Color.red);
            graphics.fillRect(740,50,50,50);

        }
    }

        @Override
        public void keyTyped (KeyEvent e)
        {
        }
            @Override
            public void keyPressed (KeyEvent e){
                if (e.getKeyCode() == KeyEvent.VK_SPACE && Demo.playerY == 358) {
                    Demo.playerYVel = -30;
                    Demo.playerYAcc = 2;

                }

            }

            @Override
            public void keyReleased (KeyEvent e){
            }

    @Override
    public void mouseClicked(MouseEvent e) {

        if(e.getX()>740&&e.getX()<790&&e.getY()>50&&e.getY()<100)
        Demo.gamePaused = !Demo.gamePaused;

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
