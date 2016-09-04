package Basic2;

import java.util.Scanner;

/**
 * Created by money on 22/6/16.
 */
public class DisplayNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number upto which you want to display");
        int num=input.nextInt();
        int count=0;
        do {
            System.out.println(count);
            count++;
            }
        while (count<=num);
        }
    }

