import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        String S = input.nextLine();
        for (int i = S.length() - 1; i >= 0; i--) {
            System.out.print(S.charAt(i));
        }
        input.close();
    }
}
