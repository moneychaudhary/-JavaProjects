import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static javafx.scene.input.KeyCode.L;

/**
 * Created by #money on 7/3/2016.
 */
public class Player extends Elements {

    public List<Image> playerPos = new ArrayList<>();

    public Player(int x) throws IOException {
        super();
        this.x=x;
        this.y=358;

        this.Yvel=0;
        this.Yacc=0;
        this.playerPos.add(pos1);
        this.playerPos.add(pos2);
        this.playerPos.add(pos3);
        this.playerPos.add(pos4);
        this.playerPos.add(pos5);
        this.playerPos.add(pos6);
        this.playerPos.add(pos7);
        this.playerPos.add(pos8);
    }

    private Image pos1= ImageIO.read(Demo.class.getResource("Images/run_anim1.png"));
    private Image pos2= ImageIO.read(Player.class.getResource("Images/run_anim2.png"));
    private Image pos3= ImageIO.read(Player.class.getResource("Images/run_anim3.png"));
    private Image pos4= ImageIO.read(Player.class.getResource("Images/run_anim4.png"));
    private Image pos5= ImageIO.read(Player.class.getResource("Images/run_anim5.png"));
    private Image pos6= ImageIO.read(Player.class.getResource("Images/run_anim4.png"));
    private Image pos7= ImageIO.read(Player.class.getResource("Images/run_anim3.png"));
    private Image pos8= ImageIO.read(Player.class.getResource("Images/run_anim2.png"));

    public void updatePos()
    {
        this.Yvel+=this.Yacc;
        this.y+=this.Yvel;
        this.rePos();

    }

    private void rePos() {
        if (this.y >= 358) {
            this.Yvel = 0;
            this.Yacc = 0;
        }

    }



}

