class StageEvent extends Event {
    private int noOfSeats;

    StageEvent() {
        noOfSeats = 0;
    }

    StageEvent(String str1, String str2, String str3, String str4, double d, int num) {
        super(str1, str2, str3, str4, d);
        noOfSeats = num;
    }

    public void setNoOfSeats(int num) {
        this.noOfSeats = num;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }
}
