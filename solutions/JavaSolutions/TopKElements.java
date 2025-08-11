import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKElements {
    public static void main(String[] args) {

        int[] nums = {1,1,1,2,2,3};
        int k  = 2;

        System.out.println(Arrays.toString(topKFrequent(nums, k)));
    }
    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> freq = new HashMap<>();
       for(int i:nums){
           if(freq.containsKey(i)){
               freq.put(i, freq.get(i)+1);
           }else{
               freq.put(i,1);
           }
        }
        List<Map.Entry<Integer,Integer>> list  = new ArrayList<>(freq.entrySet());
        Collections.sort(list,(a,b)->b.getValue()-a.getValue());
        int[] result = new int[k];
        for(int i=0;i<k;i++){
            result[i] = list.get(i).getKey();
        }

        return result;
    }
}
