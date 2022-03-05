import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) throws Exception {
        // LocalDate
        LocalDate var1 = LocalDate.now();
        System.out.println(var1);

        // LocalTime
        LocalTime var2 = LocalTime.now();
        System.out.println(var2);

        // LocalDateTime
        LocalDateTime var3 = LocalDateTime.now();
        System.out.println(var3);

        // DateTime Formatter
        DateTimeFormatter obj1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String var4 = var3.format(obj1);
        System.out.println(var4);
    }
}
