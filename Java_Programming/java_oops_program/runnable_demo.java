public class runnable_demo implements Runnable{
    @Override
    public void run() {
        System.out.println("thread task 2");
    }
    public static void main(String[] args) {
        runnable_demo t = new runnable_demo();
        Thread th = new Thread(t);
        th.start();
    }
}
