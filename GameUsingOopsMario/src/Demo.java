
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Demo implements KeyListener,MouseListener {
    public static boolean playPause = false;
    private static Image grass;
    private static Image block;
    private static Image playPauseImage;
    private static List<Blocks> blocksList;
    private static int playerCurrentImage=0;
    private static Player player1;
    private static Player player2;


    public static void main(String[] args) throws IOException, InterruptedException {


        NewJframe frame = new NewJframe(500, 800);
        Demo demo=new Demo();
        NewJframe.panel.addMouseListener(demo);
        NewJframe.panel.addKeyListener(demo);



        grass= ImageIO.read(Demo.class.getResource(Elements.getGrass()));
        block= ImageIO.read(Demo.class.getResource(Blocks.getBlockImage()));
        playPauseImage=ImageIO.read(Demo.class.getResource(Elements.getPauseButton()));
        Blocks block1 = new Blocks(900);
        Blocks block2 = new Blocks(1100);
        Blocks block3 = new Blocks(1300);
        Blocks block4 = new Blocks(1500);
        Blocks block5 = new Blocks(1700);
        player1= new Player(300);
        player2 = new Player(400);


        while (true) {
            Thread.sleep(0);

            while (NewJframe.start) {
                if (Demo.playPause)
                    continue;




                blocksList = new ArrayList<>();
                blocksList.add(block1);
                blocksList.add(block2);
                blocksList.add(block3);
                blocksList.add(block4);
                blocksList.add(block5);





                for (int i=0;i<blocksList.size();i++)
                {
                    blocksList.get(i).update();
                }

                for (int i=0;i<blocksList.size();i++)
                {
                    if(blocksList.get(i).x<-100) {
                        blocksList.get(i).x = 900;
                        blocksList.get(i).hidden = false;
                    }
                }


                Demo.playerCurrentImage=Demo.playerCurrentImage%7;
                Thread.sleep(20);
                player1.updatePos();
                player2.updatePos();




                NewJframe.graphics.clearRect(0, 0, 800, 500);
                NewJframe.graphics.setColor(Color.cyan);
                NewJframe.graphics.fillRect(0, 0, 800, 500);
                NewJframe.graphics.drawImage(grass,0,455,null);
                NewJframe.graphics.drawImage(Demo.playPauseImage,720,40,null);
                NewJframe.graphics.drawImage(player1.playerPos.get(playerCurrentImage),player1.x,player1.y,null);
                NewJframe.graphics.drawImage(player2.playerPos.get(playerCurrentImage),player2.x,player2.y,null);
                Demo.playerCurrentImage++;

                for (int i=0;i<blocksList.size();i++)
                {
                    if(player2.getIntersection(blocksList.get(i))||player1.getIntersection(blocksList.get(i)))
                    {
                        blocksList.get(i).hidden=true;
                    }

                    if (blocksList.get(i).hidden == false)
                        NewJframe.graphics.drawImage(block, blocksList.get(i).x, blocksList.get(i).y, null);
                }
                NewJframe.graphics1.drawImage(NewJframe.tempImage,0,0,null);



            }

        }

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_SPACE&&player1.y==358)
        {
            player1.Yvel=-36;
            player1.Yacc=2;
        }
        else if(e.getKeyCode()==KeyEvent.VK_UP&&player2.y==358)
        {
            player2.Yvel=-36;
            player2.Yacc=2;
        }



        else if(e.getKeyCode()==KeyEvent.VK_CONTROL)
            Demo.playPauseFunc();

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getX()>=720&&e.getX()<=760&&e.getY()>=40&&e.getY()<=80)
        {
          Demo.playPauseFunc();

        }

    }

    private static void playPauseFunc()
    {
        if (Demo.playPause) {
            try {
                Demo.playPauseImage = ImageIO.read(Demo.class.getResource(Elements.getPauseButton()));
            } catch (IOException e1) {
                e1.printStackTrace();

            }
            Demo.playPause=false;
        }
        else {
            try {
                Demo.playPauseImage = ImageIO.read(Demo.class.getResource(Elements.getPlayButton()));
            } catch (IOException e1) {
                e1.printStackTrace();
            }
            Demo.playPause=true;

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



