import java.util.*;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // fill your code here
        UserDAO uObj = new UserDAO();
        ArrayList<User> arr = uObj.listUsers();
        System.out.println("Before the Delete");
        System.out.format("%-15s %-15s %-15s %-15s %-15s %-15s %-15s %s\n", "Id", "Name", "Email", "Password", "Age",
                "Role", "CreatedDate", "Status");
        for (User obj : arr) {
            int id = obj.getId();
            String name = obj.getName();
            String email = obj.getEmail();
            String password = obj.getPassword();
            int age = obj.getAge();
            String role = obj.getRole();
            Date date = obj.getCreatedDate();
            String status = obj.getStatus();
            System.out.format("%-15s %-15s %-15s %-15s %-15s %-15s %-15s %s\n", id, name, email, password, age, role,
                    date, status);
        }

        System.out.println("Enter the Id :");
        Scanner input = new Scanner(System.in);
        int idu = input.nextInt();
        uObj.deleteUser(idu);
        System.out.println("After the Delete");
        System.out.format("%-15s %-15s %-15s %-15s %-15s %-15s %-15s %s\n", "Id", "Name", "Email", "Password", "Age",
                "Role", "CreatedDate", "Status");
        arr = uObj.listUsers();
        for (User obj : arr) {
            int id = obj.getId();
            String name = obj.getName();
            String email = obj.getEmail();
            String password = obj.getPassword();
            int age = obj.getAge();
            String role = obj.getRole();
            Date date = obj.getCreatedDate();
            String status = obj.getStatus();
            System.out.format("%-15s %-15s %-15s %-15s %-15s %-15s %-15s %s\n", id, name, email, password, age, role,
                    date, status);
        }
    }

}