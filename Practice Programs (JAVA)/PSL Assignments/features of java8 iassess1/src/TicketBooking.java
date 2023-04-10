public class TicketBooking implements Comparable<TicketBooking> {
    private String customerName;
    private int noOfTickets;
    private double price;

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setNoOfTickets(int noOfTickets) {
        this.noOfTickets = noOfTickets;
    }

    public int getNoOfTickets() {
        return noOfTickets;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    TicketBooking() {
    }

    TicketBooking(String customerName, int noOfTickets, double price) {
        this.customerName = customerName;
        this.noOfTickets = noOfTickets;
        this.price = price;
    }

    @Override
    public int compareTo(TicketBooking o) {
        if (price < o.getPrice()) {
            return -1;
        } else if (price > o.getPrice()) {
            return 1;
        }
        return 0;
    }

}
