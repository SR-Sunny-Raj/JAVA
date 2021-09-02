import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int R = input.nextInt();
        if(R<=50)
            System.out.println("100");
        else if (R <= 100) {
            System.out.println("50");
        } else {
            System.out.println("0");
        }
        input.close();
    }
}
