public class App {
    public static void main(String[] args) throws Exception {
        Account testAccount = new Account(1122, 20000, 4.5);
        if (testAccount.withdraw(2500))
            System.out.println("Withdraw Successful.");
        else
            System.out.println("Withdraw not successful.");
        testAccount.deposit(3000);
        printAccountInfo(testAccount);
    }

    public static void printAccountInfo(Account testAccount) {
        System.out.println("Account ID -: " + testAccount.getID() + "\nBalance -: " + testAccount.getBalance()
                + "\nAnnual Interest Rate -: " + testAccount.getAnnualInterestRate());
        System.out.println("Account creation date :- " + testAccount.getDateCreated());
    }
}
