package collectionsexam;

import java.util.*;

public class CollectionSample {

    public static void main(String[] args) {
        // MAP & sets


        //HAshset linkedhashset treeset

//        HashSet<String> fruits = new HashSet<>();
//        LinkedHashSet<String> fruits = new LinkedHashSet<>();
        TreeSet<String> fruits = new TreeSet<>();
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Lemon");
        fruits.add("Mango");
        fruits.add("Orange");
//        System.out.println(fruits);


//        HashMap<String, String> airportName = new HashMap<>();
//        LinkedHashMap<String, String> airportName = new LinkedHashMap<>();
        TreeMap<String, String> airportName = new TreeMap<>();
        airportName.put("BLR", "Kempegowda");
        airportName.put("BND", "Bandar");
        airportName.put("HYD", "Hyderabad");
        airportName.put("DEL", "Delhi");
        airportName.put("BLR", "Kempegowda International Airport");
        airportName.put("MAA", "Chennai");
        airportName.put("MYQ", "Mysore");
        airportName.put("BLR", "Bangalore International Airport");


        airportName.remove("MAA");
        airportName.remove("MYQ","Delhi");

        System.out.println(airportName);

        for(Map.Entry m : airportName.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }



        Queue<Integer> numbers = new LinkedList<>();

        // enqueue
        // insert element at the rear of the queue
        numbers.offer(1);
        numbers.offer(2);
        numbers.offer(3);
        System.out.println("Queue: " + numbers);

        // dequeue
        // delete element from the front of the queue
        int removedNumber = numbers.poll();
        System.out.println("Removed Element: " + removedNumber);

        System.out.println("Queue after deletion: " + numbers);

    }
}
