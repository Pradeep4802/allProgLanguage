// 1. Performing single task from single thread

// public class Threading_diff_case_SP extends Thread {
// public void run() {
// System.out.println("task 1");
// }

// public static void main(String[] args) {
// Threading_diff_case_SP thread1 = new Threading_diff_case_SP();
// thread1.start();
// }
// }

// 2. Performing single task from multiple thread
// public class Threading_diff_case_SP extends Thread {
//     public void run() {
//         System.out.println("task 1");
//     }

//     public static void main(String[] args) {
//         Threading_diff_case_SP thread1 = new Threading_diff_case_SP();
//         thread1.start();

//         Threading_diff_case_SP thread2 = new Threading_diff_case_SP();
//         thread2.start();

//         Threading_diff_case_SP thread3 = new Threading_diff_case_SP();
//         thread3.start();
//     }
// }

// 3. Performing multiple task from single thread is not possible bcoz  multiple task cannot happen from single thread

// 4. Performing multiple task from multiple thread
class meraThread1 extends Thread {
    public void run() {
        System.out.println("playing music");
    }
}

class meraThread2 extends Thread {
    public void run() {
        System.out.println("progress bar is executing");
    }
}

class meraThread3 extends Thread {
    public void run() {
        System.out.println("Today is sports day's");
    }
}

class meraThread4 extends Thread {
    public void run() {
        System.out.println("Timer is executing");
    }
}

public class Threading_diff_case_SP {
    public static void main(String[] args) {
        meraThread1 t1 = new meraThread1();
        t1.start();

        meraThread2 t2 = new meraThread2();
        t2.start();

        meraThread3 t3 = new meraThread3();
        t3.start();

        meraThread4 t4 = new meraThread4();
        t4.start();
    }
}
