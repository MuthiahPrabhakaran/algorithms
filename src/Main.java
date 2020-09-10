import com.sort.bubble.BubbleSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //int[] numbers = {5,7,3,2,89,1};
        //int[] numbers = {1,2,3,4,5};
        //int[] numbers = {5,4};
        int[] numbers = {};
        BubbleSort sorter = new BubbleSort();
        sorter.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
