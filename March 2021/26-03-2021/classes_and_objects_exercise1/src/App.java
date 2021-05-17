import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Rectangle[] r = new Rectangle[3];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.print("Do you want to enter the width and height of rectangle " + (i + 1) + " (y/n) -: ");
            char ch = input.next().charAt(0);
            if (ch == 'Y' || ch == 'y') {
                System.out.print("Enter the width and the height -: ");
                r[i] = new Rectangle(input.nextDouble(), input.nextDouble());
            } else
                r[i] = new Rectangle();
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("width and Height of Rectangle-" + (i + 1) + " are -: " + r[i].getWidth() + " , "
                    + r[i].getHeight());
        }
        input.close();
    }
}
