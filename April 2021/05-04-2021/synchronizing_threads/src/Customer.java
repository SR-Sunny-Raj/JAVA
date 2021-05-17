import java.util.Scanner;

public class Customer implements Runnable {
    private Account account;
    private String name;
    private int amt;

    public Customer(Account a, String n) {
        this.account = a;
        name = n;
    }

    public void run() {
        synchronized (account) {
            Scanner amnt = new Scanner(System.in);
            System.out.print("Name -: " + name + "\nEnter ammount to withdraw -: ");
            amt = amnt.nextInt();
            account.withdraw(amt, name);
        }
    }
}
