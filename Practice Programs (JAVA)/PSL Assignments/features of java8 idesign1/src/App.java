import java.util.*;
import java.util.stream.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        ArrayList<Expenses> arr = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            String expenseType = "";
            if (i == 0) {
                expenseType = "food";
            } else if (i == 1) {
                expenseType = "rent";
            } else if (i == 2) {
                expenseType = "shopping";
            } else if (i == 3) {
                expenseType = "groceries";
            } else if (i == 4) {
                expenseType = "electricity";
            }
            System.out.println("Enter expense for " + expenseType);
            Double cost = input.nextDouble();
            Expenses obj = new Expenses(expenseType, cost);
            arr.add(obj);
        }
        System.out.println("Enter salary");
        int salary = input.nextInt();

        ArrayList<Double> expenses = new ArrayList<>();
        for (Expenses e : arr) {
            expenses.add(e.getCost());
        }

        Double sum = expenses.stream().reduce(0.0, (e1, e2) -> e1 + e2);

        if (salary < sum) {
            System.out.println("Expenses exceeds Salary");
        } else {
            System.out.println("Savings amount will be Rs." + (salary - sum));
        }

        input.close();
    }
}
