import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Soultion obj = new Soultion();
        Scanner input = new Scanner(System.in);
        String jewels = input.nextLine();
        String stones = input.nextLine();
        int count = obj.numJewelsInStones(jewels, stones);
        System.out.println(count);
        input.close();
    }
}
