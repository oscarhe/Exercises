// 3.1 - Describe how you could use a single array to implement three stacks.
// Initialize an array to be 3 times the size of the biggest stack - assuming fixed sizes.
// Stack 1 will use indices 0 to n/3 - 1
// Stack 2 will use indices n/3 to 2n/3 - 1
// Stack 3 will use indices 2n/3 to 3n - 1

public class StackQueue1 {

    static int size = 10;
    static int[] stacks = new int[size * 3];
    static int[] stackPointers = {-1, -1, -1};

    public static void main(String[] args) {

        try {
            push(5, 2);
            System.out.println(isEmpty(2));
            System.out.println(pop(2));
            System.out.println(isEmpty(2));
        } catch(Exception e) {

            e.printStackTrace();

        }

    }

    public static void push(int value, int whichStack) throws Exception {

        if(stackPointers[whichStack] == size - 1) {

            throw new Exception("Stack is full");

        }

        stackPointers[whichStack]++;

        // should probably make a separate function for this...
        stacks[whichStack * size + stackPointers[whichStack]] = value;

    }

    public static int pop(int whichStack) throws Exception {

        if(stackPointers[whichStack] == -1) {

            throw new Exception("Stack is empty");

        }

        int value = stacks[whichStack * size + stackPointers[whichStack]];

        stacks[whichStack * size + stackPointers[whichStack]] = 0;

        stackPointers[whichStack]--;

        return value;

    }

    public static int peek(int whichStack) {

        return stacks[whichStack * size + stackPointers[whichStack]];

    }

    public static boolean isEmpty(int whichStack) {

        return stackPointers[whichStack] == -1;

    }

}
