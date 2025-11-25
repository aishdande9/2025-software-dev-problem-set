import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
int[] nums = {2, 7, 11, 15};
int target = 9;

        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target){
        HashMap<Integer,Integer> freq = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int compliment = target-nums[i];//9-2=7

            if(freq.containsKey(compliment)){
                return new int[]{freq.get(compliment),i};

            }else{
                freq.put(nums[i],i);
            }
        }

        throw new IllegalArgumentException("no two sum found");
    }
}
