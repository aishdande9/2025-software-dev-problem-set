import java.util.Stack;

public class ReversePolish {
    public static void main(String[] args) {

        String[] tokens = {"2","1","+","3","*"};
        System.out.println(evalRPN(tokens));

    }


        public static int evalRPN(String[] tokens) {
            Stack<Integer> stack = new Stack<>();


            for(String i:tokens){

                if(i.equals("+")){
                    int a  = stack.pop();
                    int b = stack.pop();
                    stack.push(a+b);
                }else if(i.equals("-")){
                    int a  = stack.pop();
                    int b = stack.pop();
                    stack.push(b-a);
                }else if(i.equals("*")){
                    int a  = stack.pop();
                    int b = stack.pop();
                    stack.push(a*b);

                }else if(i.equals("/")){
                    int a  = stack.pop();
                    int b = stack.pop();
                    stack.push(b/a);
                }
                else{
                    stack.push(Integer.parseInt(i));
                }
            }

            return stack.pop();
        }
    }

