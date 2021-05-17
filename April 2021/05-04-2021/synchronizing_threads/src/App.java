public class App {
    public static void main(String[] args) throws Exception {
        Account a1 = new Account(1000);
        Customer c1 = new Customer(a1, "Sunny Raj");
        Customer c2 = new Customer(a1, "Mummy");
        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);
        t1.start();
        t2.start();
    }
}
