package queue;

public class QueueExample {
    private static Node front;
    private static Node rear;
    public static void main(String[] args) {
        enqueue(10);
        enqueue(20);
        enqueue(30);
        enqueue(40);
        print();
        dequeue();
        print();
    }

    public static void enqueue(int n) {
        Node temp = new Node(n);
        if(front==null) {
            front = temp;
            rear = temp;
        } else {
            rear.setNext(temp);
            rear = temp;
        }
    }

    public static void dequeue() {
        front = front.getNext();
    }

    public static void print() {
        Node current = front;
        while(current !=null) {
            System.out.println(current.getData());
            current = current.getNext();
        }
    }
}
