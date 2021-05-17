import java.util.Scanner;

public class App {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        String name = getName();
        int age = getAge();
        System.out.println("Name is -: " + name + "\nAge is -: " + age);

    }

    public static String getName() {
        System.out.print("Enter your name -: ");
        return input.nextLine();
    }

    public static int getAge() {
        System.out.print("Enter your age -: ");
        return input.nextInt();
    }
}
