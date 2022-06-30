package stringshand;

import java.util.Locale;
import java.util.StringJoiner;

public class StringExam {

    public static void main(String[] args) {

        String s1 = "Akshar";
        String s2 = "Siddu";
        String s3 = "Harsha";

        String s4 = new String("Siddu");

        String s5 = "Akshar";
        String s6 = new String("Akshar");


//        System.out.println(s1==s5);
//        System.out.println(s1==s6);
//        System.out.println(s1.equals(s6));

        //Java offers both the equals() method and the "==" operator for comparing objects. However, here are some differences between the two:
        //Essentially, equals() is a method, while == is an operator.
        //The == operator can be used for comparing references (addresses) and the .equals()
        // method can be used to compare content. To put it simply, == checks if the objects point to the same
        // memory location, whereas .equals() compares the values of the objects.


        // split, compareto,comtoignor,length,substring,equal & igonor case,contains,trim,chartat,tolower,toupper,concat


        String hello = " Hey Harsha how are you and how is life?";
        String hello1 = "Can we meet soon";

        System.out.println(hello.length());
        System.out.println(hello.indexOf("how"));
        System.out.println(hello.charAt(8));
        System.out.println(hello.toUpperCase(Locale.ROOT));
        System.out.println(hello.toLowerCase(Locale.ROOT));
        System.out.println(hello.concat(hello1));
        System.out.println(hello+" "+(hello1));
        System.out.println(hello.substring(hello.indexOf("how")));


        String[] words = hello.trim().split(" ");

//        for (String ad : words) {
//            System.out.println(ad);
//        }


//        String na = "Hello harshA";
//        String na1 = "Hello harsha";
//
//        System.out.println(na.compareToIgnoreCase(na1));
//
//
//        System.out.println(na.equals(na1));
//        System.out.println(na.equalsIgnoreCase(na1));

        StringJoiner joinStrings = new StringJoiner(" ", "(", ")");
        // passing comma(,) and square-brackets as delimiter

        // Adding values to StringJoiner
        joinStrings.add("Scaler");
        joinStrings.add("By");
        joinStrings.add("InterviewBit");
        System.out.println(joinStrings);


        //sore
        //roes

//        Anagrams palindrome
//


    }
}
