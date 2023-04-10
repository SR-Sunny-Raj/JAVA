public class Item {
    private String name;
    private String type;
    private int cost;
    private int availableQuantity;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    public void setAvailableQuantity(int availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    public int getAvailableQuantity() {
        return availableQuantity;
    }

    Item() {
    }

    Item(String name, String type, int cost, int availableQuantity) {
        this.name = name;
        this.type = type;
        this.cost = cost;
        this.availableQuantity = availableQuantity;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(name);
        builder.append(",");
        builder.append(type);
        builder.append(",");
        builder.append(cost);
        builder.append(",");

        if (availableQuantity == 0) {
            builder.append("Not Available");
        } else {
            builder.append("Available");
        }

        return builder.toString();
    }
}
