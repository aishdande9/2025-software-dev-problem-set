import java.util.Stack;

public class MinStack {
    private Stack<Integer> stack;

    public MinStack() {
this.stack = new Stack<>();
    }

    public void push(int val) {
stack.push(val);

    }

    public void pop() {
stack.pop();
    }

    public int top() {
      return stack.peek();
    }

    public int getMin() {

       Stack<Integer> temp = new Stack<>();
       int min = stack.peek();
while(!stack.isEmpty()){
    min = Math.min(min,stack.peek());
    temp.push(min);
}

while(!temp.isEmpty()){
    stack.push(temp.pop());
}
return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */