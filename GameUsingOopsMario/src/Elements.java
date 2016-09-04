import java.awt.*;

/**
 * Created by #money on 7/3/2016.
 */
public class Elements {
    public int x;
    public int y;
    public int Xvel;
    public int Yvel;
    public int Yacc;
    public int Xacc;
    public boolean hidden = false;
    private static Rectangle r1, r2;

    public static String getGrass() {
        return "Images/grass1.png";
    }

    public static String getPauseButton() {
        return "Images/pause.png";
    }

    public static String getPlayButton() {
        return "Images/play.png";
    }

    public boolean getIntersection(Blocks b) {
        r1 = new Rectangle(this.x, this.y, 72, 97);
        r2 = new Rectangle(b.x, b.y, 20, 50);

        if (r1.intersects(r2)&&b.hidden==false) {
            this.x -= 50;
            return true;
        }

        return false;



    }
}






