import java.lang.*;

public class thread_demo extends Thread{
    @Override
    public void run() {
        System.out.println("thread task");
    }
    public static void main(String[] args) {
        thread_demo t = new thread_demo();
        t.start(); 
        // t.start();
    }
}
