import java.util.List;
import java.util.Scanner;

/**
 * Created by #money on 8/6/2016.
 */
public class ListFunctions {

    public static void printList (int [] list )
    {
        System.out.println("Elements in list are : ");
        for (int i = 0 ;i <list.length;i++ ) {
            System.out.print(list[i]);
            System.out.print("\t\t");
        }
    }

    public static void swapElements(int [] list ,int a , int b)
    {
        int temp = list[a];
        list[a]=list[b];
        list[b] = temp;
    }

    public static int[] createList()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter total number of elements :");
        int size =scanner.nextInt();
        System.out.println("Enter elements");
        int []list = new int[size];

        for (int i =0; i <size ; i ++)
            list[i]=scanner.nextInt();
        return list;
    }
}
