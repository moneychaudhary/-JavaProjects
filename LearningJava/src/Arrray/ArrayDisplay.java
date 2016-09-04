package Arrray;

import java.util.Scanner;

/**
 * Created by money on 22/6/16.
 */
public class ArrayDisplay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter total num of values");
        int totalValues = input.nextInt();

        int array1[] = new int[totalValues];
        System.out.println("Assign Values");

        for(int i = 0 ;i<totalValues;i++)
        {
            System.out.println("Enter"+(i+1)+" Value " );
            array1[i]=input.nextInt();
        }
        System.out.println("Entered Values are : " );

        for(int i = 0 ;i<totalValues;i++)
        {
            System.out.println(array1[i]);
        }


    }
}
