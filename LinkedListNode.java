public class LinkedListNode<E> {

    E data;
    LinkedListNode<E> next;
        
    public LinkedListNode(E data) {

        this.data = data;

    }

    public E getData() {

        return data;

    }

    public void setData(E data) {

        this.data = data;

    }

    public static void printList(LinkedListNode node) {

        while(node != null) {

            System.out.println(node.data);
            node = node.next;

        }

    }
    
}
