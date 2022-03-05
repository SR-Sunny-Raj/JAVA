import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        // Creating an arraylist of String type
        ArrayList<String> names = new ArrayList<>();

        // Adding items to the arraylist
        names.add("Sunny Raj");
        names.add("Bunny Raj");
        names.add("Kumar");
        names.add("Ritesh Kumar");
        names.add("Akash Priyadarshi");

        for (String i : names) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Getting item from the arraylist
        String str1 = names.get(0);
        System.out.println(str1);

        // Changing an item in the arraylist
        names.set(2, "new name");

        // Looping through the arraylist
        for (String i : names) {
            System.out.print(i + " ");
        }

        // Removing a item from an arraylist
        names.remove("Ritesh Kumar");
        System.out.println();
        for (String i : names) {
            System.out.print(i + " ");
        }
        System.out.println();
        names.remove(2);
        for (String i : names) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Getting size of the arraylist
        System.out.println("Size of the arraylist is -: " + names.size());

        // Sorting the arraylist
        Collections.sort(names);
        for (String i : names) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Clearing an arraylist
        names.clear();
        System.out.println("Size of the arraylist is -: " + names.size());
    }
}
