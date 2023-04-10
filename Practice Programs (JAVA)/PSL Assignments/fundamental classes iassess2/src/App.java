import java.text.SimpleDateFormat;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of Events");
        int n = input.nextInt();
        input.nextLine();
        System.out.println("Enter event details in CSV(Event Name,Start Date,End Date) Date:dd/MM/yyyy");
        ArrayList<Event> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String str = input.nextLine();
            String[] srr = str.split(",");
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date startDate = sdf.parse(srr[1]);
            Date endDate = sdf.parse(srr[2]);
            Event obj = new Event(srr[0], startDate, endDate);
            arr.add(obj);
        }

        System.out.println("1-day Events:");
        int flag = 0;
        for (Event e : arr) {
            if (e.getStartDate().compareTo(e.getEnDate()) == 0) {
                System.out.println(e.getEventName());
                flag = 1;
            }
        }
        if (flag == 0) {
            System.out.println("No Events");
        }

        input.close();
    }
}
