package doublylinkedlist;

public class DoublyLinkedList {
    private static Node head;
    public static void main(String[] args) {
        head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);
        head.setNext(second);
        second.setNext(third);
        second.setPrevious(head);
        third.setPrevious(second);
        third.setNext(fourth);
        fourth.setPrevious(third);

        insertAtEnd();
        deleteAtEnd();
        printElements();
    }

    public static void printElements() {
        Node current = head;
        while(current !=null) {
            System.out.println(current.getValue());
            current = current.getNext();
        }
    }

    public static void insertAtBegging() {
        Node newHead = new Node(5);
        newHead.setNext(head);
        head.setPrevious(newHead);
        head=newHead;
    }

    public static void deleteAtBegging() {
        head = head.getNext();
        head.setPrevious(null);
    }

    public static void insertAtEnd() {
        Node current = head;
        Node previous=null;
        while(current!=null) {
            previous = current;
            current = current.getNext();
        }
        Node newEnd = new Node(50);
        previous.setNext(newEnd);
        newEnd.setPrevious(previous);
    }

    public static void deleteAtEnd() {
        Node current = head;
        Node previous=null;
        while(current.getNext()!=null) {
            previous = current;
            current = current.getNext();
        }
        previous.setNext(null);
    }
}
