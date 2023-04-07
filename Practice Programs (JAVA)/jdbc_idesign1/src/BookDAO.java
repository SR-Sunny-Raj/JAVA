import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class BookDAO {
    public ArrayList<Book> listBooks() throws ClassNotFoundException, SQLException {
        ArrayList<Book> bookList = new ArrayList<Book>();
        // fill your code here
        DBConnection conobj = new DBConnection();
        Connection connection = conobj.getConnection();
        Statement stmt = connection.createStatement();
        String query = "Select * from book";
        ResultSet rs = stmt.executeQuery(query);
        while (rs.next()) {
            int id = rs.getInt(1);
            String title = rs.getString(2);
            String category = rs.getString(3);
            String author = rs.getString(4);
            double price = rs.getDouble(5);
            Book bObj = new Book(id, title, category, author, price);
            bookList.add(bObj);
        }
        return bookList;
    }
}
