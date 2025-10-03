public class RotatedSSortedArray {
    public static void main(String[] args) {
       int[] nums = {4, 5, 6, 7, 0, 1, 2};
       int target = 0;

        System.out.println(search(nums,target));

    }

    public static int search(int[] nums, int target) {
        int result = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] == target){
              result = i;
            }
        }
return result;
    }
}
