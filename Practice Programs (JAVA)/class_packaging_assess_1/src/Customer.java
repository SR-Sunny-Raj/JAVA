public class Customer implements Cloneable {
    private String name, id, country;

    Customer() {
        name = "";
        id = "";
        country = "";
    }

    Customer(String name, String id, String country) {
        this.name = name;
        this.id = id;
        this.country = country;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
