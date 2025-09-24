import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KLargest {
    public static void main(String[] args) {
int[] arr =   {3,2,1,5,6,4};
int k = 2;

        System.out.println(Arrays.toString(largestNumber(arr, k)));
    }
    public static int[] largestNumber(int[] arr,int k){
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int i=0;i<arr.length;i++){

if(freq.containsKey(arr[i])){
    freq.put(arr[i],freq.get(arr[i])+1);
}else{
    freq.put(arr[i],1);
}
        }

        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(freq.entrySet());
        Collections.sort(list,(a,b)->b.getValue()-a.getValue());

        int[] result = new int[k];
for(int i=0;i<k;i++){
    result[i] = list.get(i).getKey();
}

return result;
        }
    }

