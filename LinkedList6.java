// 2.6 - Given a circular linked list, implement an algorithm that returns the node at the beginning of the loop.

public class LinkedList6 {

    public static void main(String[] args) {

        LinkedListNode n1 = new LinkedListNode(1);
        LinkedListNode n2 = new LinkedListNode(2);
        LinkedListNode n3 = new LinkedListNode(3);
        LinkedListNode y1 = new LinkedListNode(4);
        LinkedListNode y2 = new LinkedListNode(5);
        LinkedListNode y3 = new LinkedListNode(6);
        LinkedListNode y4 = new LinkedListNode(7);
        LinkedListNode y5 = new LinkedListNode(8);

        n1.next = n2; n2.next = n3; n3.next = y1; y1.next = y2; y2.next = y3; y3.next = y4; y4.next = y5; y5.next = y1;

        LinkedListNode nodeAtHeadOfLoop = getNodeAtHeadOfLoop(n1);
        
        System.out.println("Should return " + y1.data + ", Returns: " + nodeAtHeadOfLoop.data);

    }

    public static LinkedListNode getNodeAtHeadOfLoop(LinkedListNode n) {

        LinkedListNode headOfPureLoop = n;
        LinkedListNode slow = n;
        LinkedListNode fast = n;
        
        do {

            if(fast == null || slow == null) {

                return null;

            }

            slow = slow.next;
            fast = fast.next.next;
            
        } while(slow != fast);

        if(slow == fast && slow == headOfPureLoop) {

            return headOfPureLoop;

        } else {

            slow = n;
            
            while(slow != fast) {

                slow = slow.next;
                fast = fast.next;

            }

            return slow;

        }

    }

}
