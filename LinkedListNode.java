public class LinkedListNode {

    public Object data;
    public LinkedListNode next;
        
    public LinkedListNode(Object data) {

        this.data = data;

    }

    public static void printList(LinkedListNode node) {

        while(node != null) {

            System.out.print(node.data);
            if(node.next != null) {

                System.out.print(" --> ");

            }
            node = node.next;

        }

        System.out.println();

    }
    
}
