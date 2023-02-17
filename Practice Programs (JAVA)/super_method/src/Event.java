class Event {
    private String name;
    private String detail;
    private String type;
    private String ownerName;
    private double costPerDay;

    Event() {
        name = "";
        detail = "";
        type = "";
        ownerName = "";
        costPerDay = 0.0;
    }

    Event(String str1, String str2, String str3, String str4, double d) {
        name = str1;
        detail = str2;
        type = str3;
        ownerName = str4;
        costPerDay = d;
    }

    public void setName(String str) {
        this.name = str;
    }

    public String getName() {
        return name;
    }

    public void setDetail(String str) {
        this.detail = str;
    }

    public String getDetail() {
        return detail;
    }

    public void setType(String str) {
        this.type = str;
    }

    public String getType() {
        return type;
    }

    public void setOwnerName(String str) {
        this.ownerName = str;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setCostPerDay(double d) {
        this.costPerDay = d;
    }

    public double getCostPerDay() {
        return costPerDay;
    }
}
