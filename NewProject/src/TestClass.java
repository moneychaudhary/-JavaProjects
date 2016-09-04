import java.util.Timer;

/**
 * Created by #money on 8/7/2016.
 */
public class TestClass {
    public static void main(String[] args) {
        BubbleSort selectionSort = new BubbleSort();

        int list[] = new int[10];
        list= ListFunctions.createList();

        System.out.println("Before Sorting:");
        ListFunctions.printList(list);

        selectionSort.sort(list);
        System.out.println("\nAfter Sorting : ");
        ListFunctions.printList(list);
    }
}
