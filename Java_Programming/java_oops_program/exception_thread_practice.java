class NewThread extends Thread {
    int n;
    NewThread(int n) {
        // Create a new second thread
        super("Thread");
        this.n = n;
        System.out.println("Child Thread: " + this.n);
        start();
    }
    // This is the entry point of the second thread
    public void run() {
        try {
            for(int i = 1;i<=10;i++) {
                System.out.println(n+"X"+i+"="+(n*i));
                Thread.sleep(500);
            }
        }
        catch(InterruptedException e) {
            System.out.println("Child interrupt.");
        }
        System.out.println("Exiting child thread");
    }
}

public class exception_thread_practice {
    public static void main(String[] args) {
        NewThread t1 = new NewThread(2);
        NewThread t2 = new NewThread(4);
        NewThread t3 = new NewThread(5);

    }
}
