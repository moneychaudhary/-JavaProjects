import java.util.Random;

/**
 * Created by ###money on 6/15/2016.
 */
public class Game {


    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.name = "Jackie";
        Cat cat1 = new Cat();
        cat1.name = "Hilary";
        Tiger tiger1 = new Tiger();
        tiger1.name = "Sher Khan";

        Kangaroo kangaroo1 = new Kangaroo();
        kangaroo1.name = "Jack";

        Random random1 = new Random();
        int aRandomInt = random1.nextInt(4);

        Animal aRandomAnimal;
        switch (aRandomInt) {
            case 0:
                aRandomAnimal = new Dog();
                break;
            case 1:
                aRandomAnimal = new Cat();
                break;
            case 2:
                aRandomAnimal = new Tiger();
                break;
            case  3:
                aRandomAnimal = new Kangaroo();
                break;
            default:
                aRandomAnimal =  new ReinDear();
                break;
        }

        aRandomAnimal.speak();


    }

}
