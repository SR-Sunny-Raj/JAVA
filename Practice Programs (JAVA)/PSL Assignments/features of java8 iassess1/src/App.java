import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of bookings");
        int n = input.nextInt();
        input.nextLine();
        ArrayList<TicketBooking> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter customer name");
            String customerName = input.next();
            System.out.println("Enter number of tickets");
            int noOfTickets = input.nextInt();
            System.out.println("Enter the price");
            double price = input.nextDouble();
            TicketBooking obj = new TicketBooking(customerName, noOfTickets, price);
            arr.add(obj);
        }
        Collections.sort(arr);
        System.out.format("%-10s %-15s %-15s\n", "Customer", "No Of Tickets", "Price");
        arr.forEach((e) -> {
            System.out.format("%-10s %-15s %-15s\n", e.getCustomerName(), e.getNoOfTickets(), e.getPrice());
        });
        input.close();
    }
}
