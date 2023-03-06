package graph;

public class LinkedList {
    private Node head;

    public void add(int data) {
        if(head == null) {
            head = new Node(data);
        } else {
            Node current = head;
            while(current.getNext()!=null) {
                current = current.getNext();
            }
            current.setNext(new Node(data));
        }
    }

    public void print() {
        Node current = head;
        while(current!=null) {
            System.out.print(current.getData());
            current = current.getNext();
        }
    }
}
