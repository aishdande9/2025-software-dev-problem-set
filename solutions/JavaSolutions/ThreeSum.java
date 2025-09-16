import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(nums));
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
      for(int i=0;i<nums.length;i++){
          for(int j=i+1;j<nums.length;j++){
              for(int k= j+1;k<nums.length;k++){
                  int sum = nums[i]+nums[j]+nums[k];
                  if(sum == 0){
                      List<Integer> triplet = Arrays.asList(nums[i],nums[j],nums[k]);
                      Collections.sort(triplet);

                      if(!result.contains(triplet)){
                          result.add(triplet);
                      }


                  }
              }
          }
      }
      return result;

        }

}
