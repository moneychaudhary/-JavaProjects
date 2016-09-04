import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;

abstract public class Element {

    protected int x = 0;
    protected int xVel = 0;
    private int xAcc = 0;
    protected int y = 0;
    protected int yVel = 0;
    private int yAcc;
    private int height;
    private int width;
    private Rectangle rectangle = new Rectangle();
    private Image image;

    public Element(int width, int height) throws IOException {
        super();
        this.width = width;
        this.height = height;
        this.image = ImageIO.read(Element.class.getResource(this.getImagePath()));
    }

    abstract String getImagePath();

    protected void update() {
        this.xVel = this.xVel + this.xAcc;
        this.yVel = this.yVel + this.yAcc;
        this.x = this.x + this.xVel;
        this.y = this.y + this.yVel;
    }

    private void updatePosition(int deltaX, int deltaY) {
        this.x = this.x + deltaX;
        this.y = this.y + deltaY;
    }

    private Rectangle getRectangle() {
        rectangle.setBounds(this.x, this.y, this.width, this.height);
        return rectangle;

    }

    private boolean intersect(Element e) {
        return this.getRectangle().intersects(e.getRectangle());
    }
}
