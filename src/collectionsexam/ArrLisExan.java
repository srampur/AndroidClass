package collectionsexam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrLisExan {

    public static void main(String[] args) {
        ArrayList<String> csn = new ArrayList<>();

        ArrayList<String> wqe = new ArrayList<>();


        csn.add("Harsha");
        csn.add("how");
        csn.add("are");
        csn.add("you");
        csn.add("hope");
        csn.add("you");
        csn.add("are");
        csn.add(4,"are");
        csn.set(4,"cop");
        csn.add("doing");
        csn.add("well");



        wqe.add("Akshar");
        wqe.add("ask");
        wqe.add("me");
        wqe.add("the");
        wqe.add("questions");
        wqe.add("now");
//        wqe.add(10,"Harsha");
        wqe.add(3,"how");
        wqe.add(5,"are");
        wqe.add(1,"you");

        wqe.remove("ask");
        wqe.remove(4);
        wqe.get(4);
        wqe.indexOf("how");

        System.out.println(csn);
        System.out.println(wqe);


        ArrayList<String> modified =new ArrayList<>();
        modified.addAll(wqe);
        modified.addAll(csn);
        System.out.println(modified);


        String[] genius = {"Rahul", "Utkarsh",
                "Shubham", "Neelam"};

        List<String> al = Arrays.asList(genius);
        System.out.println(al);
    }
}
