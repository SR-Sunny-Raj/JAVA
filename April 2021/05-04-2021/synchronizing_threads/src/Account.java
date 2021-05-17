public class Account {
    private int balance;

    public Account(int balance) {
        this.balance = balance;
    }

    public boolean isSufficientBalance(int w) {
        if (w <= balance)
            return true;
        else
            return false;
    }

    public void withdraw(int w, String n) {
        if (isSufficientBalance(w)) {
            balance = balance - w;
            System.out.println(n + "\nWithdrawl amount -: " + w + "\nCurrent Balance -: " + balance);
        } else
            System.out.println("Insufficient Balance");
    }
}
