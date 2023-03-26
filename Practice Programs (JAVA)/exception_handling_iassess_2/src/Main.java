import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        // Your code here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the user details");
        String str = input.nextLine();
        String[] arr = str.split(",");
        // for(int i=0;i<arr.length;i++){
        // System.out.println(arr[i]);
        // }
        try {
            User uObj = new User(arr[0], arr[1], arr[2], arr[3]);
            UserBO.validate(uObj);
            System.out.println(uObj.toString());
        } catch (WeakPasswordException e) {
            System.out.println(e);
        }
        input.close();
    }

}
