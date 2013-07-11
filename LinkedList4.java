// 2.4 - Write code to partition a linked list around a value x, such that all nodes less than x come before all nodes greater than or equal to x.

public class LinkedList4 {

    public static void main(String[] args) {

        LinkedListNode n1 = new LinkedListNode(9);
        LinkedListNode n2 = new LinkedListNode(8);
        LinkedListNode n3 = new LinkedListNode(7);
        LinkedListNode n4 = new LinkedListNode(6);
        LinkedListNode n5 = new LinkedListNode(5);
        LinkedListNode n6 = new LinkedListNode(4);
        LinkedListNode n7 = new LinkedListNode(3);
        LinkedListNode n8 = new LinkedListNode(2);
        
        n1.next = n2; n2.next = n3; n3.next = n4; n4.next = n5; n5.next = n6; n6.next = n7; n7.next = n8;
        
        LinkedListNode.printList(n1);   
        
        partitionX(n1, 5);     

    }

    public static void partitionX(LinkedListNode head, int x) {
        
        LinkedListNode lessThan = null;
        LinkedListNode greaterThan = null;
        boolean firstLess = false;
        boolean firstGreater = false;

        LinkedListNode firstNodeLess = null;
        LinkedListNode firstNodeGreater = null;

        while(head != null) {

            if((int)head.data < x && firstLess == false) {

                lessThan = head;
                firstLess = true;
                firstNodeLess = lessThan;

            } else if((int)head.data < x) {

                lessThan.next = head;
                lessThan = lessThan.next;

            } else if((int)head.data >= x && firstGreater == false) {

                greaterThan = head;
                firstGreater = true;
                firstNodeGreater = greaterThan;

            } else if((int)head.data >= x) {

                greaterThan.next = head;
                greaterThan = greaterThan.next;

            } 

            head = head.next;

        }

        lessThan.next = firstNodeGreater;
        greaterThan.next = null;

        LinkedListNode.printList(firstNodeLess);

    }

}
