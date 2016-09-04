import java.util.Scanner;

/**
 * Created by ###money on 6/16/2016.
 */
public class Test {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Line");
        String line = input.nextLine();
        System.out.println("Enter Number");
        int number = input.nextInt()    ;



        if(line.length()<=15)
        {
            System.out.println(line);
        }
        else
        {
            System.out.println("Length of line is more than 15");
        }

        System.out.println("Required Number is " + 2*number);

    }
}
