
class MyNewThread1 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (true) {
            System.out.println("Thank You!!");
            // System.out.println("I am happy!");
            try {
                Thread.sleep(455);
            } catch (InterruptedException e) {
                // TODO: handle exception
                e.printStackTrace();
            }
            i++;
        }
    }
}

class MyNewThread2 extends Thread {
    @Override
    public void run() {
        // int i = 0;
        while (true) {
            System.out.println("My Thank You!!");
            // System.out.println("I am sad!");
        }
    }
}

public class cwh_75_thread_method {
    public static void main(String[] args) {
        MyNewThread1 t1 = new MyNewThread1();
        MyNewThread2 t2 = new MyNewThread2();
        t1.start();
        // try {
        //     t1.join();
        // } catch (Exception e) {
        //     // TODO: handle exception
        //     System.out.println(e);
        // }
        // t1.join();
        t2.start();
    }
}
