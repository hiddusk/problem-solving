package interthreadcommunication;

public class InterThreadCommunicationExample {
    public static void main(String[] args) {
        Message message = new Message();
        Writer writer = new Writer(message);
        Reader reader = new Reader(message);

        Thread t1 = new Thread(writer);
        Thread t2 = new Thread(reader);
        t1.start();
        t2.start();
    }
}
