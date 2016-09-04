package Image;

import javax.swing.*;
import javax.swing.text.Element;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by #money on 7/1/2016.
 */
public class OopsDemo implements KeyListener, MouseListener {

    public static void main(String[] args) throws InterruptedException {
        JFrame frame = new JFrame("Bhag DK BOSE");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setResizable(false);

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(800, 450));
        frame.setContentPane(panel);
        panel.setFocusable(true);
        OopsDemo demo1 = new OopsDemo();
        panel.addKeyListener(demo1);
        panel.addMouseListener(demo1);
        frame.pack();
        Thread.sleep(100);
        Graphics graphics = frame.getGraphics();
        panel.requestFocus(true);
        frame.setVisible(true);

        List<Element> elementList = new ArrayList<>();
        elementList.add(new Player(400,315));

        while (true) {
            Thread.sleep(40);
            graphics.clearRect(0, 0, 800, 450);
            graphics.setColor(Color.cyan);
            graphics.fillRect(0, 0, 800, 450);


        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {

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
