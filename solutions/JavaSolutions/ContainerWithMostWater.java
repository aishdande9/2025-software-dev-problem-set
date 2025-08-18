public class ContainerWithMostWater {
    public static void main(String[] args) {
int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea(height));
    }

    public static int maxArea(int[] height) {

        //two pointer approach
        //find max area
        //area = Math.min(height[i],height[j])*j-i;
        //update max value with Math.max(max,area)

        int maxArea = 0;
        int i = 0;
        int j = height.length-1;

        while(i<j){
            int area = Math.min(height[i],height[j])*(j-i);

            maxArea = Math.max(maxArea,area);

            if(height[i]<height[j]){
            i++;
            }else{
              j--;
            }
        }
return maxArea;
    }
}
