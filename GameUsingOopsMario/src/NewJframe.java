import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.IOException;


public class NewJframe extends JFrame implements KeyListener {
    public static Graphics graphics;
    public static Graphics graphics1;
    public static Image tempImage;

    private static Image startOfGame;
    private static Image startimage;
    public static JPanel panel;

    public static boolean start =false;

    public  NewJframe()
    {
    }

    public NewJframe(int height,int width) throws IOException, InterruptedException {
        super();
        this.setTitle("GAME");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setResizable(false);

        panel= new JPanel();
        panel.setFocusable(true);
        panel.setPreferredSize(new Dimension(width,height));
        panel.addKeyListener(new NewJframe());

        this.setContentPane(panel);
        panel.requestFocus(true);
        this.pack();
        this.setVisible(true);

        Thread.sleep(5);


        NewJframe.graphics1=this.getGraphics();
        tempImage = new BufferedImage(800, 500, BufferedImage.TYPE_INT_BGR);
        graphics = tempImage.getGraphics();

        NewJframe.startOfGame=ImageIO.read(Demo.class.getResource("Images/start.jpg"));
        NewJframe.startimage=ImageIO.read(Demo.class.getResource("Images/enter.png"));

        NewJframe.graphics.drawImage(NewJframe.startOfGame,0,0,null);
        NewJframe.graphics.drawImage(NewJframe.startimage,350,350,null);
        NewJframe.graphics1.drawImage(NewJframe.tempImage,0,0,null);


    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_ENTER)
        {
            NewJframe.start=true;
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

}
