/**
 * Created by #money on 8/7/2016.
 */
public class BubbleSort implements Sorting {
    private Boolean swap;
    public void sort(int[] list) {
        for (int i  =0; i<list.length; i++) {
            swap=false;
            for (int j = i; j < list.length - 1; j++) {
                if (list[j] > list[j + 1]) {
                    ListFunctions.swapElements(list, j, j + 1);
                    swap = true;
                }
            }
            if (!swap)
                break;
        }
    }
}
