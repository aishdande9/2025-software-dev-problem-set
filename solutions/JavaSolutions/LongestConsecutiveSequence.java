import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
int [] nums = {100,4,200,1,3,2};
        System.out.println(longestConsecutive(nums));
    }

    public static int longestConsecutive(int[] nums) {
        HashSet<Integer> store = new HashSet<>();
        int max = 0;
        for(int num:nums){
            store.add(num);

        }
        for(int s:store){

           if(!store.contains(s-1)){
               int current = s;
               int streak = 0;
while(store.contains(current)){
    streak++;
    current++;
}
max = Math.max(max,streak);
           }


        }
        return max;
        }

}
