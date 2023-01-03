import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int R = input.nextInt();
        if (R < 51)
            System.out.println(100);
        else if (R < 101)
            System.out.println(50);
        else
            System.out.println(0);
        input.close();
    }
}
