import java.util.Arrays;

public class SecondLargestNumber {
    public static void main(String[] args) {
        int[] num = {2,9,3,1,5};
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));
        System.out.println(num[num.length-2]);
    }
}
