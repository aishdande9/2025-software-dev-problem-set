import java.util.Arrays;
import java.util.Stack;

public class Temperature {
    public static void main(String[] args) {
       int[] temperatures = {73,74,75,71,69,72,76,73};
        System.out.println(Arrays.toString(dailyTemperatures(temperatures)));
    }

    public static int[] dailyTemperatures(int[] temperatures) {

        Stack<Integer> stack = new Stack<>();

        int[] answer = new int[temperatures.length];

for(int i=0;i<temperatures.length;i++){

    while(!stack.isEmpty() && temperatures[i]>temperatures[stack.peek()]){
        int prevIndex = stack.pop();
        answer[prevIndex] = i-prevIndex;

    }
    stack.push(i);

}
return answer;
    }
}
