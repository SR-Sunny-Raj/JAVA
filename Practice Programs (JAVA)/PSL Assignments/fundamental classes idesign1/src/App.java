import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the text from the document");
        String str1 = input.nextLine();
        System.out.println("Enter the string to be found in the data");
        String str2 = input.next().trim();
        if (str1.contains(str2)) {
            System.out.println("String is found in the document");
        } else {
            System.out.println("String is not found in the document");
        }
        input.close();
    }
}
