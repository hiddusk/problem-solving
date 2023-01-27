package stack;

public class StackExample {
    private static Node top;
    public static void main(String[] args) {
        push(10);
        push(20);
        push(30);
        push(40);
        print();
        pop();
        print();

    }

    public static void push(int n) {
        Node temp = new Node(n);
        temp.setNext(top);
        top = temp;
    }

    public static void pop() {
        top = top.getNext();
    }

    public static void print() {
        Node current = top;
        while(current!=null) {
            System.out.println(current.getData());
             current = current.getNext();
        }
    }
}
