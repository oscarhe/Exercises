// 3.6 - Implement a program to sort a stack in ascending order (with biggest items on top). You may use at most one additional stack to hold items, but you may not copy the elements into another data structure (such as an array). The stack supports the following operations: push, pop, peek, and isEmpty.

import java.util.Stack;

public class StackQueue6 {

    public static void main(String[] args) {

        Stack<Integer> unsortedStack = new Stack<Integer>();
        unsortedStack.push(5);
        unsortedStack.push(4);
        unsortedStack.push(3);
        unsortedStack.push(4);
        unsortedStack.push(1);

        Stack<Integer> sortedStack = sortStack(unsortedStack);

        while(!sortedStack.isEmpty()) {

            System.out.println(sortedStack.pop());

        }

    }

    public static Stack<Integer> sortStack(Stack<Integer> unsortedStack) {

        Stack<Integer> sortedStack = new Stack<Integer>();

        int current;

        while(!unsortedStack.isEmpty()) {

            int placeHolder = 0;

            current = unsortedStack.pop();

            if(sortedStack.isEmpty() || current >= sortedStack.peek()) {

                sortedStack.push(current);

            } else {

                while(current < sortedStack.peek()) {

                    unsortedStack.push(sortedStack.pop());
                    placeHolder++;

                }

                sortedStack.push(current);

                while(placeHolder > 0) {

                    sortedStack.push(unsortedStack.pop());
                    placeHolder--;

                }
                
            }

        }

        return sortedStack;

    }

}
