import javax.imageio.ImageIO;
import javax.swing.*;
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by #money on 7/4/2016.
 */
public class Demo implements MouseListener

{

    private static  List<Baloon> baloonList;
    private static Baloon baloon1;
    private static Baloon baloon2;
    private static Baloon baloon3;
    private static Baloon baloon4;
    private static Baloon baloon5;
    private static Baloon baloon6;
    private static Baloon baloon7;
    private static Image baloonImage;
    private static Image background;
    public static JFrame frame;
    public static int count=0;
    private static AudioClip hitAudio;
    private static State currentState;

    public static void main(String[] args) throws InterruptedException, IOException {

        frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setResizable(false);

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(800,450));

        frame.setContentPane(panel);
        panel.setFocusable(true);
        panel.requestFocus(true);
        panel.addMouseListener(new Demo());
        frame.setVisible(true);
        frame.pack();



        baloon1= new Baloon();
        baloon2= new Baloon();
        baloon3= new Baloon();
        baloon4= new Baloon();
        baloon5= new Baloon();
        baloon6= new Baloon();
        baloon7= new Baloon();

        baloonImage= ImageIO.read(Demo.class.getResource("image/baloon.png"));
        background= ImageIO.read(Demo.class.getResource("image/bg_combined.png"));
        hitAudio= Applet.newAudioClip(Demo.class.getResource("image/hit.wav"));

        baloonList =  new ArrayList<>();
        baloonList.add(baloon1);
        baloonList.add(baloon2);
        baloonList.add(baloon3);
        baloonList.add(baloon4);
        baloonList.add(baloon5);
        baloonList.add(baloon6);
        baloonList.add(baloon7);

        Graphics graphics2 = panel.getGraphics();
        Image tempImage = new BufferedImage(800, 450, BufferedImage.TYPE_INT_RGB);
        Graphics graphics = tempImage.getGraphics();

        while (true)
        {
            Thread.sleep(40);

            for (int i= 0 ;i<baloonList.size();i++)
                baloonList.get(i).update();

            graphics.clearRect(0,0,800,600);
            graphics.drawImage(background,0,0,null);
            graphics.setColor(Color.black);
            for (int i = 0 ; i< baloonList.size();i++) {
                if(!baloonList.get(i).hidden)
                graphics.drawImage(baloonImage,baloonList.get(i).x,baloonList.get(i).y,null);
            }


            graphics2.drawImage(tempImage, 0, 0, null);
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        for(int i = 0 ; i< baloonList.size();i++)
        {
            if(baloonList.get(i).hidden==false&&e.getX()>=baloonList.get(i).x&&e.getX()<=baloonList.get(i).x+50&&
                    e.getY()>=baloonList.get(i).y&&e.getY()<=baloonList.get(i).y+80)
            {
                baloonList.get(i).hidden=true;
                hitAudio.play();
                Demo.count++;
                if (Demo.count%10==0)
                    Elements.Yvel++;

            }
        }
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
