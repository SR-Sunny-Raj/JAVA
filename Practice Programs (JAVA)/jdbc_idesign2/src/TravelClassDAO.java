
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class TravelClassDAO {
    public ArrayList<TravelClass> listAllTravelClassess() throws ClassNotFoundException, SQLException {

        ArrayList<TravelClass> travelClassList = new ArrayList<TravelClass>();
        DBConnection dbcObj = new DBConnection();
        Connection connection = dbcObj.getConnection();
        String query = "Select name,description from travel_class order by name desc";
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        while (rs.next()) {
            String name = rs.getString(1);
            String desc = rs.getString(2);
            TravelClass tcObj = new TravelClass(name, desc);
            travelClassList.add(tcObj);
        }
        connection.close();
        return travelClassList;
    }

    public void updateDetail(String name, String description) throws ClassNotFoundException, SQLException {
        DBConnection dbcObj1 = new DBConnection();
        Connection connection = dbcObj1.getConnection();
        String query = "update travel_class set description=? where name=?";
        PreparedStatement pstmt = connection.prepareStatement(query);
        pstmt.setString(1, description);
        pstmt.setString(2, name);
        pstmt.executeUpdate();
        connection.close();
    }
}
