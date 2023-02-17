import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Choose Stall Type\n1)Gold Stall\n2)Premium Stall\n3)Executive Stall");
        int type = input.nextInt();
        if (type == 1) {
            System.out.println(
                    "Enter Stall details in comma separated(Stall Name,Stall Cost,Owner Name,Number of TV sets)");
        } else if (type == 2) {
            System.out.println(
                    "Enter Stall details in comma separated(Stall Name,Stall Cost,Owner Name,Number of Projectors)");
        } else if (type == 3) {
            System.out.println(
                    "Enter Stall details in comma separated(Stall Name,Stall Cost,Owner Name,Number of Screens)");
        } else {
            System.out.println("Invalid Stall Type");
            System.exit(0);
        }
        input.nextLine();
        String str = input.nextLine();
        String[] arr = str.split(",");
        int cost = Integer.parseInt(arr[1]);
        int value = Integer.parseInt(arr[3]);
        if (type == 1) {
            GoldStall obj = new GoldStall(arr[0], cost, arr[2], value);
            obj.display();
        } else if (type == 2) {
            PremiumStall obj = new PremiumStall(arr[0], cost, arr[2], value);
            obj.display();
        } else if (type == 3) {
            ExecutiveStall obj = new ExecutiveStall(arr[0], cost, arr[2], value);
            obj.display();
        }
        input.close();
    }
}
