
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.sql.*;

public class UserDAO {

    public ArrayList<User> listUsers() throws Exception {
        ArrayList<User> userList = new ArrayList<User>();
        // fill your code here
        DBConnection dbObj = new DBConnection();
        Connection connection = dbObj.getConnection();
        Statement stmt = connection.createStatement();
        String query = "select * from \"user\"";
        ResultSet rs = stmt.executeQuery(query);
        while (rs.next()) {
            int id = rs.getInt(1);
            String name = rs.getString(2);
            String email = rs.getString(3);
            String password = rs.getString(4);
            int number = rs.getInt(5);
            String role = rs.getString(6);
            Date date = rs.getDate(7);
            String status = rs.getString(8);

            User uObj = new User(id, name, email, password, number, role, date, status);
            userList.add(uObj);
        }
        connection.close();
        return userList;
    }

    public void deleteUser(Integer id) throws Exception {
        // fill your code here
        DBConnection dbObj = new DBConnection();
        Connection connection = dbObj.getConnection();
        String query = "delete from \"user\" where id=?";
        PreparedStatement pstmt = connection.prepareStatement(query);
        pstmt.setInt(1, id);
        pstmt.executeUpdate();
        connection.close();
    }

}