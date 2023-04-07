
public class Airport {
    String iataAirportCode, name, city, country;

    public Airport() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Airport(String iataAirportCode, String name, String city, String country) {
        super();
        this.iataAirportCode = iataAirportCode;
        this.name = name;
        this.city = city;
        this.country = country;
    }

    public String getIataAirportCode() {
        return iataAirportCode;
    }

    public void setIataAirportCode(String iataAirportCode) {
        this.iataAirportCode = iataAirportCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

}
