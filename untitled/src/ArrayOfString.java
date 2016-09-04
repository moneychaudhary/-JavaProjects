import java.util.Scanner;

/**
 * Created by #money on 7/31/2016.
 */
public class ArrayOfString{
    public static void main(String[] args ) {
        int value=0;
        String[] names =  new String[100];
        Scanner scan = new Scanner(System.in);

        System.out.println("Total Number of Students : ");
        int size = scan.nextInt();

        System.out.println("Enter Names :");
        scan.next();
        for (int i = 0; i<size ; i++)
            names[i]= scan.nextLine();

        System.out.println("Entered Names :");
        for (int i = 0 ; i<size ; i++)
            System.out.println(names[i]);

        String key = scan.nextLine();

        for (int i = 1 ; i <size;i++)
        {
            if (key.equals(names[i])) {
                value = i +1;
                System.out.println(key+"  is found at "+(value)+ " pos ");
                break;
            }
        }



    }
}
