import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of events");
        int n = input.nextInt();
        input.nextLine();
        ArrayList<Event> arr = new ArrayList<>();
        System.out.println("Enter event details in CSV(Event Name,Organiser Name,Event Cost)");
        for (int i = 0; i < n; i++) {
            String str = input.nextLine();
            String[] srr = str.split(",");
            Event obj = new Event(srr[0], srr[1], Double.parseDouble(srr[2]));
            arr.add(obj);
        }
        Event obj = new Event();
        obj.display(arr);
        input.close();
    }
}
