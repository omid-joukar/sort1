import java.util.Arrays;

/**
 * Created by KPS on 7/14/2020.
 */
public class Main {


    // Method to test above
    public static void main(String args[])
    {
        QuickSort ob = new QuickSort();
        int nums[] = {7, -5, 3, 2, 1, 0, 45};
        System.out.println("Original Array:");
        System.out.println(Arrays.toString(nums));
        ob.sort(nums);
        System.out.println("Sorted Array");
        System.out.println(Arrays.toString(nums));
    }
}

