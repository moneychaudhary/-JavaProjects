import java.util.Random;

/**
 * Created by #money on 7/3/2016.
 */
public class Blocks extends Elements {
    private static Random random= new Random();

    public Blocks(int x)
    {
        this.x=x;
        getYCord();
        this.Xvel=5;
    }

    public  void update()
    {
        this.x-=this.Xvel;
    }

    private  void getYCord()
    {
        int randomInt =  random.nextInt(2);
        if(randomInt==0)
        {
            this.y=355;
        }
        else
            this.y=405;


    }

    public static String getBlockImage()
    {
        return "Images/block.png";
    }
}
