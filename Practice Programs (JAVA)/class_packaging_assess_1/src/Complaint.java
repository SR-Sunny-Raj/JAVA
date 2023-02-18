public class Complaint {
    private String complaint;
    private Customer customer;

    Complaint() {
        complaint = "";
        this.customer.setName("");
        this.customer.setId("");
        this.customer.setCountry("");
    }

    Complaint(String complaint, Customer customer) {
        this.complaint = complaint;
        // Customer customer1 = new Customer();
        this.customer = customer;
    }

    public void display() {
        System.out.println("Name : " + this.customer.getName() + " ID : " + this.customer.getId() + " Country : "
                + this.customer.getCountry() + " Complaint : " + this.complaint);
    }
}
