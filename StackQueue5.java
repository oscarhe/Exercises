// 3.5 - Implement a MyQueue class which implements a queue using two stacks.

import java.util.Stack;

public class StackQueue5 {

    public static class MyQueue<T> {

        public Stack<T> last, first;

        public MyQueue() {

            last = new Stack<T>();
            first = new Stack<T>();

        }

        public int size() {

            return last.size() + first.size();

        }

        public void add(T value) {

            last.push(value);

        }

        public T remove() {

            if(first.isEmpty()) {

                while(!last.isEmpty()) {

                    first.push(last.pop());

                }

            }

            return first.pop();

        }

        public T peek() {

            if(first.isEmpty()) {

                while(!last.isEmpty()) {

                    first.push(last.pop());

                }

            }

            return first.peek();

        }

    }

    public static void main(String[] args) {

        MyQueue<Integer> q = new MyQueue<Integer>();

        q.add(1);
        q.add(2);
        q.add(3);

        System.out.println(q.remove());
        System.out.println(q.peek());

    }

}
