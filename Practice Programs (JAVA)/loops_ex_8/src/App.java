import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        String S = input.nextLine();
        for (int i = 0; i < S.length(); i++) {
            System.out.print(S.charAt(i) + " ");
        }
        input.close();
    }
}
