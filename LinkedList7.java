// 2.7 - Implement a function to check if a linked list is a palindrome.

import java.util.Stack;

public class LinkedList7 {

    public static void main(String[] args) {

        LinkedListNode n1 = new LinkedListNode(1);
        LinkedListNode n2 = new LinkedListNode(2);
        LinkedListNode n3 = new LinkedListNode(3);
        LinkedListNode n4 = new LinkedListNode(2);
        LinkedListNode n5 = new LinkedListNode(1);
        n1.next = n2; n2.next = n3; n3.next = n4; n4.next = n5;

        isPalindrome(n1);

    }

    public static void isPalindrome(LinkedListNode node) {

        Stack<LinkedListNode> stack = new Stack<LinkedListNode>();

        LinkedListNode head = node;

        if(node == null) {

            return;

        }

        while(node != null) {

            stack.push(node);
            node = node.next;

        }

        while(stack.empty() != true) {

            LinkedListNode n = stack.pop();
            
            if(head.data != n.data) {

                System.out.println("Not a palindrome");
                return;

            }

            head = head.next;

        }

        System.out.println("Is a palindrome");

    }

}
