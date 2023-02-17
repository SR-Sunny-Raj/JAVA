public class PremiumStall implements Stall {
    private String stallName, ownerName;
    private int cost, projector;

    PremiumStall() {
        stallName = "";
        ownerName = "";
        cost = 0;
        projector = 0;
    }

    PremiumStall(String stallName, int cost, String ownerName, int projector) {
        this.stallName = stallName;
        this.cost = cost;
        this.ownerName = ownerName;
        this.projector = projector;
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

    public void setProjector(int num) {
        this.projector = num;
    }

    public int getProjector() {
        return projector;
    }

    public void display() {
        System.out.println("Stall Name:" + stallName + "\nCost:" + cost + ".Rs\nOwner Name:" + ownerName
                + "\nNumber of Projectors:" + projector);
    }
}
