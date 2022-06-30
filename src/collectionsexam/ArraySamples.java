package collectionsexam;

public class ArraySamples {

    public static void main(String[] args) {
        String[] sdf = new String[]{"Hello", "How"};
        String[] arr = new String[10];

        arr[0] = "Hey";
        arr[9] = "How";

        sdf[1] = "Harsha";
        for (String dsf : arr) {
            System.out.println(dsf);
        }

        for (String sdfs : sdf) {
            System.out.println(sdfs);
        }

    }
}
