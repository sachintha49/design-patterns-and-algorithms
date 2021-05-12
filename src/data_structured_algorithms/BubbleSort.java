package data_structured_algorithms;

import java.util.Arrays;

/**
 * @author : Sachintha Nishajith <snishajith@gmail.com>
 * @since : 5/4/2021
 **/
public class BubbleSort {
    public int[] sort(int[] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[j] < array[j-1]){
                    int temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        BubbleSort bubble = new BubbleSort();
        int array[] = {4,3,6,7,4,3,1,5,4,6,4,2};
        System.out.println(Arrays.toString(bubble.sort(array)));
    }
}
