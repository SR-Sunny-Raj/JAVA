import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print(
                    "\n1. Add an element\n2. Remove an element\n3. Display elements\n4. Exit\nSelect your option from the following -: ");
            int ch = input.nextInt();
            switch (ch) {
            case 1:
                add(arr);
                break;
            case 2:
                remove(arr);
                break;
            case 3:
                display(arr);
                break;
            case 4:
                System.out.println("Bye.🙏");
                System.exit(0);
                break;
            default:
                System.out.println("\nInvalid Choice!! Please make a valid choice.\n");
                break;
            }
        }
    }

    private static void display(ArrayList<Integer> arr) {
        System.out.println("\nOur arraylist is -: " + arr);
    }

    private static void remove(ArrayList<Integer> arr) {
        if (arr.size() == 0) {
            System.out.println("\nNo elements to remove from the list.\n");
        } else {
            System.out.print("\nEnter the index of the value you want to remove from the list -: ");
            int i = new Scanner(System.in).nextInt();
            if (i >= 0 && i < arr.size()) {
                arr.remove(i);
                System.out.println("\nElement removed from the list.\n");
            } else {
                System.out.println("\nInvalid index!! Please specify a valid index number.\n");
                remove(arr);
            }
        }
    }

    private static void add(ArrayList<Integer> arr) {
        System.out.print("\nEnter the value you want to add in the list :- ");
        arr.add((new Scanner(System.in)).nextInt());
        System.out.println("\nElement added to the list.\n");
    }
}
