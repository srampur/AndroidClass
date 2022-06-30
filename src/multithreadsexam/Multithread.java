package multithreadsexam;

public class Multithread {

    public static void main(String[] args) {
        int n = 8; // Number of threads
        for (int i = 0; i < n; i++) {
//            MultithreadingExampl object = new MultithreadingExampl();
            Thread object = new Thread(new MultithreadingExampl());
            object.start();
        }
    }
}
