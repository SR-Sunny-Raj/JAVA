import java.util.Scanner;
import java.lang.String;

public class App {
    public static void main(String[] args) {
        // fill your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose Account Type\n1.Savings Account\n2.Current Account");
        int num = sc.nextInt();
        System.out.println(
                "Enter Account details in comma separated(Account Name,Account Number,Bank Name,Organisation Name)");
        String str = sc.next();
        String[] arr = str.split(",");
        if (num == 1) {
            SavingsAccount objSavingAccount = new SavingsAccount(arr[0], arr[1], arr[2], arr[3]);
            objSavingAccount.display();
        } else {
            CurrentAccount objCurrentAccount = new CurrentAccount(arr[0], arr[1], arr[2], arr[3]);
            objCurrentAccount.display();
        }
        sc.close();
    }
}
