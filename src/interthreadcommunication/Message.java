package interthreadcommunication;

public class Message {
    private String message = "";
    public void read() throws InterruptedException {
        synchronized (this) {
            if(message.isEmpty()) {
                wait();
            } else if(!message.isEmpty()) {
                message = "";
                System.out.println("message read");
            }
        }
    }

    public void write() throws InterruptedException {
        synchronized (this) {
            if (message.isEmpty()) {
                message = "Added";
                System.out.println("message added");
                notify();
            } else if(!message.isEmpty()) {
                wait();
            }
        }

    }
}
