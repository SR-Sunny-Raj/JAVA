import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int A1 = input.nextInt(), B1 = input.nextInt();
        long C1 = input.nextLong();
        int D1 = input.nextInt(), E1 = input.nextInt(), A2 = input.nextInt(), B2 = input.nextInt();
        long C2 = input.nextLong();
        int D2 = input.nextInt(), E2 = input.nextInt();
        double pcost = (E1 * 60) + (double) (((D1 * 60) / A1) * B1) + C1;
        double dcost = (E2 * 60) + (double) (((D2 * 60) / A2) * B2) + C2;
        if (pcost < dcost)
            System.out.print("petrol");
        else
            System.out.print("diesel");
        input.close();
    }
}
