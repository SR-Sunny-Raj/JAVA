public class ExecutiveStall implements Stall {
    private String stallName, ownerName;
    private int cost, screen;

    ExecutiveStall() {
        stallName = "";
        ownerName = "";
        cost = 0;
        screen = 0;
    }

    ExecutiveStall(String stallName, int cost, String ownerName, int screen) {
        this.stallName = stallName;
        this.cost = cost;
        this.ownerName = ownerName;
        this.screen = screen;
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

    public void setScreen(int num) {
        this.screen = num;
    }

    public int getScreen() {
        return screen;
    }

    public void display() {
        System.out.println("Stall Name:" + stallName + "\nCost:" + cost + ".Rs\nOwner Name:" + ownerName
                + "\nNumber of Screens:" + screen);
    }
}
