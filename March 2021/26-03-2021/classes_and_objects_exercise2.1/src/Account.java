import java.util.ArrayList;
import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;
    private Client client;

    private ArrayList<Transaction> transactions;

    public Account(int id, double balance, double annualInterestRate, Client client) {
        this.client = client;
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        this.transactions = new ArrayList<>();
        dateCreated = new Date();
    }

    public boolean withdraw(double withdraw) {
        if (balance < withdraw) {
            System.out.println("Insufficient balance!");
            return false;
        } else {
            balance -= withdraw;
            this.transactions.add(new Transaction('W', withdraw, this.balance, "Withdrawn " + withdraw));
            return true;
        }
    }

    public void deposit(double deposit) {
        balance += deposit;
        this.transactions.add(new Transaction('D', deposit, this.balance, "Deposited " + deposit));
    }

    public void setID(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public int getID() {
        return this.id;
    }

    public double getBalance() {
        return this.balance;
    }

    public double getAnnualInterestRate() {
        return this.annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public String toString() {
        return this.id + " " + this.balance + " " + this.annualInterestRate + " " + this.dateCreated;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
