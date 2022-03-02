import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int X = input.nextInt(), Y = input.nextInt();
        System.out.println((X - Y) + (Y / 2));
        input.close();
    }
}
