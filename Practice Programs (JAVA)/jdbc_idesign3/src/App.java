
import java.io.*;
import java.util.ArrayList;

public class App {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String countryName, airportCode, airportName, city;
        System.out.println("Enter the Airport Code :");
        airportCode = br.readLine();
        System.out.println("Enter the Airport name :");
        airportName = br.readLine();
        System.out.println("Enter the City :");
        city = br.readLine();
        System.out.println("Enter the Country name :");
        countryName = br.readLine();
        AirportDAO obj = new AirportDAO();
        Airport aobj = new Airport(airportCode, airportName, city, countryName);
        obj.insertAirport(aobj);
        ArrayList<Airport> arr = obj.listAirport();
        System.out.format("%-10s %-40s %-10s %s\n", "IATA Code", "Name", "City", "Country");
        for (Airport obja : arr) {
            String var1 = obja.getIataAirportCode();
            String var2 = obja.getName();
            String var3 = obja.getCity();
            String var4 = obja.getCountry();
            System.out.format("%-10s %-40s %-10s %s\n", var1, var2, var3, var4);
        }
        // fill your code

    }
}
