import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        // fill your code here
        System.out.println("List of Books");
        System.out.println("Id    Title                Category             Author     Price");
        BookDAO bdaObj = new BookDAO();
        ArrayList<Book> aBook = bdaObj.listBooks();
        for (Book aB : aBook) {
            int id = aB.getId();
            String title = aB.getTitle();
            String category = aB.getCategory();
            String author = aB.getAuthor();
            double price = aB.getPrice();
            System.out.format("%-5s %-20s %-20s %-10s %s\n", id, title, category, author, price);
        }
    }
}
