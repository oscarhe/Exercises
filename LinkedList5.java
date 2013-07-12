// 2.5 - You have two numbers represented by a linked list, where each node contains a single digit. The digits are stored in reverse order, such that the 1's digit is at the head of the list. Write a function that adds the two numbers and returns the sum as a linked list.

public class LinkedList5 {

    public static void main(String[] args) {

        LinkedListNode ones1 = new LinkedListNode(5);
        LinkedListNode tens1 = new LinkedListNode(2);
        LinkedListNode hundreds1 = new LinkedListNode(9);
        ones1.next = tens1; tens1.next = hundreds1;

        LinkedListNode ones2 = new LinkedListNode(1);
        LinkedListNode tens2 = new LinkedListNode(2);
        LinkedListNode hundreds2 = new LinkedListNode(3);
        ones2.next = tens2; tens2.next = hundreds2;

        LinkedListNode.printList(ones1);
        System.out.println();
        LinkedListNode.printList(ones2);
        System.out.println();

        LinkedListNode sum1 = calculateRev(ones1, ones2, 0);

        LinkedListNode.printList(sum1);
        System.out.println();

        LinkedListNode sum2 = calculate(ones1, ones2, 0);

    }

    public static LinkedListNode calculateRev(LinkedListNode op1, LinkedListNode op2, int carry) {

        LinkedListNode result = null;
        int value = carry;

        if(op1 == null && op2 == null) return null;

        if(op1 != null) {

            value += (int)op1.data;

        }

        if(op2 != null) {

            value += (int)op2.data;

        }

        if(value > 9) {

            carry = 1;
            value -= 10;

        } else {
            
            carry = 0;

        }

        LinkedListNode node = new LinkedListNode(value);
        
        result = node;

        if(op1 != null || op2 != null) {

            LinkedListNode next = calculateRev(op1 == null ? null : op1.next, op2 == null ? null : op2.next, carry);
            
            result.next = next;

        }

        return result;

    }

}
