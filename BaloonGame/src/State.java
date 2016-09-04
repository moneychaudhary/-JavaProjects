import java.awt.*;
import java.awt.event.MouseEvent;

/**
 * Created by #money on 7/6/2016.
 */
abstract public class State {

    public  abstract void update(Graphics g);
    public abstract void onMouseClick(MouseEvent e);
}
