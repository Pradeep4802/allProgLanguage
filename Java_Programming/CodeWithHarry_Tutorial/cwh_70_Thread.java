class MyThread1 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 40000) {
            System.out.println("My cooking thread1 is running");
            System.out.println("I am happy!");
        }
    }
}

class MyThread2 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 40000 ) {
            System.out.println("Thread 2 for chatting with her");
            System.out.println("I am sad!");
        }
    }
}

public class cwh_70_Thread {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();
    }
}