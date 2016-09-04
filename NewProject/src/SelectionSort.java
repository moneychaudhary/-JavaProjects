/**
 * Created by #money on 8/7/2016.
 */
public class SelectionSort implements Sorting{

    public  void sort(int [] list)
    {
        for (int i = 0 ; i<list.length; i++)
            for (int j=i+1;j<list.length;j++)
        {
            if (list[i]>list[j])
                ListFunctions.swapElements(list,i,j);
        }
    }
}
