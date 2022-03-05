import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        // Creating a HashMap
        HashMap<String, Integer> points = new HashMap<String, Integer>();

        // Adding values to the HashMap
        points.put("Sunny", 1);
        points.put("Raj", 10);
        points.put("Gullu", 3);
        points.put("Bunny", 2);
        points.put("Honey", 5);

        // Looping through keys in HashMap
        for (String i : points.keySet()) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Looping through values in HashMap
        for (int i : points.values()) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Looping through HashMap and printing both the keys and values
        for (String str : points.keySet()) {
            System.out.println("Key is -: " + str + " and it's corresponding value is -: " + points.get(str));
        }
        System.out.println();

        System.out.println(points.size());
        points.remove("Honey");
        System.out.println(points.size());
        points.clear();
        System.out.println(points.size());
    }
}
