package data_structured_algorithms;

/**
 * @author : Sachintha Nishajith <snishajith@gmail.com>
 * @since : 5/6/2021
 **/
public class LinearSearch {
    public int linearFind(int[] inputArray, int searchValue){
        for (int i = 0; i < inputArray.length; i++) {
            if (searchValue == inputArray[i]){
                return i;
            }
        }
        return -1;//samanyen -1 use karanne monawath hambune nehe kiyala use karanna
    }

    public static void main(String[] args) {
        int[] a = {2,5,3,77,4,25,76,42,62};
        LinearSearch linear = new LinearSearch();
        int output = linear.linearFind(a,2);
        if (output >= 0){
            System.out.println("The value is at index :"+ output);
        }else {
            System.out.println("The entered value is not there");
        }
    }
}
