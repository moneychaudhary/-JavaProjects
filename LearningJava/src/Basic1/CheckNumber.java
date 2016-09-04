package Basic1;

import java.util.Scanner;

/**
 * Created by money on 22/6/16.
 */
//TO CHECK WHEATER NUM INPUT IS POSITIVE OR NEGATIVE

public class CheckNumber {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter num that you want to check");
        int num = input.nextInt();

        if(num>=0)
            System.out.println(num + " is a postive number");
        else
            System.out.println(num +  " is a negative number");

    }
}
