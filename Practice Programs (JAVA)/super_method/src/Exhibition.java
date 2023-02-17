class Exhibition extends Event {
    private int noOfStall;

    Exhibition() {
        noOfStall = 0;
    }

    Exhibition(String str1, String str2, String str3, String str4, double d, int num) {
        super(str1, str2, str3, str4, d);
        noOfStall = num;
    }

    public void setNoOfStall(int num) {
        this.noOfStall = num;
    }

    public int getNoOfStall() {
        return noOfStall;
    }
}
