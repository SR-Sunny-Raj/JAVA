class Expenses {
    private String expenseType;
    private Double cost;

    Expenses() {
    }

    Expenses(String expenseType, Double cost) {
        // Fill your code here
        this.expenseType = expenseType;
        this.cost = cost;
    }

    public void setExpenseType(String expenseType) {
        this.expenseType = expenseType;
    }

    public String getExpenseType() {
        return this.expenseType;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Double getCost() {
        return this.cost;
    }
}
