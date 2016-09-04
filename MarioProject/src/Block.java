import java.io.IOException;

/**
 * Created by #money on 7/1/2016.
 */
public class Block extends Element {
    public Block(int x, int y) throws IOException {
        super(20, 50);
        this.x = x;
        this.y = y;
        this.xVel=-3;
    }

    @Override
    String getImagePath() {
        return "Image/block.png";
    }
}
