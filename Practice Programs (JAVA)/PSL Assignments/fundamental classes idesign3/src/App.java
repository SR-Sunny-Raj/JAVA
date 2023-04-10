import java.util.*;
import java.text.SimpleDateFormat;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the date to be formatted:(MM-dd-yyyy)");
        String d = input.next();
        Date date = new SimpleDateFormat("MM-dd-yyyy").parse(d);

        SimpleDateFormat formatter = new SimpleDateFormat("EEE, MMM d, yy");
        String date1 = formatter.format(date);

        formatter = new SimpleDateFormat("dd.MM.yyyy");
        String date2 = formatter.format(date);

        formatter = new SimpleDateFormat("dd/MM/yyyy");
        String date3 = formatter.format(date);

        System.out.println("Date Format with EEE, MMM d, yy : " + date1 + "\nDate Format with dd.MM.yyyy : " + date2
                + "\nDate Format with dd dd/MM/yyyy : " + date3);
        input.close();
    }
}
