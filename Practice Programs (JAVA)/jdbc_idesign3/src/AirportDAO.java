
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.PreparedStatement;

public class AirportDAO {
    public void insertAirport(Airport airportIns) throws ClassNotFoundException, SQLException {

        // fill your code
        DBConnection dbObj = new DBConnection();
        Connection connection = dbObj.getConnection();
        String query = "insert into airport values(default,?,?,?,?)";

        PreparedStatement pstmt = connection.prepareStatement(query);
        pstmt.setString(1, airportIns.getIataAirportCode());
        pstmt.setString(2, airportIns.getName());
        pstmt.setString(3, airportIns.getCity());
        pstmt.setString(4, airportIns.getCountry());
        pstmt.executeUpdate();
        connection.close();
    }

    public ArrayList<Airport> listAirport() throws ClassNotFoundException, SQLException {
        ArrayList<Airport> arr = new ArrayList<Airport>();
        String query = "select * from   airport order by iata_airport_code asc";
        DBConnection dbObj = new DBConnection();
        Connection connection = dbObj.getConnection();
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        while (rs.next()) {
            String acode = rs.getString(2);
            String name = rs.getString(3);
            String city = rs.getString(4);
            String cname = rs.getString(5);
            Airport aobj = new Airport(acode, name, city, cname);
            arr.add(aobj);
        }
        connection.close();
        return arr;
        // fill your code
    }

}
