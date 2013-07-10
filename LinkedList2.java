// 2.2 - Implement an algorithm to find the kth to last element of a singly linked list

public class LinkedList2 {

    public static void main(String[] args) {

        LinkedListNode head = new LinkedListNode(1);
        LinkedListNode n1 = new LinkedListNode(3);
        LinkedListNode n2 = new LinkedListNode(5);
        LinkedListNode n3 = new LinkedListNode(2);
        LinkedListNode n4 = new LinkedListNode(8);
        LinkedListNode n5 = new LinkedListNode(6);
        LinkedListNode n6 = new LinkedListNode(10);
        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        
        LinkedListNode.printList(head);

        findKthElement(head, 3);

    }

    public static void findKthElement(LinkedListNode node, int k) {

        LinkedListNode head = node;
        LinkedListNode current = node;

        int counter = 0;

        while(current != null) {

            counter++;
            current = current.next;

        }

        int i = 0;

        while(head != null && (i != (counter - k))) {

            head = head.next;
            i++;

        }

        System.out.println(k + "th to last element is: " + head.getData());

    }

}
