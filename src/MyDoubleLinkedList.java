public class MyDoubleLinkedList {
    Node head;

    static class Node{
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
        }
    }

    public void push(int data){
        Node node = new Node(data);

        node.next = head;
        node.prev = null;

        if(head != null){
            head.prev = node;
        }

        head = node;
    }
}
