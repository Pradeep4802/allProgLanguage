// class MyRun implements Runnable {
//     public void run() {

//     }
// }

class MyThread extends Thread {
    // public MyThread(String name) {
    public MyThread() {
        // super(name);
        // setPriority(Thread.MIN_PRIORITY+2);
    }

    public void run() {
        int count = 1;
        while (true) {
            // System.out.println(count++);
            // try {
            // Thread.sleep(1000);
            // }
            // catch(InterruptedException e) {
            // System.out.println(e);
            // }
            System.out.println(count++);
        }
    }
}

public class ThreadMethod {
    public static void main(String[] args) {
        // Thread t = new Thread(new MyRun(), "My Name");
        // MyThread t = new MyThread("My Thread 1");
        MyThread t = new MyThread();
        // System.out.println("Id: " + t.getId());
        // System.out.println("Name: " + t.getName());
        // System.out.println("GetPriority: " + t.getPriority());
        t.setDaemon(true);
        t.start();
        // System.out.println("GetState: " + t.getState());
        // System.out.println("Is Alive: " + t.isAlive());
        // t.interrupt();
        try {
            Thread.sleep(100);
        } catch (Exception e) {

        }
    }
}
