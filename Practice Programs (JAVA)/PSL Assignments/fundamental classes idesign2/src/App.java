// import java.util.*;
// import java.io.BufferedReader;
// import java.io.InputStreamReader;

// public class App {
//     public static void main(String[] args) throws Exception {
//         Scanner input = new Scanner(System.in);
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         System.out.println("Enter the number of items:");
//         int n = input.nextInt();
//         System.out.println("Enter the item details in the format(Item Name$Item Type$Item Cost$Item Availability)");
//         ArrayList<Item> arr = new ArrayList<>();
//         for (int i = 0; i < n; i++) {
//             // String str = input.next();
//             String str = br.readLine().toString();
//             String[] srr = str.split("\\$");
//             Item obj = new Item(srr[0], srr[1], Integer.parseInt(srr[2]),
//                     Integer.parseInt(srr[3]));
//             arr.add(obj);
//         }
//         System.out.println("Items:");
//         for (Item i : arr) {
//             StringBuilder sb = new StringBuilder();
//             sb.append(i.getName() + ",");
//             sb.append(i.getType() + ",");
//             sb.append(i.getCost() + ",");
//             if (i.getAvailableQuantity() > 0) {
//                 sb.append("Available");
//             } else {
//                 sb.append("Not Available");
//             }
//             System.out.println(sb);
//         }

//         input.close();
//     }
// }

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number of items:");
        int noOfItems = Integer.parseInt(br.readLine());

        System.out.println("Enter the item details in the format(Item Name$Item Type$Item Cost$Item Availability");

        ArrayList<String> stringArr = new ArrayList<>();
        for (int i = 0; i < noOfItems; i++) {
            String input = br.readLine();
            stringArr.add(input);
        }

        System.out.println("Items:");
        for (String s : stringArr) {
            String[] input = s.split("\\$");
            Item item = new Item(input[0], input[1], Integer.parseInt(input[2]), Integer.parseInt(input[3]));
            System.out.println(item.toString());
        }
    }
}