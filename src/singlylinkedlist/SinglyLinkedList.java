package singlylinkedlist;

public class SinglyLinkedList {
    private static Node head;
    public static void main(String[] args) {
        head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);
        head.setNext(second);
        second.setNext(third);
        third.setNext(fourth);

        insertAtEnd();
        deleteAtEnd();
        countElements();
        readAll();
    }

    public static void readAll() {
        Node current = head;
        while(current!=null) {
            System.out.println(current.getValue());
            current = current.getNext();
        }
    }

    public static void countElements() {
        Node current = head;
        int count=0;
        while(current!=null) {
            count++;
            current = current.getNext();
        }
        System.out.println(count);
    }

    public static void insertAtBegging() {
        Node newHead = new Node(5);
        newHead.setNext(head);
        head = newHead;
    }

    public static void deleteAtBegging() {
        Node temp = head.getNext();
        head = temp;
    }

    public static void insertAtEnd() {
        Node end = new Node(50);
        Node current = head;
        Node previous = null;
        while(current!=null) {
            previous = current;
            current = current.getNext();
        }
        previous.setNext(end);
    }

    public static void deleteAtEnd() {
        Node current = head;
        Node previous = null;
        while(current.getNext()!=null) {
            previous = current;
            current = current.getNext();
        }
        previous.setNext(null);
    }
}
