
// import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;

public class App {
    public static void main(String[] args) throws Exception {
        // Scanner input = new Scanner(System.in);
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your choice:\n1.Exhibition event\n2.Stage event");
        // int type = input.nextInt();
        int type = Integer.parseInt(input.readLine());
        if (type == 1) {
            System.out.println("Enter the details of exhibition:");
        } else {
            System.out.println("Enter the details of stage event:");
        }
        // input.next();
        // String str = input.nextLine();
        String str = input.readLine();
        String[] arr = str.split(",");
        double d = Double.parseDouble(arr[4]);
        int num = Integer.parseInt(arr[5]);

        System.out.println("Enter the starting date of the event:");
        // String start = input.next();
        String start = input.readLine();
        System.out.println("Enter the ending date of the event:");
        // String end = input.next();
        String end = input.readLine();

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date d1 = sdf.parse(start);
        Date d2 = sdf.parse(end);
        long diff_time = d2.getTime() - d1.getTime();

        int diff_date = (int) ((diff_time / (1000 * 60 * 60 * 24)) % 365);

        if (type == 1) {
            Exhibition obj = new Exhibition(arr[0], arr[1], arr[2], arr[3], d, num);
            System.out.println("The GST to be paid is Rs." + (diff_date * obj.getCostPerDay() * 0.05));
        } else {
            StageEvent obj = new StageEvent(arr[0], arr[1], arr[2], arr[3], d, num);
            System.out.println("The GST to be paid is Rs." + (diff_date * obj.getCostPerDay() * 0.15));
        }
        input.close();
    }
}
