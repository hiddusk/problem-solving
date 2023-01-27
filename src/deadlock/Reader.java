package deadlock;

public class Reader implements Runnable {
    Object a,b;

    public Reader(Object a, Object b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void run() {
        synchronized (a) {
            System.out.println("Reader got lock on b");
            synchronized (b) {
                System.out.println("Reader got lock on a");
            }
        }
    }
}
