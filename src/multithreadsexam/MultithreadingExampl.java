package multithreadsexam;

public class MultithreadingExampl implements Runnable {
    //    @Override
//    public void run() {
//
//    }

    public void run() {
        System.out.println(
                "Thread " + Thread.currentThread().getId()
                        + " is running");
    }
}
