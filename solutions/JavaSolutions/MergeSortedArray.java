import java.util.Arrays;

import static java.util.Arrays.sort;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};

        System.out.println(Arrays.toString(mergeArrays(arr1, arr2)));
    }
    public static int[] mergeArrays(int[] arr1,int[] arr2){
int[] arr3 = new int[arr1.length+ arr2.length];
System.arraycopy(arr1,0,arr3,0,arr1.length);
System.arraycopy(arr2,0,arr3,arr1.length,arr2.length);
Arrays.sort(arr3);


return arr3;
    }
}
