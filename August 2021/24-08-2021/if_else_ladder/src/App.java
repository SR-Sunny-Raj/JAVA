import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the marks obtained -: ");
        int marks = input.nextInt();
        if (marks > 90)
            System.out.println("You obtained A grade");
        else if (marks > 80)
            System.out.println("You obtained B grade");
        else if (marks > 70)
            System.out.println("You obtained C grade");
        else if (marks > 50)
            System.out.println("You obtained D grade");
        else if (marks > 30)
            System.out.println("You merely passed bro. Please study hard");
        else
            System.out.println("You failed the exam. Try your luck next time");
        input.close();
    }
}
