package deadlock;

public class Writer implements Runnable {
    Object a, b;

    public Writer(Object a, Object b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void run() {
        synchronized (a) {
            System.out.println("Writer got lock on a");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (b) {
                System.out.println("Writer got lock on b");
            }
        }
    }
}
