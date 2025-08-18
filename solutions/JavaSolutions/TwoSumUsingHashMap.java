import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumUsingHashMap {
    public static void main(String[] args) {
        int target = 9;
        int[] nums = {2, 7, 11, 10};

        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> freq = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int compliment = target - nums[i];
            if (freq.containsKey(compliment)) {
                return new int[]{freq.get(compliment), i};
            } else {
                freq.put(nums[i], i);
            }
        }

        throw new IllegalArgumentException("No Two Sum found");

    }
}


