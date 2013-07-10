// 2.3 - Implement an algorithm to delete a node in the middle of a singly linked list, given only access to that node.

public class LinkedList3 {

    public static void main(String[] args) {

        LinkedListNode n1 = new LinkedListNode(1);
        LinkedListNode n2 = new LinkedListNode(5);
        LinkedListNode n3 = new LinkedListNode(3);
        LinkedListNode n4 = new LinkedListNode(8);
        LinkedListNode n5 = new LinkedListNode(7);
        LinkedListNode n6 = new LinkedListNode(4);
        LinkedListNode n7 = new LinkedListNode(5);
        LinkedListNode n8 = new LinkedListNode(9);
                
        n1.next = n2; n2.next = n3; n3.next = n4; n4.next = n5; n5.next = n6; n6.next = n7; n7.next = n8;

        //LinkedListNode.printList(n1);

        //deleteMiddleNode(n4);
        //System.out.println();

        LinkedListNode.printList(n1);

        deleteMiddleNode(n7);
        System.out.println();

        LinkedListNode.printList(n1);
    }

    public static void deleteMiddleNode(LinkedListNode node) {

        if(node.next != null) {

            node.data = node.next.data;
            node.next = node.next.next;

        }

    }

}
