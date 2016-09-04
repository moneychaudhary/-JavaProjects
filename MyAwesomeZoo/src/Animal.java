import java.awt.event.KeyListener;

/**
 * Created by ###money on 6/15/2016.
 */


abstract public class Animal {
    public String name;

    public void walk() {
        System.out.println("tak tak tak");
    }

    public void introduce() {
        System.out.println("Hey My name is " + this.name);

    }

    abstract public void speak();

}