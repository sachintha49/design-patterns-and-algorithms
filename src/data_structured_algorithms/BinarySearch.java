package data_structured_algorithms;

/**
 * @author : Sachintha Nishajith <snishajith@gmail.com>
 * @since : 5/6/2021
 **/
public class BinarySearch {
    public int binaryAlgo(int[] a, int findNo) {
        int low = 0;
        int high = a.length - 1;
        int key = findNo;
        int mid;
        while (low <= high){
            mid = (low + high) / 2;
            if (key == a[mid]){
                return mid;
            }else if (key < a[mid]){
                high = mid - 1;
            }else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {10,20,30,40,50,60};
        BinarySearch binary = new BinarySearch();
        int no = binary.binaryAlgo(a,50);
        if (no == -1){
            System.out.println("key is not found in array");
        }else {
            System.out.println("Key is found in array in index:"+ no);
        }
    }
}
