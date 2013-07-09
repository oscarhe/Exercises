
// Write code to remove duplicates from an unsorted linked list. How would you solve this problem if a temporary buffer is not allowed?

import java.util.HashMap;

public class LinkedList1 {

    public static void main(String[] args) {

        LinkedListNode head = new LinkedListNode(2);
        LinkedListNode n1 = new LinkedListNode(5);
        head.next = n1;
        LinkedListNode n2 = new LinkedListNode(2);
        n1.next = n2;
        LinkedListNode n3 = new LinkedListNode(3);
        n2.next = n3;
        LinkedListNode n4 = new LinkedListNode(4);
        n3.next = n4;
        LinkedListNode n5 = new LinkedListNode(3);
        n4.next = n5;
        LinkedListNode.printList(head);

        removeDup(head);
    
        removeDupNoBuffer(head);

    }

    public static void removeDup(LinkedListNode node) {

        HashMap map = new HashMap();

        LinkedListNode prev = null;
        LinkedListNode head = node;

        while(node != null) {

            if(!(map.containsKey(node.getData()))) {

                prev = node;
                map.put(node.getData(), true);

            } else {

                prev.next = node.next;

            }

            node = node.next;

        }
        
        LinkedListNode.printList(head);       

    }

    public static void removeDupNoBuffer(LinkedListNode node) {

        LinkedListNode head = node;
        LinkedListNode curr = node;

        while(curr != null) {

            LinkedListNode check = curr;

            while(check.next != null) {

                if(curr.data == check.next.data) {

                    check.next = check.next.next;

                } else {

                    check = check.next;

                }

            }

            curr = curr.next;

        }

        LinkedListNode.printList(head);

    }

}
