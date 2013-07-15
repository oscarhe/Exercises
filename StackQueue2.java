// 3.2 - How would you design a stack which, in addition to push and pop, also has a function min which returns the minimum element? Push, pop and min should all operate in O(1) time.

// Use another stack to keep track of the minimums

import java.util.Stack;

public class StackQueue2 {
    
    static class MyStack extends Stack<Integer> {
        private Stack<Integer> stack;
        private Stack<Integer> min;

        public MyStack() {

            stack = new Stack<Integer>();
            min = new Stack<Integer>();

        }

        public void push(int value) {

            stack.push(value);
        
            if(min.isEmpty()) {

                min.push(value);

            } else if(value <= min.peek()) {

                min.push(value);

            }

        }

        public Integer pop() {
        
            int value = stack.pop();
        
            if(value == min.peek()) {

                min.pop();

            }

            return value;

        }

        public int min() {

            if(min.isEmpty()) {

                return Integer.MAX_VALUE;

            }
            return min.peek();
        }
    
    }

    public static void main(String[] args) {

        MyStack stack = new MyStack();
        stack.push(1);
        stack.push(2);
        System.out.println(stack.min());
        stack.pop(); stack.pop();
        stack.push(3);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.min());
        stack.pop();
        stack.pop();
        System.out.println(stack.min());                

    }

}

