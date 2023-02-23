import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // fill your code here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the product id");
        long var1 = input.nextLong();
        input.nextLine();
        System.out.println("Enter the product name");
        String str1 = input.nextLine();
        System.out.println("Enter the supplier name");
        String str2 = input.nextLine();

        Product obj = new Product(var1, str1, str2);
        System.out.println(obj.toString());
        System.out.println("Invoking getClass() method : " + obj.getClass());
        input.close();
    }

}
