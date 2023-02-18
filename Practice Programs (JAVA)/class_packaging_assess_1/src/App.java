import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        Complaint[] comarr = new Complaint[100];
        Customer[] cusarr = new Customer[100];
        int count = 0, cuscount = 0;
        Customer obj = null;
        while (true) {
            // input.nextLine();
            System.out.println("Enter the customer name");
            String name = input.nextLine();
            if (!name.equals("")) {
                System.out.println("Enter the id");
                String id = input.nextLine();
                System.out.println("Enter the country");
                String country = input.nextLine();
                obj = new Customer(name, id, country);
                cusarr[cuscount++] = obj;

            } else {
                System.out.println("Same customer");
                obj = (Customer) ((Customer) (cusarr[cuscount - 1])).clone();
                cusarr[cuscount++] = obj;
            }
            System.out.println("Enter the complaint");
            String complaint = input.nextLine();
            System.out.println("Add another complaint ??");
            String desc = input.next();
            Complaint comobj = new Complaint(complaint, obj);
            comarr[count++] = comobj;
            if (desc.equals("yes")) {
                input.nextLine();
                continue;
            } else {
                // input.nextLine();
                break;
            }
        }
        System.out.println();
        System.out.println("Complaint Details");
        for (int i = 0; comarr[i] != null; i++) {
            comarr[i].display();
        }
        input.close();
    }
}
