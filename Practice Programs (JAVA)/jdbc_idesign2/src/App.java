
import java.io.*;
import java.sql.SQLException;
import java.util.ArrayList;

public class App {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the name of TravelClass :");
        String name = br.readLine();
        System.out.println("Enter the description to update :");
        String description = br.readLine();
        // fill your code here
        TravelClassDAO tcdaoObj = new TravelClassDAO();
        tcdaoObj.updateDetail(name, description);
        System.out.println("Updated List of Travel Classes");
        System.out.format("%-25s %s\n", "Name", "Description");
        ArrayList<TravelClass> aObj = tcdaoObj.listAllTravelClassess();
        for (TravelClass obj : aObj) {
            String name1 = obj.getName();
            String desc = obj.getDescription();
            System.out.format("%-25s %s\n", name1, desc);
        }
    }
}
