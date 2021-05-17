import java.util.ArrayList;
import java.util.Scanner;

public class Client {
    private int id;
    private String name;
    private String phone;
    private ArrayList<Account> accounts;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    Scanner input = new Scanner(System.in);

    public Client(int id, String name, String phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;

        accounts = new ArrayList<>();
    }

    public boolean addAccount(Account account) {
        System.out.print("Enter account id , balance and annualInterestRate -: ");
        accounts.add(account);
        System.out.println("Account added Successfully.");
        return true;
    }

    public boolean removeAccount(int accountID) {
        for (Account account : accounts) {
            if (account.getID() == accountID) {
                accounts.remove(account);
                return true;
            }
        }
        return false;
    }

    public String toString() {
        String s = this.id + " " + this.name + " " + this.phone + "\n";
        for (Account account : accounts) {
            s += account.toString() + "\n";
        }
        return s;
    }
}
