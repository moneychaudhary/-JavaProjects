package Demo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by #money on 7/8/2016.
 */
public class Abcd {

    public static void read()
    {
        try {
            FileReader fileReader = new FileReader("C:\\Users\\#money\\IdeaProjects\\GuiProject8\\src\\file");
            int nextChar= fileReader.read();
            while (nextChar>0)
            {
                System.out.println((char)nextChar);
                nextChar=fileReader.read();

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
