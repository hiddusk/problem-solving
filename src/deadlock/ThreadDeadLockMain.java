package deadlock;

public class ThreadDeadLockMain {
    public static void main(String[] args) {
        Object a = new Object();
        Object b = new Object();

        Thread t1 = new Thread(new Writer(a,b));
        Thread t2 = new Thread(new Reader(a,b));
        t1.start();
        t2.start();

    }
}
