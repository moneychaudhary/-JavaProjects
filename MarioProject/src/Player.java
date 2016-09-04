import java.io.IOException;

/**
 * Created by #money on 7/1/2016.
 */
public class Player extends Element {
    public Player(int x, int y) throws IOException {
        super(72, 90);
        this.x = x;
        this.y = y;
    }

    @Override
    String getImagePath() {
        return "image/run_anim1.png";
    }
}
