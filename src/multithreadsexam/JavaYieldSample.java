package multithreadsexam;

public class JavaYieldSample extends Thread {
    public void run() {
        for (int i = 0; i < 3; i++)
            System.out.println(Thread.currentThread().getName() + " in control");
    }

    public static void main(String[] args) {

        JavaYieldSample t1 = new JavaYieldSample();
        JavaYieldSample t2 = new JavaYieldSample();

        t1.start();
        t2.start();

        for (int i = 0; i < 3; i++) {
            // Control passes to child thread
            t1.yield();
            System.out.println(Thread.currentThread().getName() + " in control");
        }
    }
}
