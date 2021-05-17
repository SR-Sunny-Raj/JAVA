import java.util.Date;

public class Transaction {
    private char type;
    private double amount;
    private double balance;
    private Date dateCreated;
    private String description;

    public Transaction(char type, double amount, double balance, String description) {
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
        dateCreated = new Date();
    }
}
