package exceptionshandl;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CheckedExamples {

    public static void main(String[] args) {
//        try {
//            FileWriter myWriter = new FileWriter("harsha.txt");
//            myWriter.write("Files in Java might be tricky, but it is fun enough!");
//            myWriter.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Name");
        String name = null;
        try {
            name = scanner.nextLine();
            System.out.println("name is very long " + name.substring(0, 10));
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } catch (StringIndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }
}
