public class LinkedListNode {

    Object data;
    LinkedListNode next;
        
    public LinkedListNode(Object data) {

        this.data = data;

    }

    public Object getData() {

        return data;

    }

    public void setData(Object data) {

        this.data = data;

    }

    public static void printList(LinkedListNode node) {

        while(node != null) {

            System.out.println(node.data);
            node = node.next;

        }

    }
    
}
