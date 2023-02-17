public class GoldStall implements Stall {
    private String stallName, ownerName;
    private int cost, tvSet;

    GoldStall() {
        stallName = "";
        ownerName = "";
        cost = 0;
        tvSet = 0;
    }

    GoldStall(String stallName, int cost, String ownerName, int tvSet) {
        this.stallName = stallName;
        this.cost = cost;
        this.ownerName = ownerName;
        this.tvSet = tvSet;
    }

    public void setStallName(String str) {
        this.stallName = str;
    }

    public String getStallName() {
        return stallName;
    }

    public void setOwnerName(String str) {
        this.ownerName = str;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setCost(int num) {
        this.cost = num;
    }

    public int getCost() {
        return cost;
    }

    public void setTvSet(int num) {
        this.tvSet = num;
    }

    public int getTvSet() {
        return tvSet;
    }

    public void display() {
        System.out.println("Stall Name:" + stallName + "\nCost:" + cost + ".Rs\nOwner Name:" + ownerName
                + "\nNumber of TV sets:" + tvSet);
    }
}
